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
class EstudianteTest {

    @Test
    void constructorYGettersGuardanLosDatos() {
        Estudiante e = new Estudiante("Ana", "Calle 1", "3001234567", "2010-05-10", "E001", "5A");

        assertEquals("Ana", e.getNombre());
        assertEquals("Calle 1", e.getDireccion());
        assertEquals("3001234567", e.getTelefono());
        assertEquals("2010-05-10", e.getFechaNacimiento());
        assertEquals("E001", e.getCodigo());
        assertEquals("5A", e.getGrado());
    }

    @Test
    void getInformacionContieneLosDatosDelEstudiante() {
        Estudiante e = new Estudiante("Ana", "Calle 1", "3001234567", "2010-05-10", "E001", "5A");

        String info = e.getInformacion();

        assertTrue(info.startsWith("ESTUDIANTE"));
        assertTrue(info.contains("E001"));
        assertTrue(info.contains("Ana"));
        assertTrue(info.contains("5A"));
    }

    @Test
    void estudianteEsUnaPersona() {
        Estudiante e = new Estudiante("Ana", "Calle 1", "300", "2010-05-10", "E001", "5A");
        assertInstanceOf(Persona.class, e);
    }
}
