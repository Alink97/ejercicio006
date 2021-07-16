package es.cic.bootcamp.ejercicio006.coche;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheControllerTest {
	
	private CocheController cut;
	
	private CocheService dependencia;
	
	@BeforeEach
	void setUp() throws Exception {
		cut = new CocheController();
		dependencia = mock(CocheService.class);
		
		cut.setcService(dependencia);
	}

	@Test
	void testLeer() {
		when(dependencia.darBienvenida()).thenReturn("Bienvenida");
		
		String resultado = cut.darBienvenida();
		assertEquals(CocheService.MENSAJE_BIENVENIDA, resultado, "El mensaje de bienvenida no es correcto");
		
		verify(dependencia, times(1)).darBienvenida();
	}

	@Test
	void testAdios() {
		when(dependencia.despedir()).thenReturn("despedida");
		
		String resultado = cut.despedir();
		assertEquals(CocheService.MENSAJE_PARTIDA, resultado, "El mensaje de partida no es correcto");
		verify(dependencia, times(1)).despedir();
	}

}
