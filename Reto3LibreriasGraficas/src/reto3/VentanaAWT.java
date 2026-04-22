package reto3;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaAWT extends Frame {

    public VentanaAWT() {
        setTitle("Ejemplo AWT");
        setSize(400, 300);
        setLayout(new FlowLayout());

        Label etiqueta = new Label("Ejemplo AWT");
        Button boton = new Button("Aceptar");
        TextField campoTexto = new TextField("Escribe aquí", 20);
        Checkbox casilla = new Checkbox("Opción 1");
        Choice lista = new Choice();

        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");

        add(etiqueta);
        add(boton);
        add(campoTexto);
        add(casilla);
        add(lista);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaAWT();
    }
}
