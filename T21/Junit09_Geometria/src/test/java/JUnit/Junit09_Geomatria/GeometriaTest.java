package JUnit.Junit09_Geomatria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	Geometria geo = new Geometria();
	
	@Test
	void testInitDefault() {
		Geometria g = new Geometria();
		assertEquals("Default", g.getNom());
		assertEquals(9, g.getId());
		assertEquals(0.0, g.getArea());
	}
	
	@Test
	void testInitCases() {
		String[] figuras = {"Default", "cuadrado", "Circulo", "Triangulo", "Rectangulo", "Pentagono", "Rombo", "Romboide", "Trapecio"};
		for (int i = 0; i <= 8; i++) {
			Geometria g = new Geometria(i);
			assertEquals(figuras[i], g.getNom());
			assertEquals(i, g.getId());
			assertEquals(0.0, g.getArea());
		}
	}
	
	@Test
	void testSet() {
		geo.setId(10);
		assertEquals(10, geo.getId());
		geo.setNom("Hexagono");
		assertEquals("Hexagono", geo.getNom());
		geo.setArea(1.23);
		assertEquals(1.23, geo.getArea());
	}
	
	@Test
	void testAreas() {
		assertEquals(100, geo.areacuadrado(10));
		assertEquals(314.1592, geo.areaCirculo(10), 0.1);
		assertEquals(50, geo.areatriangulo(10,10));
		assertEquals(100, geo.arearectangulo(10,10));
		assertEquals(50, geo.areapentagono(10,10));
		assertEquals(50, geo.arearombo(10,10));
		assertEquals(100, geo.arearomboide(10,10));
		assertEquals(90, geo.areatrapecio(10,8,10));
	}
	
	@Test
	void testString() {
		Geometria g = new Geometria(1);
		g.setArea(g.areacuadrado(2));
		assertEquals("Geometria [id=1, nom=cuadrado, area=4.0]", g.toString());
	}

}
