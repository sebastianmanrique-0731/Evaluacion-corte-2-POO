/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package modelo;

public class Estudiante extends Persona {

    private String grado;
    private double promedio;

    public Estudiante(String nombre, String documento, int edad, String grado, double promedio) {
        super(nombre, documento, edad);
        this.grado = grado;
        this.promedio = promedio;
    }

    public String getGrado() { return grado; }
    public double getPromedio() { return promedio; }

    @Override
    public String toString() {
        return "[Estudiante] " + super.toString() + " | Grado: " + grado + " | Promedio: " + promedio;
    }
}
