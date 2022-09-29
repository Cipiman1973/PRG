package baf;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.Random;

public class ButtonChanging implements ActionListener{

    private static JButton btn1 = new JButton();
    private static JButton btn2 = new JButton();
    private static JButton btn3 = new JButton();
    private static JButton btn4 = new JButton();
    private static JButton btn5 = new JButton();
    private static JButton btn6 = new JButton();
    private static JButton btn7 = new JButton();
    private static JButton btn8 = new JButton();
    private static JButton btn9 = new JButton();


    private static ImageIcon img1 = new ImageIcon("Pepa_pig.jpg");
    private static ImageIcon img2 = new ImageIcon("Camel.png");
    private static ImageIcon img3 = new ImageIcon("Earth.jpg");
    private static ImageIcon img4 = new ImageIcon("Skull.png");

    private static JFrame okno =new JFrame("Button Changer");

    private ButtonChanging(){

        okno.setSize(1200,1200);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLayout(null);
        okno.setVisible(true);

        btn1.setBounds(0,0,300,300);
        btn2.setBounds(300,0,300,300);
        btn3.setBounds(600,0,300,300);
        btn4.setBounds(0,300,300,300);
        btn5.setBounds(300,300,300,300);
        btn6.setBounds(600,300,300,300);
        btn7.setBounds(0,600,300,300);
        btn8.setBounds(300,600,300,300);
        btn9.setBounds(600,600,300,300);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

        okno.add(btn1);
        okno.add(btn2);
        okno.add(btn3);
        okno.add(btn4);
        okno.add(btn5);
        okno.add(btn6);
        okno.add(btn7);
        okno.add(btn8);
        okno.add(btn9);

    }

    public void actionPerformed(ActionEvent e) {

        Random random = new Random();
        int idk = random.nextInt(10) + 1;

        int img = random.nextInt(5) + 1;

        if (idk == 1){
            if (img == 1){
                btn1.setIcon(img1);
            }else if (img == 2){
                btn1.setIcon(img2);
            }else if (img == 3){
                btn1.setIcon(img3);
            }else if (img == 4){
                btn1.setIcon(img4);
            }
        }else if (idk == 2){
            if (img == 1){
                btn2.setIcon(img1);
            }else if (img == 2){
                btn2.setIcon(img2);
            }else if (img == 3){
                btn2.setIcon(img3);
            }else if (img == 4){
                btn2.setIcon(img4);
            }
        }else if (idk == 3){
            if (img == 1){
                btn3.setIcon(img1);
            }else if (img == 2){
                btn3.setIcon(img2);
            }else if (img == 3){
                btn3.setIcon(img3);
            }else if (img == 4){
                btn3.setIcon(img4);
            }
        }else if (idk == 4){
            if (img == 1){
                btn4.setIcon(img1);
            }else if (img == 2){
                btn4.setIcon(img2);
            }else if (img == 3){
                btn4.setIcon(img3);
            }else if (img == 4){
                btn4.setIcon(img4);
            }
        }else if (idk == 5){
            if (img == 1){
                btn5.setIcon(img1);
            }else if (img == 2){
                btn5.setIcon(img2);
            }else if (img == 3){
                btn5.setIcon(img3);
            }else if (img == 4){
                btn5.setIcon(img4);
            }
        }else if (idk == 6){
            if (img == 1){
                btn6.setIcon(img1);
            }else if (img == 2){
                btn6.setIcon(img2);
            }else if (img == 3){
                btn6.setIcon(img3);
            }else if (img == 4){
                btn6.setIcon(img4);
            }
        }else if (idk == 7){
            if (img == 1){
                btn7.setIcon(img1);
            }else if (img == 2){
                btn7.setIcon(img2);
            }else if (img == 3){
                btn7.setIcon(img3);
            }else if (img == 4){
                btn7.setIcon(img4);
            }
        }else if (idk == 8){
            if (img == 1){
                btn8.setIcon(img1);
            }else if (img == 2){
                btn8.setIcon(img2);
            }else if (img == 3){
                btn8.setIcon(img3);
            }else if (img == 4){
                btn8.setIcon(img4);
            }
        }else if (idk == 9){
            if (img == 1){
                btn9.setIcon(img1);
            }else if (img == 2){
                btn9.setIcon(img2);
            }else if (img == 3){
                btn9.setIcon(img3);
            }else if (img == 4){
                btn9.setIcon(img4);
            }
        }
    }

    public static void main(String[] args) {
        ButtonChanging test = new ButtonChanging();
    }
}
