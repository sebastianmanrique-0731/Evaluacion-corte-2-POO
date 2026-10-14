/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package modelo;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
    private List<Estudiante> listaEstudiantes;
    private List<Profesor> listaProfesores;

    public Colegio() {
        this.listaEstudiantes = new ArrayList<>();
        this.listaProfesores = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        listaEstudiantes.add(e);
    }

    public void agregarProfesor(Profesor p) {
        listaProfesores.add(p);
    }

    public String generarReporteEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            return "No hay estudiantes registrados.";
        }
        StringBuilder sb = new StringBuilder("=== REPORTE DE ESTUDIANTES ===\n\n");
        for (Estudiante e : listaEstudiantes) {
            sb.append(e.getInformacion()).append("\n------------------------------------------------\n");
        }
        return sb.toString();
    }

    public String generarReporteProfesores() {
        if (listaProfesores.isEmpty()) {
            return "No hay profesores registrados.";
        }
        StringBuilder sb = new StringBuilder("=== REPORTE DE PROFESORES ===\n\n");
        for (Profesor p : listaProfesores) {
            sb.append(p.getInformacion()).append("\n------------------------------------------------\n");
        }
        return sb.toString();
    }
}