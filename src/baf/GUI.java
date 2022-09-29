package baf;
import javax.swing.*;
public class GUI {
    public static void main(String[] args) {
        JFrame okno =new JFrame("FirstProgram");

         JLabel text = new JLabel( "Hello world");
         text.setBounds(1000,120,100,40);


         ImageIcon img = new ImageIcon("Pepa_pig.jpg");
         JLabel obrazek = new JLabel();
         obrazek.setIcon(img);
        obrazek.setBounds(20, 20, 372, 373);

         okno.setSize(1200,900);

         okno.add(text);
         okno.add(obrazek);

        okno.setLayout(null);
        okno.setVisible(true);
    }
}
