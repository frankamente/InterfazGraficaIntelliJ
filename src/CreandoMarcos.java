import javax.swing.*;
import java.awt.*;

public class CreandoMarcos {
    public static void main(String... args){
    /*
        MiMarco marco1 = new MiMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MiMarco marco2 = new MiMarco();
        marco2.setVisible(true);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setTitle("Soy el marco2!");
        ImageIcon image = new ImageIcon("src/logo.png");
        marco2.setLocation(300,300);
        for (long i = 0; i < 100000; i++) {
            System.out.println("hola");
        }
        marco2.setBounds(100,100,600,600);
        marco2.setResizable(false);
        for (long i = 0; i < 100000; i++) {
            System.out.println("hola");
        }
        marco2.setResizable(false);
        marco2.setExtendedState(Frame.MAXIMIZED_BOTH);*/

        MiMarcoCentrado marcoCentrado = new MiMarcoCentrado();
        marcoCentrado.pintarDimension();
        marcoCentrado.pintarResolucion();
        int alto = 300;
        int ancho = 300;
        int alturaPantalla = marcoCentrado.tamañoPantalla.height;
        int anchuraPantalla = marcoCentrado.tamañoPantalla.width;
        marcoCentrado.setBounds(anchuraPantalla/2-ancho/2,alturaPantalla/2-alto/2,ancho,alto);
        Image miIcono=marcoCentrado.miPantalla.getImage("src/arrowL.jpg");
        marcoCentrado.setIconImage(miIcono);
        marcoCentrado.setVisible(true);
    }
}

class MiMarco extends JFrame{
    public MiMarco(){
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

class MiMarcoCentrado extends JFrame{
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Dimension tamañoPantalla = miPantalla.getScreenSize();
    int resolucion = miPantalla.getScreenResolution();

    public void pintarDimension(){
        System.out.println(tamañoPantalla);
    }

    public void pintarResolucion(){
        System.out.println(resolucion);
    }
}
