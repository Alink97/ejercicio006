package es.cic.bootcamp.ejercicio006.coche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CocheController {
	@Autowired
	private CocheService cService;
	
	@GetMapping("/entrada")
	public String darBienvenida() {
		return cService.MENSAJE_BIENVENIDA;
	}
	
	@GetMapping("/salida")
	public String despedir() {
		return cService.MENSAJE_PARTIDA;
	}

	public CocheService getcService() {
		return cService;
	}

	public void setcService(CocheService cService) {
		this.cService = cService;
	}
}
