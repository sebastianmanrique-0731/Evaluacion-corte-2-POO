/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

public class Profesor extends Persona {
    private String cedula;
    private String area;
    private double salarioHora;
    private int horas;

    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento, 
                    String cedula, String area, double salarioHora, int horas) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horas = horas;
    }

    public String getCedula() { return cedula; }
    public String getArea() { return area; }
    public double getSalarioHora() { return salarioHora; }
    public int getHoras() { return horas; }

    public double calcularSueldo() {
        return salarioHora * horas;
    }

    @Override
    public String getInformacion() {
        return "PROFESOR -> Cédula: " + cedula + " | Nombre: " + nombre + 
               " | Área: " + area + " | Sueldo Total: $" + calcularSueldo() + 
               " | Tel: " + telefono + " | Dir: " + direccion + " | F. Nac: " + fechaNacimiento;
    }
}