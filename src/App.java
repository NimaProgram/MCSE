import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;


public class App extends JFrame{
    public static void main(String[] args) throws Exception {  
        App frame = new App("Server Active");
        frame.setVisible(true);
    }
    App(String title){
        setTitle(title);
        setBounds(1500,70, 350,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Texts
        String text = "Server is Active";
            // Labels
            JLabel label = new JLabel(text);
            // Panels
            JPanel p1 = new JPanel();
        p1.add(label);


        // Button
        JButton btn = new JButton("Change status");

        Container contentPane = getContentPane();
        contentPane.add(btn, BorderLayout.SOUTH);
        contentPane.add(p1, BorderLayout.CENTER);
    }
}
