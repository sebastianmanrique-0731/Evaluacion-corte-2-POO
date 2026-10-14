/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package modelo;

import java.util.ArrayList;

public class Colegio {

    private String nombre;
    private ArrayList<Persona> personas;

    public Colegio(String nombre) {
        this.nombre = nombre;
        this.personas = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public ArrayList<Persona> getPersonas() { return personas; }

    public void agregarPersona(Persona p) {
        personas.add(p);
    }

    public Persona buscarPorDocumento(String documento) {
        for (Persona p : personas) {
            if (p.getDocumento().equals(documento)) {
                return p;
            }
        }
        return null;
    }

    public int contarEstudiantes() {
        int total = 0;
        for (Persona p : personas) {
            if (p instanceof Estudiante) {
                total++;
            }
        }
        return total;
    }

    public int contarProfesores() {
        int total = 0;
        for (Persona p : personas) {
            if (p instanceof Profesor) {
                total++;
            }
        }
        return total;
    }
}
