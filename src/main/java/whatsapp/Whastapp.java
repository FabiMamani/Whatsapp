package whatsapp;

import interfaces.MedioComunicacion;

import javax.swing.*;
import java.awt.*;

public class Whastapp implements MedioComunicacion {

    private JPanel panel;
    private JComboBox<String> numerosCombo;

    public Whastapp() {
        panel = new JPanel(new GridLayout(2, 1));
        panel.setBorder(BorderFactory.createTitledBorder("Whastapp"));
        panel.add(new JLabel("Seleccione un número de teléfono:"));

        // Lista de correos (puede venir de un archivo o base de datos)
        String[] numeros = {
                "1155223698",
                "3999251287"
        };

        numerosCombo = new JComboBox<>(numeros);
        panel.add(numerosCombo);
    }

    @Override
    public JPanel obtenerPanel() {
        return panel;
    }

    @Override
    public String obtenerDato() {
        return (String) numerosCombo.getSelectedItem();
    }

    @Override
    public void enviarComunicacion(String estacion) {
        System.out.println(obtenerDato());
        //String msj = "Demora reportada en estación " + estacion;
        String msj = "Usuario: " + obtenerDato() +"\nDemora reportada en estación:" + estacion;

        JOptionPane.showMessageDialog(null, msj, "Notificación", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String obtenerNombre() {
        return "Whatsapp";
    }


    public void actualizar(String s) {
        System.out.println("Actualizando Whastapp");
    }
}
