package baf;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.Random;

public class Buttony implements ActionListener{

    private static JLabel obrazek1 = new JLabel();
    private static JLabel obrazek2 = new JLabel();
    private static JLabel obrazek3 = new JLabel();
    private static JLabel obrazek4 = new JLabel();

    private static ImageIcon img1 = new ImageIcon("Pepa_pig.jpg");
    private static ImageIcon img2 = new ImageIcon("Camel.png");
    private static ImageIcon img3 = new ImageIcon("Earth.jpg");
    private static ImageIcon img4 = new ImageIcon("Skull.png");
    private static JFrame okno =new JFrame("SecondProgram");

    private Buttony(){
        JButton btn1 = new JButton("change img");
        btn1.setBounds(20,40,130,50);

        obrazek1.setBounds(50,100,400, 400);
        obrazek2.setBounds(50,100,400, 400);
        obrazek3.setBounds(50,100,400, 400);
        obrazek4.setBounds(50,100,400, 400);



        obrazek1.setIcon(img1);
        obrazek2.setIcon(img2);
        obrazek3.setIcon(img3);
        obrazek4.setIcon(img4);

        okno.add(obrazek1);
        okno.add(obrazek2);
        okno.add(obrazek3);
        okno.add(obrazek4);

        btn1.addActionListener(this);

        okno.add(btn1);

        obrazek1.setVisible(false);
        obrazek2.setVisible(false);
        obrazek3.setVisible(false);
        obrazek4.setVisible(false);

        okno.setSize(1200,900);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLayout(null);
        okno.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

        Random random = new Random();
        int idk = random.nextInt(5) + 1;
        switch (idk){
            case 1 :
                obrazek1.setVisible(true);
                obrazek2.setVisible(false);
                obrazek3.setVisible(false);
                obrazek4.setVisible(false);
                break;
            case 2 :
                obrazek1.setVisible(false);
                obrazek2.setVisible(true);
                obrazek3.setVisible(false);
                obrazek4.setVisible(false);

                break;
            case 3 :
                obrazek1.setVisible(false);
                obrazek2.setVisible(false);
                obrazek3.setVisible(true);
                obrazek4.setVisible(false);

                break;
            case 4 :
                obrazek1.setVisible(false);
                obrazek2.setVisible(false);
                obrazek3.setVisible(false);
                obrazek4.setVisible(true);

                break;
        }
    }
    public static void main(String[] args) {
        Buttony test = new Buttony();
    }
}
