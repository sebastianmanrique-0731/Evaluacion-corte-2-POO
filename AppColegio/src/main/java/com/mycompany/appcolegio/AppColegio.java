/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appcolegio;

/**
 *
 * @author sebas
 */

import controlador.ControladorColegio;
import modelo.Colegio;
import vista.FrmPrincipal;

public class AppColegio {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            // 1. Instanciar la vista y el modelo sin parámetros
            FrmPrincipal vista = new FrmPrincipal();
            Colegio colegio = new Colegio();
            
            // 2. El controlador conecta la vista y el modelo
            new ControladorColegio(vista, colegio);
            
            // 3. Centrar y hacer visible la ventana
            vista.setLocationRelativeTo(null);
            vista.setVisible(true);
        });
    }
}
// NOTA: Se descartó la versión generada por el diseñador visual (GUI Builder) de NetBeans
// debido a que generaba conflicto con variables duplicadas en los componentes (JLabel y JTextField),
// además de crear Listeners automáticos en la Vista que violaban la arquitectura MVC.
// Se implementa la interfaz de manera limpia garantizando desacoplamiento total con ControladorColegio.