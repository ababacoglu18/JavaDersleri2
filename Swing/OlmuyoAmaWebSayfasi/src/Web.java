import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Web {

    private int say ;
    private JButton clickButton;
    private JPanel panel1;
    private JTextField yaziAlani;

    public Web() {
    clickButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String internet_adresi = yaziAlani.getText();
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI(internet_adresi));  //<---------
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (URISyntaxException ex) {
                throw new RuntimeException(ex);
            }
            say++;
            System.out.println("Butona " + say + " kere tiklandi.");
          //  yaziAlani.setText(say + " kere butona tikladin");

        }
    });
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Web");
        frame.setContentPane(new Web().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
