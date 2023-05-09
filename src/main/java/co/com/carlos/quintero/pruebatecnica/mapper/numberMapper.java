package co.com.carlos.quintero.pruebatecnica.mapper;

import co.com.carlos.quintero.pruebatecnica.model.numberArrayRecord;
import co.com.carlos.quintero.pruebatecnica.response.numberResponse;

import java.util.List;

public class numberMapper {

    public static numberArrayRecord mapToResponse(List<Integer> numeros) {
        numberArrayRecord record = new numberArrayRecord();
        record.setNumeros(numeros);
        return record;
    }
}
