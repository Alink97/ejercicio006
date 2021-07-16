package es.cic.bootcamp.ejercicio006.coche;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheServiceTest {
	
	private CocheService cut;
	
	@BeforeEach
	void setUp() throws Exception {
		this.cut = new CocheService();
	}

	@Test
	void testDarBienvenida() {
		String resutlado = cut.darBienvenida();
		
		
	}
	
	@Test
	void testDespedir() {
		String resultado = cut.despedir();
		
		
	}

}
