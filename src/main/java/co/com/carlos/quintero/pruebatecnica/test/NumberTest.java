package co.com.carlos.quintero.pruebatecnica.test;


import co.com.carlos.quintero.pruebatecnica.model.numberArrayRecord;
import co.com.carlos.quintero.pruebatecnica.repository.numberArrayRepository;
import co.com.carlos.quintero.pruebatecnica.request.NumberRequest;
import co.com.carlos.quintero.pruebatecnica.response.numberResponse;
import co.com.carlos.quintero.pruebatecnica.service.PruebaService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class NumberTest {


    @Mock
    private numberArrayRepository umberArrayRepository;

    @InjectMocks
    private PruebaService pruebaService;

    @Test
    public void validarNumerosTest() {
        NumberRequest request = new NumberRequest();
        request.setNumeros(new int[] { 1, 2, 3, 4, 5 });
        Mockito.when(umberArrayRepository.save(any(numberArrayRecord.class))).thenReturn(new numberArrayRecord());
        numberResponse response = pruebaService.validarNumeros(request);
        assertNotNull(response);
        assertNotNull(response.getNumeros());
        assertEquals(5, response.getNumeros().size());
    }

    @Test
    public void numberArrayTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        pruebaService.numberArray();
        String expectedOutput = "83,27,94,40,29,60,25,69,51,68,66,46,9,19,56,30,49,44,74,18,2,53,75,32,26,55,70,71,28,35,48,43,12,50,82,14,16,95,90,79,36,33,24,57,3,41,89,65,7,85,81,31,8,76,42,80,13,38,77,61,23,72,54,21,37,98,92,11,97,59,78,62,17,58,64,1,20,99,45,6,93,15,87,10,88,4,73,22,67,52,39,96,63,34,86,5,91,47,0,84,52,";
        assertEquals(expectedOutput, outContent.toString());
    }
}
