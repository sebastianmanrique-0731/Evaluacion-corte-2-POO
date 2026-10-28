/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/**
 *
 * @author sebas
 */
class ProfesorTest {

    @Test
    void constructorYGettersGuardanLosDatos() {
        Profesor p = new Profesor("Luis", "Calle 2", "3109876543", "1980-03-15",
                                  "12345", "Matemáticas", 20000, 10);

        assertEquals("Luis", p.getNombre());
        assertEquals("12345", p.getCedula());
        assertEquals("Matemáticas", p.getArea());
        assertEquals(20000, p.getSalarioHora(), 0.001);
        assertEquals(10, p.getHoras());
    }

    @Test
    void calcularSueldoMultiplicaSalarioPorHoras() {
        Profesor p = new Profesor("Luis", "Calle 2", "310", "1980-03-15",
                                  "12345", "Matemáticas", 20000, 10);

        assertEquals(200000.0, p.calcularSueldo(), 0.001);
    }

    @Test
    void calcularSueldoConCeroHorasEsCero() {
        Profesor p = new Profesor("Luis", "Calle 2", "310", "1980-03-15",
                                  "12345", "Matemáticas", 20000, 0);

        assertEquals(0.0, p.calcularSueldo(), 0.001);
    }

    @Test
    void getInformacionIncluyeElSueldoTotal() {
        Profesor p = new Profesor("Luis", "Calle 2", "310", "1980-03-15",
                                  "12345", "Matemáticas", 20000, 10);

        String info = p.getInformacion();

        assertTrue(info.startsWith("PROFESOR"));
        assertTrue(info.contains("12345"));
        assertTrue(info.contains("Matemáticas"));
        assertTrue(info.contains("200000.0"));
    }
}
