package co.com.carlos.quintero.pruebatecnica.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class numberResponse {
    List<Integer> numeros;
}
