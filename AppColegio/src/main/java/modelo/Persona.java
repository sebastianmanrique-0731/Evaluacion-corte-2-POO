/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package modelo;

public class Persona {

    private String nombre;
    private String documento;
    private int edad;

    public Persona(String nombre, String documento, int edad) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }
    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Documento: " + documento + " | Edad: " + edad;
    }
}