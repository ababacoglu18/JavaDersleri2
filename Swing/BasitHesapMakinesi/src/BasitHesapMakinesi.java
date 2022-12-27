import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasitHesapMakinesi {

    private int say = 0;
    private JButton tıklaButton;
    private JPanel jp;
    private JButton toplam;
    private JButton fark;
    private JButton carpim;
    private JButton bolum;
    private JLabel yazialan1;
    private JLabel yaziAlan2;
    private JTextField sonucT;
    private JTextField birincis;
    private JTextField ikincis;

    public static class Main {




    }

    public BasitHesapMakinesi() {
        toplam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             int birinciSayi = Integer.valueOf(birincis.getText());
             int ikinciSayi = Integer.valueOf(ikincis.getText());

             sonucT.setText(String.valueOf((birinciSayi+ikinciSayi)));
            }
        });
        bolum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float birinciSayi = Float.valueOf(birincis.getText());
                float ikinciSayi = Float.valueOf(ikincis.getText());

                sonucT.setText(String.valueOf((birinciSayi/ikinciSayi)));

            }
        });
        carpim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int birinciSayi = Integer.valueOf(birincis.getText());
                int ikinciSayi = Integer.valueOf(ikincis.getText());

                sonucT.setText(String.valueOf((birinciSayi*ikinciSayi)));

            }
        });
        fark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int birinciSayi = Integer.valueOf(birincis.getText());
                int ikinciSayi = Integer.valueOf(ikincis.getText());

                sonucT.setText(String.valueOf((birinciSayi-ikinciSayi)));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BasitHesapMakinesi");
        frame.setContentPane(new BasitHesapMakinesi().jp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
