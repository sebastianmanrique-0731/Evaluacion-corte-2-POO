/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 *
 * @author sebas
 */
class ColegioTest {

    private Colegio colegio;

    @BeforeEach
    void setUp() {
        colegio = new Colegio();   // se crea uno nuevo antes de cada test
    }

    @Test
    void reporteEstudiantesVacio() {
        assertEquals("No hay estudiantes registrados.", colegio.generarReporteEstudiantes());
    }

    @Test
    void reporteProfesoresVacio() {
        assertEquals("No hay profesores registrados.", colegio.generarReporteProfesores());
    }

    @Test
    void agregarEstudianteApareceEnElReporte() {
        colegio.agregarEstudiante(new Estudiante("Ana", "Calle 1", "300", "2010-05-10", "E001", "5A"));

        String reporte = colegio.generarReporteEstudiantes();

        assertTrue(reporte.contains("=== REPORTE DE ESTUDIANTES ==="));
        assertTrue(reporte.contains("Ana"));
        assertTrue(reporte.contains("E001"));
    }

    @Test
    void agregarProfesorApareceEnElReporte() {
        colegio.agregarProfesor(new Profesor("Luis", "Calle 2", "310", "1980-03-15",
                                             "12345", "Matemáticas", 20000, 10));

        String reporte = colegio.generarReporteProfesores();

        assertTrue(reporte.contains("=== REPORTE DE PROFESORES ==="));
        assertTrue(reporte.contains("Luis"));
        assertTrue(reporte.contains("12345"));
    }

    @Test
    void variosEstudiantesAparecenTodosEnElReporte() {
        colegio.agregarEstudiante(new Estudiante("Ana", "Calle 1", "300", "2010-05-10", "E001", "5A"));
        colegio.agregarEstudiante(new Estudiante("Pedro", "Calle 3", "301", "2011-01-20", "E002", "4B"));

        String reporte = colegio.generarReporteEstudiantes();

        assertTrue(reporte.contains("Ana"));
        assertTrue(reporte.contains("Pedro"));
    }

    @Test
    void agregarProfesorNoAfectaElReporteDeEstudiantes() {
        colegio.agregarProfesor(new Profesor("Luis", "Calle 2", "310", "1980-03-15",
                                             "12345", "Matemáticas", 20000, 10));

        assertEquals("No hay estudiantes registrados.", colegio.generarReporteEstudiantes());
    }
}