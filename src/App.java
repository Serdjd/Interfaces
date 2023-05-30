import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class App extends JFrame{
    private JButton boton;
    public App(){
        super("Rosa de los vientos");
        boton = new JButton("Todavía no has pulsado");
        add(boton);
        boton.addActionListener(new OyenteBoton());
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) throws Exception {
        App pestaña = new App();
    }
    class OyenteBoton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            boton.setText("Pulsado");
        }
    }
}
