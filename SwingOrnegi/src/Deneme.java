import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deneme {
    private JButton sal;
    private JPanel panel1;
    private JTextField selam;
    private JFormattedTextField formattedTextField1;
public Deneme() {
    sal.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            selam.setText("Ahmet");
        }
    });

}

    public static class Main {
        public static void main(String[] args) {

            Deneme frame = new Deneme();

            frame = new JFrame();
            frame.setTitle("Mancala");
            frame.setSize(500,500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            

        }
    }
}
