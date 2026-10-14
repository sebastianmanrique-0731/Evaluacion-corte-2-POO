/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package modelo;

public class Estudiante extends Persona {
    private String codigo;
    private String grado;

    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento, String codigo, String grado) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.grado = grado;
    }

    public String getCodigo() { return codigo; }
    public String getGrado() { return grado; }

    @Override
    public String getInformacion() {
        return "ESTUDIANTE -> Código: " + codigo + " | Nombre: " + nombre + 
               " | Grado: " + grado + " | Tel: " + telefono + 
               " | Dir: " + direccion + " | F. Nac: " + fechaNacimiento;
    }
}