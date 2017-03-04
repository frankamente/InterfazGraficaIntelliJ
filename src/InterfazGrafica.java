import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InterfazGrafica  extends JFrame{

    public InterfazGrafica(){
        setTitle("Primer Swing modificado");
        setSize(350,350);
        addMouseListener(new manejadorMouse());
        addWindowListener(new WindowAdapter() {
            public void windowsClosing(WindowEvent event){
                System.out.println("Cerrando ventana...");
                System.exit(0);
            }

        });
        //Obtengo el objeto contenedor del frame
        Container contentpane = getContentPane();
//Se crea un objeto de tipo JPanel
        JPanel panel = new JPanel();
//Se añade el panel al objeto contenedor del frame
        contentpane.add(panel);
//Para que se pueda apreciar el panel pongo su color de fondo verde
        panel.setBackground(Color.green);
    }



}
class manejadorMouse extends MouseAdapter {
    public void mousePressed()
    {
        System.out.println("...Mouse presionado");
    }
}
