/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import modelo.Colegio;
import modelo.Estudiante;
import modelo.Profesor;
import vista.FrmPrincipal;

public class ControladorColegio implements ActionListener {
    private FrmPrincipal vista;
    private Colegio modelo;

    public ControladorColegio(FrmPrincipal vista, Colegio modelo) {
        this.vista = vista;
        this.modelo = modelo;

        // Asignar listeners a los botones de la vista
        this.vista.getBtnRegistrarEstudiante().addActionListener(this);
        this.vista.getBtnRegistrarProfesor().addActionListener(this);
        this.vista.getBtnReporteEstudiantes().addActionListener(this);
        this.vista.getBtnReporteProfesores().addActionListener(this);
        this.vista.getBtnImprimir().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == vista.getBtnRegistrarEstudiante()) {
            registrarEstudiante();
        } else if (source == vista.getBtnRegistrarProfesor()) {
            registrarProfesor();
        } else if (source == vista.getBtnReporteEstudiantes()) {
            vista.mostrarReporte(modelo.generarReporteEstudiantes());
        } else if (source == vista.getBtnReporteProfesores()) {
            vista.mostrarReporte(modelo.generarReporteProfesores());
        } else if (source == vista.getBtnImprimir()) {
            imprimir();
        }
    }

    private void registrarEstudiante() {
        try {
            String nombre = vista.getNombre();
            String direccion = vista.getDireccion();
            String telefono = vista.getTelefono();
            String fechaNac = vista.getFechaNacimiento();
            String codigo = vista.getCodigo();
            String grado = vista.getGrado();

            if (nombre.isEmpty() || codigo.isEmpty()) {
                vista.mostrarMensaje("Por favor complete los campos obligatorios (Nombre y Código).");
                return;
            }

            Estudiante est = new Estudiante(nombre, direccion, telefono, fechaNac, codigo, grado);
            modelo.agregarEstudiante(est);
            vista.mostrarMensaje("Estudiante registrado exitosamente.");
            vista.limpiarCampos();
        } catch (Exception ex) {
            vista.mostrarMensaje("Error al registrar estudiante: " + ex.getMessage());
        }
    }

    private void registrarProfesor() {
        try {
            String nombre = vista.getNombre();
            String direccion = vista.getDireccion();
            String telefono = vista.getTelefono();
            String fechaNac = vista.getFechaNacimiento();
            String cedula = vista.getCedula();
            String area = vista.getArea();
            
            double salarioHora = Double.parseDouble(vista.getSalarioHora());
            int horas = Integer.parseInt(vista.getHoras());

            if (nombre.isEmpty() || cedula.isEmpty()) {
                vista.mostrarMensaje("Por favor complete los campos obligatorios (Nombre y Cédula).");
                return;
            }

            Profesor prof = new Profesor(nombre, direccion, telefono, fechaNac, cedula, area, salarioHora, horas);
            modelo.agregarProfesor(prof);
            vista.mostrarMensaje("Profesor registrado exitosamente.");
            vista.limpiarCampos();
        } catch (NumberFormatException ex) {
            vista.mostrarMensaje("Verifique que Salario por hora y Horas sean valores numéricos.");
        } catch (Exception ex) {
            vista.mostrarMensaje("Error al registrar profesor: " + ex.getMessage());
        }
    }

    private void imprimir() {
        try {
            vista.imprimirReporte();
        } catch (PrinterException ex) {
            vista.mostrarMensaje("Error al imprimir el reporte: " + ex.getMessage());
        }
    }
}