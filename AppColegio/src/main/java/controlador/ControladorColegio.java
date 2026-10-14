/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package controlador;

import modelo.Colegio;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;

public class ControladorColegio {

    private Colegio colegio;

    public ControladorColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public String registrarEstudiante(String nombre, String documento, int edad,
                                      String grado, double promedio) {
        if (colegio.buscarPorDocumento(documento) != null) {
            return "Ya existe una persona con ese documento.";
        }
        colegio.agregarPersona(new Estudiante(nombre, documento, edad, grado, promedio));
        return "Estudiante registrado correctamente.";
    }

    public String registrarProfesor(String nombre, String documento, int edad,
                                    String materia, double salario) {
        if (colegio.buscarPorDocumento(documento) != null) {
            return "Ya existe una persona con ese documento.";
        }
        colegio.agregarPersona(new Profesor(nombre, documento, edad, materia, salario));
        return "Profesor registrado correctamente.";
    }

    public String buscar(String documento) {
        Persona p = colegio.buscarPorDocumento(documento);
        if (p == null) {
            return "No se encontró ninguna persona con ese documento.";
        }
        return p.toString();
    }

    public String listar() {
        if (colegio.getPersonas().isEmpty()) {
            return "No hay personas registradas.";
        }
        StringBuilder sb = new StringBuilder();
        for (Persona p : colegio.getPersonas()) {
            sb.append(p.toString()).append("\n");
        }
        sb.append("\nEstudiantes: ").append(colegio.contarEstudiantes());
        sb.append(" | Profesores: ").append(colegio.contarProfesores());
        return sb.toString();
    }
}
