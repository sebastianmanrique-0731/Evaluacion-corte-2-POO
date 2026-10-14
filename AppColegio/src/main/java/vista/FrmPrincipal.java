/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import java.awt.*;
import java.awt.print.PrinterException;
import javax.swing.*;
/**
 *
 * @author sebas
 */
public class FrmPrincipal extends JFrame {

    // Componentes - Datos comunes
    private JTextField txtNombre;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JTextField txtFechaNacimiento;

    // Componentes - Estudiante
    private JTextField txtCodigo;
    private JTextField txtGrado;
    private JButton btnRegistrarEstudiante;

    // Componentes - Profesor
    private JTextField txtCedula;
    private JTextField txtArea;
    private JTextField txtSalarioHora;
    private JTextField txtHoras;
    private JButton btnRegistrarProfesor;

    // Componentes - Botones reporte e impresión
    private JButton btnReporteEstudiantes;
    private JButton btnReporteProfesores;
    private JButton btnImprimir;

    // Área de reporte
    private JTextArea txtReporte;

    public FrmPrincipal() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Gestión Colegio - AppColegio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Panel Principal
        JPanel panelContenido = new JPanel();
        panelContenido.setLayout(new BoxLayout(panelContenido, BoxLayout.Y_AXIS));
        panelContenido.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // 1. Datos comunes (Arriba)
        JPanel panelComunes = new JPanel(new GridLayout(2, 4, 5, 5));
        panelComunes.add(new JLabel("Nombre:"));
        panelComunes.add(new JLabel("Dirección:"));
        panelComunes.add(new JLabel("Teléfono:"));
        panelComunes.add(new JLabel("Fecha nac. (yyyy-MM-dd):"));

        txtNombre = new JTextField();
        txtDireccion = new JTextField();
        txtTelefono = new JTextField();
        txtFechaNacimiento = new JTextField();

        panelComunes.add(txtNombre);
        panelComunes.add(txtDireccion);
        panelComunes.add(txtTelefono);
        panelComunes.add(txtFechaNacimiento);

        panelContenido.add(panelComunes);
        panelContenido.add(Box.createVerticalStrut(10));

        // 2. Grupos en medio (Estudiante y Profesor)
        JPanel panelCentral = new JPanel(new GridLayout(1, 2, 10, 10));

        // Panel Estudiante
        JPanel panelEstudiante = new JPanel(new GridBagLayout());
        panelEstudiante.setBorder(BorderFactory.createTitledBorder("Estudiante"));
        GridBagConstraints gbcE = new GridBagConstraints();
        gbcE.insets = new Insets(4, 4, 4, 4);
        gbcE.fill = GridBagConstraints.HORIZONTAL;

        gbcE.gridx = 0; gbcE.gridy = 0; panelEstudiante.add(new JLabel("Código:"), gbcE);
        gbcE.gridx = 1; txtCodigo = new JTextField(10); panelEstudiante.add(txtCodigo, gbcE);

        gbcE.gridx = 0; gbcE.gridy = 1; panelEstudiante.add(new JLabel("Grado:"), gbcE);
        gbcE.gridx = 1; txtGrado = new JTextField(10); panelEstudiante.add(txtGrado, gbcE);

        gbcE.gridx = 0; gbcE.gridy = 2; gbcE.gridwidth = 2;
        btnRegistrarEstudiante = new JButton("Registrar Estudiante");
        panelEstudiante.add(btnRegistrarEstudiante, gbcE);

        // Panel Profesor
        JPanel panelProfesor = new JPanel(new GridBagLayout());
        panelProfesor.setBorder(BorderFactory.createTitledBorder("Profesor"));
        GridBagConstraints gbcP = new GridBagConstraints();
        gbcP.insets = new Insets(4, 4, 4, 4);
        gbcP.fill = GridBagConstraints.HORIZONTAL;

        gbcP.gridx = 0; gbcP.gridy = 0; panelProfesor.add(new JLabel("Cédula:"), gbcP);
        gbcP.gridx = 1; txtCedula = new JTextField(10); panelProfesor.add(txtCedula, gbcP);

        gbcP.gridx = 0; gbcP.gridy = 1; panelProfesor.add(new JLabel("Área:"), gbcP);
        gbcP.gridx = 1; txtArea = new JTextField(10); panelProfesor.add(txtArea, gbcP);

        gbcP.gridx = 0; gbcP.gridy = 2; panelProfesor.add(new JLabel("Salario por hora:"), gbcP);
        gbcP.gridx = 1; txtSalarioHora = new JTextField(10); panelProfesor.add(txtSalarioHora, gbcP);

        gbcP.gridx = 0; gbcP.gridy = 3; panelProfesor.add(new JLabel("Horas:"), gbcP);
        gbcP.gridx = 1; txtHoras = new JTextField(10); panelProfesor.add(txtHoras, gbcP);

        gbcP.gridx = 0; gbcP.gridy = 4; gbcP.gridwidth = 2;
        btnRegistrarProfesor = new JButton("Registrar Profesor");
        panelProfesor.add(btnRegistrarProfesor, gbcP);

        panelCentral.add(panelEstudiante);
        panelCentral.add(panelProfesor);

        panelContenido.add(panelCentral);
        panelContenido.add(Box.createVerticalStrut(10));

        // 3. Botones reporte e imprimir (Abajo)
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        btnReporteEstudiantes = new JButton("Reporte Estudiantes");
        btnReporteProfesores = new JButton("Reporte Profesores");
        btnImprimir = new JButton("Imprimir");

        panelBotones.add(btnReporteEstudiantes);
        panelBotones.add(btnReporteProfesores);
        panelBotones.add(btnImprimir);

        panelContenido.add(panelBotones);
        panelContenido.add(Box.createVerticalStrut(10));

        // 4. Área de texto con Scroll (Al final)
        txtReporte = new JTextArea(8, 40);
        txtReporte.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtReporte);

        panelContenido.add(scrollPane);

        add(panelContenido, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }

    // ----- Getters de datos -----
    public String getNombre() { return txtNombre.getText().trim(); }
    public String getDireccion() { return txtDireccion.getText().trim(); }
    public String getTelefono() { return txtTelefono.getText().trim(); }
    public String getFechaNacimiento() { return txtFechaNacimiento.getText().trim(); }
    public String getCodigo() { return txtCodigo.getText().trim(); }
    public String getGrado() { return txtGrado.getText().trim(); }
    public String getCedula() { return txtCedula.getText().trim(); }
    public String getArea() { return txtArea.getText().trim(); }
    public String getSalarioHora() { return txtSalarioHora.getText().trim(); }
    public String getHoras() { return txtHoras.getText().trim(); }

    // ----- Getters de botones -----
    public JButton getBtnRegistrarEstudiante() { return btnRegistrarEstudiante; }
    public JButton getBtnRegistrarProfesor() { return btnRegistrarProfesor; }
    public JButton getBtnReporteEstudiantes() { return btnReporteEstudiantes; }
    public JButton getBtnReporteProfesores() { return btnReporteProfesores; }
    public JButton getBtnImprimir() { return btnImprimir; }

    // ----- Métodos de la vista -----
    public void mostrarReporte(String texto) {
        txtReporte.setText(texto);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void imprimirReporte() throws PrinterException {
        txtReporte.print();
    }

    public void limpiarCampos() {
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtFechaNacimiento.setText("");
        txtCodigo.setText("");
        txtGrado.setText("");
        txtCedula.setText("");
        txtArea.setText("");
        txtSalarioHora.setText("");
        txtHoras.setText("");
    }
}
