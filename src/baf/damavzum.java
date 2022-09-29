package baf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class damavzum implements ActionListener {


    private static final JButton btn1 = new JButton("1");
    private static final JButton btn2 = new JButton("2");
    private static final JButton btn3 = new JButton("3");
    private static final JButton btn4 = new JButton("4");
    private static final JButton btn5 = new JButton("5");
    private static final JButton btn6 = new JButton("6");
    private static final JButton btn7 = new JButton("7");
    private static final JButton btn8 = new JButton("8");
    private static final JButton btn9 = new JButton("9");
    private static final JButton btn10 = new JButton("10");
    private static final JButton btn11 = new JButton("11");
    private static final JButton btn12 = new JButton("12");
    private static final JButton btn13 = new JButton("13");
    private static final JButton btn14 = new JButton("14");
    private static final JButton btn15 = new JButton("15");
    private static final JButton btn16 = new JButton("16");
    private static final JButton btn17 = new JButton("17");
    private static final JButton btn18 = new JButton("18");
    private static final JButton btn19 = new JButton("19");
    private static final JButton btn20 = new JButton("20");
    private static final JButton btn21 = new JButton("21");
    private static final JButton btn22 = new JButton("22");
    private static final JButton btn23 = new JButton("23");
    private static final JButton btn24 = new JButton("24");
    private static final JButton btn25 = new JButton("25");
    private static final JButton btn26 = new JButton("26");
    private static final JButton btn27 = new JButton("27");
    private static final JButton btn28 = new JButton("28");
    private static final JButton btn29 = new JButton("29");
    private static final JButton btn30 = new JButton("30");
    private static final JButton btn31 = new JButton("31");
    private static final JButton btn32 = new JButton("32");

    private static final JLabel lbl1 = new JLabel("1");
    private static final JLabel lbl2 = new JLabel("2");
    private static final JLabel lbl3 = new JLabel("3");
    private static final JLabel lbl4 = new JLabel("4");
    private static final JLabel lbl5 = new JLabel("5");
    private static final JLabel lbl6 = new JLabel("6");
    private static final JLabel lbl7 = new JLabel("7");
    private static final JLabel lbl8 = new JLabel("8");
    private static final JLabel lbl9 = new JLabel("9");
    private static final JLabel lbl10 = new JLabel("10");
    private static final JLabel lbl11 = new JLabel("11");
    private static final JLabel lbl12 = new JLabel("12");
    private static final JLabel lbl13 = new JLabel("13");
    private static final JLabel lbl14 = new JLabel("14");
    private static final JLabel lbl15 = new JLabel("15");
    private static final JLabel lbl16 = new JLabel("16");
    private static final JLabel lbl17 = new JLabel("17");
    private static final JLabel lbl18 = new JLabel("18");
    private static final JLabel lbl19 = new JLabel("19");
    private static final JLabel lbl20 = new JLabel("20");
    private static final JLabel lbl21 = new JLabel("21");
    private static final JLabel lbl22 = new JLabel("22");
    private static final JLabel lbl23 = new JLabel("23");
    private static final JLabel lbl24 = new JLabel("24");
    private static final JLabel lbl25 = new JLabel("25");
    private static final JLabel lbl26 = new JLabel("26");
    private static final JLabel lbl27 = new JLabel("27");
    private static final JLabel lbl28 = new JLabel("28");
    private static final JLabel lbl29 = new JLabel("29");
    private static final JLabel lbl30 = new JLabel("30");
    private static final JLabel lbl31 = new JLabel("31");
    private static final JLabel lbl32 = new JLabel("32");
    private static final ImageIcon zluta = new ImageIcon("zluty.png");
    private static final ImageIcon oranzova = new ImageIcon("oranzovy.png");


    int[] damaPosition = {  '1', '1', '1', '1', 
                            '1', '1', '1', '1', 
                            '1', '1', '1', '1', 
                            '0', '0', '0', '0',
                            '0', '0', '0', '0',
                            '2', '2', '2', '2',
                            '2', '2', '2', '2',
                            '2', '2', '2', '2'};


    ArrayList<JLabel> labelyArej = new ArrayList<>();
    private static boolean swap;
    private static int counter;

    private static final JFrame okno =new JFrame("Dáma");

   private damavzum(){

        okno.setSize(900,700);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLayout(null);
        okno.setVisible(true);

        labelyArej.add(lbl1);
        labelyArej.add(lbl2);
        labelyArej.add(lbl3);
        labelyArej.add(lbl4);
        labelyArej.add(lbl5);
        labelyArej.add(lbl6);
        labelyArej.add(lbl7);
        labelyArej.add(lbl8);
        labelyArej.add(lbl9);
        labelyArej.add(lbl10);
        labelyArej.add(lbl11);
        labelyArej.add(lbl12);
        labelyArej.add(lbl13);
        labelyArej.add(lbl14);
        labelyArej.add(lbl15);
        labelyArej.add(lbl16);
        labelyArej.add(lbl17);
        labelyArej.add(lbl18);
        labelyArej.add(lbl19);
        labelyArej.add(lbl20);
        labelyArej.add(lbl21);
        labelyArej.add(lbl22);
        labelyArej.add(lbl23);
        labelyArej.add(lbl24);
        labelyArej.add(lbl25);
        labelyArej.add(lbl26);
        labelyArej.add(lbl27);
        labelyArej.add(lbl28);
        labelyArej.add(lbl29);
        labelyArej.add(lbl30);
        labelyArej.add(lbl31);
        labelyArej.add(lbl32);

        btn1.setBounds(0,0,80,80);
        lbl1.setBounds(80,0,80,80);
        btn2.setBounds(160,0,80,80);
        lbl2.setBounds(240, 0 ,80,80);
        btn3.setBounds(320,0,80,80);
        lbl3.setBounds(400,0,80,80);
        btn4.setBounds(480,0,80,80);
        lbl4.setBounds(560,0,80,80);

        lbl5.setBounds(0,80,80,80);
        btn5.setBounds(80,80,80,80);
        lbl6.setBounds(160,80,80,80);
        btn6.setBounds(240,80,80,80);
        lbl7.setBounds(320,80,80,80);
        btn7.setBounds(400,80,80,80);
        lbl8.setBounds(480,80,80,80);
        btn8.setBounds(560,80,80,80);

        btn9.setBounds(0,160,80,80);
        lbl9.setBounds(80,160,80,80);
        btn10.setBounds(160,160,80,80);
        lbl10.setBounds(240, 160 ,80,80);
        btn11.setBounds(320,160,80,80);
        lbl11.setBounds(400,160,80,80);
        btn12.setBounds(480,160,80,80);
        lbl12.setBounds(560,160,80,80);

        lbl13.setBounds(0,240,80,80);
        btn13.setBounds(80,240,80,80);
        lbl14.setBounds(160,240,80,80);
        btn14.setBounds(240,240,80,80);
        lbl15.setBounds(320,240,80,80);
        btn15.setBounds(400,240,80,80);
        lbl16.setBounds(480,240,80,80);
        btn16.setBounds(560,240,80,80);

        btn17.setBounds(0,320,80,80);
        lbl17.setBounds(80,320,80,80);
        btn18.setBounds(160,320,80,80);
        lbl18.setBounds(240, 320,80,80);
        btn19.setBounds(320,320,80,80);
        lbl19.setBounds(400,320,80,80);
        btn20.setBounds(480,320,80,80);
        lbl20.setBounds(560,320,80,80);

        lbl21.setBounds(0,400,80,80);
        btn21.setBounds(80,400,80,80);
        lbl22.setBounds(160,400,80,80);
        btn22.setBounds(240,400,80,80);
        lbl23.setBounds(320,400,80,80);
        btn23.setBounds(400,400,80,80);
        lbl24.setBounds(480,400,80,80);
        btn24.setBounds(560,400,80,80);

        btn25.setBounds(0,480,80,80);
        lbl25.setBounds(80,480,80,80);
        btn26.setBounds(160,480,80,80);
        lbl26.setBounds(240, 480,80,80);
        btn27.setBounds(320,480,80,80);
        lbl27.setBounds(400,480,80,80);
        btn28.setBounds(480,480,80,80);
        lbl28.setBounds(560,480,80,80);

        lbl29.setBounds(0,560,80,80);
        btn29.setBounds(80,560,80,80);
        lbl30.setBounds(160,560,80,80);
        btn30.setBounds(240,560,80,80);
        lbl31.setBounds(320,560,80,80);
        btn31.setBounds(400,560,80,80);
        lbl32.setBounds(480,560,80,80);
        btn32.setBounds(560,560,80,80);


        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);
        btn17.addActionListener(this);
        btn18.addActionListener(this);
        btn19.addActionListener(this);
        btn20.addActionListener(this);
        btn21.addActionListener(this);
        btn22.addActionListener(this);
        btn23.addActionListener(this);
        btn24.addActionListener(this);
        btn25.addActionListener(this);
        btn26.addActionListener(this);
        btn27.addActionListener(this);
        btn28.addActionListener(this);
        btn29.addActionListener(this);
        btn30.addActionListener(this);
        btn31.addActionListener(this);
        btn32.addActionListener(this);

        okno.add(btn1);
        okno.add(btn2);
        okno.add(btn3);
        okno.add(btn4);
        okno.add(btn5);
        okno.add(btn6);
        okno.add(btn7);
        okno.add(btn8);
        okno.add(btn9);
        okno.add(btn10);
        okno.add(btn11);
        okno.add(btn12);
        okno.add(btn13);
        okno.add(btn14);
        okno.add(btn15);
        okno.add(btn16);
        okno.add(btn17);
        okno.add(btn18);
        okno.add(btn19);
        okno.add(btn20);
        okno.add(btn21);
        okno.add(btn22);
        okno.add(btn23);
        okno.add(btn24);
        okno.add(btn25);
        okno.add(btn26);
        okno.add(btn27);
        okno.add(btn28);
        okno.add(btn29);
        okno.add(btn30);
        okno.add(btn31);
        okno.add(btn32);

        btn1.setBackground(Color.black);
        btn2.setBackground(Color.black);
        btn3.setBackground(Color.black);
        btn4.setBackground(Color.black);
        btn5.setBackground(Color.black);
        btn6.setBackground(Color.black);
        btn7.setBackground(Color.black);
        btn8.setBackground(Color.black);
        btn9.setBackground(Color.black);
        btn10.setBackground(Color.black);
        btn11.setBackground(Color.black);
        btn12.setBackground(Color.black);
        btn13.setBackground(Color.black);
        btn14.setBackground(Color.black);
        btn15.setBackground(Color.black);
        btn16.setBackground(Color.black);
        btn17.setBackground(Color.black);
        btn18.setBackground(Color.black);
        btn19.setBackground(Color.black);
        btn20.setBackground(Color.black);
        btn21.setBackground(Color.black);
        btn22.setBackground(Color.black);
        btn23.setBackground(Color.black);
        btn24.setBackground(Color.black);
        btn25.setBackground(Color.black);
        btn26.setBackground(Color.black);
        btn27.setBackground(Color.black);
        btn28.setBackground(Color.black);
        btn29.setBackground(Color.black);
        btn30.setBackground(Color.black);
        btn31.setBackground(Color.black);
        btn32.setBackground(Color.black);


        btn1.setIcon(zluta);
        btn2.setIcon(zluta);
        btn3.setIcon(zluta);
        btn4.setIcon(zluta);
        btn5.setIcon(zluta);
        btn6.setIcon(zluta);
        btn7.setIcon(zluta);
        btn8.setIcon(zluta);
        btn9.setIcon(zluta);
        btn10.setIcon(zluta);
        btn11.setIcon(zluta);
        btn12.setIcon(zluta);

       btn21.setIcon(oranzova);
       btn22.setIcon(oranzova);
       btn23.setIcon(oranzova);
       btn24.setIcon(oranzova);
       btn25.setIcon(oranzova);
       btn26.setIcon(oranzova);
       btn27.setIcon(oranzova);
       btn28.setIcon(oranzova);
       btn29.setIcon(oranzova);
       btn30.setIcon(oranzova);
       btn31.setIcon(oranzova);
       btn32.setIcon(oranzova);
       swap = false;
       counter = 1;
    }

    public void actionPerformed(ActionEvent e) {
        String bla = e.getActionCommand();

        int input = Integer.parseInt(bla);


        while(swap = false){
            switch (counter){
                case 1 : {
                    int pozice = Integer.parseInt(String.valueOf(e));

                }
                case 2 :{
                    int pozice2 = Integer.parseInt(String.valueOf(e));

                }
            }
        }
        while(swap = true){

        }


    }



    public static void main(String[] args) {
        damavzum test = new damavzum();
    }
}

