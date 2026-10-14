/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

public class Profesor extends Persona {

    private String materia;
    private double salario;

    public Profesor(String nombre, String documento, int edad, String materia, double salario) {
        super(nombre, documento, edad);
        this.materia = materia;
        this.salario = salario;
    }

    public String getMateria() { return materia; }
    public double getSalario() { return salario; }

    @Override
    public String toString() {
        return "[Profesor] " + super.toString() + " | Materia: " + materia + " | Salario: " + salario;
    }
}
