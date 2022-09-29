package baf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonChangingColor implements ActionListener {

    private static JButton btn1 = new JButton("1");
    private static JButton btn2 = new JButton("2");
    private static JButton btn3 = new JButton("3");
    private static JButton btn4 = new JButton("4");
    private static JButton btn5 = new JButton("5");
    private static JButton btn6 = new JButton("6");
    private static JButton btn7 = new JButton("7");
    private static JButton btn8 = new JButton("8");
    private static JButton btn9 = new JButton("9");



    private static JFrame okno =new JFrame("Button Color Changer");

    private ButtonChangingColor(){
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

        btn5.setBackground(Color.red);

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
    String bla = e.getActionCommand();

    int input = Integer.parseInt(bla);
    int vzum = 1;

    if (vzum == 1){
        if (input == 1){
            btn1.setEnabled(false);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);

            btn1.setBackground(Color.red);
            btn2.setBackground(Color.green);
            btn3.setBackground(Color.green);
            btn4.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn6.setBackground(Color.green);
            btn7.setBackground(Color.green);
            btn8.setBackground(Color.green);
            btn9.setBackground(Color.green);
            vzum++;
        }else if(input == 2){
            btn1.setEnabled(true);
            btn2.setEnabled(false);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);

            btn1.setBackground(Color.green);
            btn2.setBackground(Color.red);
            btn3.setBackground(Color.green);
            btn4.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn6.setBackground(Color.green);
            btn7.setBackground(Color.green);
            btn8.setBackground(Color.green);
            btn9.setBackground(Color.green);
            vzum++;
        }else if(input ==3){
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(false);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);

            btn1.setBackground(Color.green);
            btn2.setBackground(Color.green);
            btn3.setBackground(Color.red);
            btn4.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn6.setBackground(Color.green);
            btn7.setBackground(Color.green);
            btn8.setBackground(Color.green);
            btn9.setBackground(Color.green);
            vzum++;
        }else if(input ==4){
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(false);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);

            btn1.setBackground(Color.green);
            btn2.setBackground(Color.green);
            btn3.setBackground(Color.green);
            btn4.setBackground(Color.red);
            btn5.setBackground(Color.green);
            btn6.setBackground(Color.green);
            btn7.setBackground(Color.green);
            btn8.setBackground(Color.green);
            btn9.setBackground(Color.green);
            vzum++;
        }else if(input ==5){
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(false);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);

            btn1.setBackground(Color.green);
            btn2.setBackground(Color.green);
            btn3.setBackground(Color.green);
            btn4.setBackground(Color.green);
            btn5.setBackground(Color.red);
            btn6.setBackground(Color.green);
            btn7.setBackground(Color.green);
            btn8.setBackground(Color.green);
            btn9.setBackground(Color.green);
            vzum++;
        }else if(input ==6){
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(false);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);

            btn1.setBackground(Color.green);
            btn2.setBackground(Color.green);
            btn3.setBackground(Color.green);
            btn4.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn6.setBackground(Color.red);
            btn7.setBackground(Color.green);
            btn8.setBackground(Color.green);
            btn9.setBackground(Color.green);
            vzum++;
        }else if(input ==7){
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(false);
            btn8.setEnabled(true);
            btn9.setEnabled(true);

            btn1.setBackground(Color.green);
            btn2.setBackground(Color.green);
            btn3.setBackground(Color.green);
            btn4.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn6.setBackground(Color.green);
            btn7.setBackground(Color.red);
            btn8.setBackground(Color.green);
            btn9.setBackground(Color.green);
            vzum++;
        }else if(input ==8){
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(false);
            btn9.setEnabled(true);

            btn1.setBackground(Color.green);
            btn2.setBackground(Color.green);
            btn3.setBackground(Color.green);
            btn4.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn6.setBackground(Color.green);
            btn7.setBackground(Color.green);
            btn8.setBackground(Color.red);
            btn9.setBackground(Color.green);
            vzum++;
        }else if(input ==9){
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(false);

            btn1.setBackground(Color.green);
            btn2.setBackground(Color.green);
            btn3.setBackground(Color.green);
            btn4.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn6.setBackground(Color.green);
            btn7.setBackground(Color.green);
            btn8.setBackground(Color.green);
            btn9.setBackground(Color.red);
            vzum++;
        }
    }

    }



    public static void main(String[] args) {
        ButtonChangingColor test = new ButtonChangingColor();
    }
}
