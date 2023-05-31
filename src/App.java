import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class App extends JFrame{
    private JButton negro;
    private JButton blanco;
    Container panel;
    public App(){
        super("Color");
        panel = this.getContentPane();
        setLayout(new FlowLayout());
        negro = new JButton("Dark");
        blanco = new JButton("Light");
        add(negro);
        add(blanco);
        negro.addActionListener(new OyenteNegro());
        blanco.addActionListener(new OyenteBlanco());
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) throws Exception {
        App pestaña = new App();
    }
    class OyenteNegro implements ActionListener{
        public void actionPerformed(ActionEvent dark){
            if(panel.getBackground()==Color.black){
                JOptionPane.showMessageDialog(null,"Ya esta de ese color", "Color ya asignado",JOptionPane.PLAIN_MESSAGE);
            }
            else{
              panel.setBackground(Color.black);  
            }
            
        }
    }
    class OyenteBlanco implements ActionListener{
        public void actionPerformed(ActionEvent light){
            if(panel.getBackground()==Color.white){
                JOptionPane.showMessageDialog(null,"Ya esta de ese color", "Color ya asignado",JOptionPane.PLAIN_MESSAGE);
            }
            else{
                panel.setBackground(Color.white);
            }
            
        }
    }
}
