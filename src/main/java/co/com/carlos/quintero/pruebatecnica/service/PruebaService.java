package co.com.carlos.quintero.pruebatecnica.service;

import co.com.carlos.quintero.pruebatecnica.mapper.numberMapper;
import co.com.carlos.quintero.pruebatecnica.repository.numberArrayRepository;
import co.com.carlos.quintero.pruebatecnica.request.NumberRequest;
import co.com.carlos.quintero.pruebatecnica.response.numberResponse;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
@Slf4j
public class PruebaService {

    private final numberArrayRepository numberArrayRepository;

    public PruebaService(numberArrayRepository numberArrayRepository) {
        this.numberArrayRepository = numberArrayRepository;
    }


    public numberResponse validarNumeros(NumberRequest input) {
        log.info("validarNumeros: {}", input.toString()); // log del request qeu ingresa desde la api
        Set<Integer> numerosSet = new HashSet<>();
        numberResponse response = new numberResponse();
        for (int numero : input.getNumeros()) {
            numerosSet.add(numero);
        }
        Integer[] numerberIsNotRepeat = new Integer[numerosSet.size()];
        int i = 0;
        for (int numero : numerosSet) {
            numerberIsNotRepeat[i] = numero;
            i++;
        }
        List<Integer> numberList = Arrays.asList(numerberIsNotRepeat);
        numberArrayRepository.save(numberMapper.mapToResponse(numberList));
        response.setNumeros(numberList);
        return response;
    }

    @PostConstruct
    public static void numberArray(){
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int j = rand.nextInt(100 - i) + i;
            int temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
            System.out.print(numeros[i] + ",");
        }
    }
}
