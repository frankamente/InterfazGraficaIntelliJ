import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class ClaseGrafica {

    public static void main(String... frankamente){
        JFrame ventana = new JFrame("Mi primera ventana Swing");
        ventana.setSize(300,200);
        ventana.setVisible(true);

        JPanel panel = new JPanel();

        JButton botonEntrar = new JButton("Entrar");
        panel.add(botonEntrar);

        JButton botonSalir = new JButton("Salir");
        panel.add(botonSalir);

        ventana.add(panel);

        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        botonEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("HOLA");
            }
        });

        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ventana.dispatchEvent(new WindowEvent(ventana,WindowEvent.WINDOW_CLOSING));
            }
        });

    }
}
