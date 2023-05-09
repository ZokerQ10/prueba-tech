package co.com.carlos.quintero.pruebatecnica.rest;

import co.com.carlos.quintero.pruebatecnica.request.NumberRequest;
import co.com.carlos.quintero.pruebatecnica.response.numberResponse;
import co.com.carlos.quintero.pruebatecnica.service.PruebaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/number")
@RestController
public class NumberController {
    private final PruebaService numberService;

    public NumberController(PruebaService numberService) {
        this.numberService = numberService;
    }

    @PostMapping
    public numberResponse validateNumbers(@RequestBody NumberRequest request){
        return numberService.validarNumeros(request);
    }
}
