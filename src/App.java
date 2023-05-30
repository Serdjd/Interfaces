import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class App extends JFrame{
    private JButton boton;
    public App(){
        super("Rosa de los vientos");
        setLayout(new BorderLayout());
        add(new JButton("East"),BorderLayout.EAST);
        add(new JButton("West"),BorderLayout.WEST);
        add(new JButton("South"),BorderLayout.SOUTH);
        add(new JButton("North"),BorderLayout.NORTH);
        add(new JButton("Origen"),BorderLayout.CENTER);
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) throws Exception {
        App pestaña = new App();
    }
}
