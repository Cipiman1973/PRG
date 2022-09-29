package baf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhotoAlbum implements ActionListener {

    JFrame okno = new JFrame("Stopwatch");
    Icon obrazek1Preview = new ImageIcon("C:\\Users\\jansi\\Desktop\\programování\\Images\\Preview\\Pepa_pigPreview.jpg");
    Icon obrazek2Preview = new ImageIcon("C:\\Users\\jansi\\Desktop\\programování\\Images\\Preview\\CamelPreview.png");
    Icon obrazek3Preview = new ImageIcon("C:\\Users\\jansi\\Desktop\\programování\\Images\\Preview\\EarthPreview.jpg");
    Icon obrazek1 = new ImageIcon("C:\\Users\\jansi\\Desktop\\programování\\Images\\Pepa_pig.jpg");
    Icon obrazek2 = new ImageIcon("C:\\Users\\jansi\\Desktop\\programování\\Images\\Camel.png");
    Icon obrazek3 = new ImageIcon("C:\\Users\\jansi\\Desktop\\programování\\Images\\Earth.jpg");
    int checker = 1;
    JButton obrazekBTN1 = new JButton(obrazek1Preview);
    JButton obrazekBTN2 = new JButton(obrazek2Preview);
    JButton obrazekBTN3 = new JButton(obrazek3Preview);

    JButton settingsBTN1 = new JButton("1k * 1k");
    JButton settingsBTN2 = new JButton("750 * 750");
    JButton settingsBTN3 = new JButton("500 * 500");

    JButton settingsBTN4 = new JButton("Red");
    JButton settingsBTN5 = new JButton("Black");
    JButton settingsBTN6 = new JButton("Blue");
    JButton settingsBTN7 = new JButton("Red BG");
    JButton settingsBTN8 = new JButton("Black BG");
    JButton settingsBTN9 = new JButton("Blue BG");

    PhotoAlbum() {
        okno.setSize(1080, 1080);
        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okno.setLayout(null);
        okno.setLocationRelativeTo(null);
        okno.setResizable(false);
        okno.setVisible(true);

        okno.add(obrazekBTN1);
        okno.add(obrazekBTN2);
        okno.add(obrazekBTN3);
        okno.add(settingsBTN1);
        okno.add(settingsBTN2);
        okno.add(settingsBTN3);
        okno.add(settingsBTN4);
        okno.add(settingsBTN5);
        okno.add(settingsBTN6);
        okno.add(settingsBTN7);
        okno.add(settingsBTN8);
        okno.add(settingsBTN9);

        obrazekBTN1.addActionListener(this);
        obrazekBTN2.addActionListener(this);
        obrazekBTN3.addActionListener(this);
        settingsBTN1.addActionListener(this);
        settingsBTN2.addActionListener(this);
        settingsBTN3.addActionListener(this);
        settingsBTN4.addActionListener(this);
        settingsBTN5.addActionListener(this);
        settingsBTN6.addActionListener(this);
        settingsBTN7.addActionListener(this);
        settingsBTN8.addActionListener(this);
        settingsBTN9.addActionListener(this);
        
        obrazekBTN1.setBounds(10, 50, 150, 150);
        obrazekBTN2.setBounds(170, 50, 150, 150);
        obrazekBTN3.setBounds(330, 50, 150, 150);

        settingsBTN1.setBounds(0, 0, 100, 40);
        settingsBTN2.setBounds(100, 0, 100, 40);
        settingsBTN3.setBounds(200, 0, 100, 40);

        settingsBTN4.setBounds(310, 0, 80, 40);
        settingsBTN5.setBounds(390, 0, 80, 40);
        settingsBTN6.setBounds(470, 0, 80, 40);

        settingsBTN7.setBounds(560, 0, 90, 40);
        settingsBTN8.setBounds(650, 0, 90, 40);
        settingsBTN9.setBounds(740, 0, 90, 40);

        okno.setComponentZOrder(obrazekBTN1, 3);
        okno.setComponentZOrder(obrazekBTN2, 3);
        okno.setComponentZOrder(obrazekBTN3, 3);
    }


    public static void main(String[] args) {
        PhotoAlbum photo = new PhotoAlbum();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == obrazekBTN1){
            switch (checker) {
                case 1 -> {
                    obrazekBTN1.setBounds(50, 220, 500, 500);
                    obrazekBTN1.setIcon(obrazek1);
                    checker++;
                }
                case 2 -> {
                    obrazekBTN1.setBounds(10, 50, 150, 150);
                    obrazekBTN1.setIcon(obrazek1Preview);
                    checker = 1;
                }
            }
        } else if (e.getSource() == obrazekBTN2){
            switch (checker) {
                case 1 -> {
                    obrazekBTN2.setBounds(50, 220, 500, 500);
                    obrazekBTN2.setIcon(obrazek2);
                    checker++;
                }
                case 2 -> {
                    obrazekBTN2.setBounds(170, 50, 150, 150);
                    obrazekBTN2.setIcon(obrazek2Preview);
                    checker = 1;
                }
            }
        } else if(e.getSource() == obrazekBTN3){
            switch (checker) {
                case 1 -> {
                    obrazekBTN3.setBounds(50, 220, 500, 500);
                    obrazekBTN3.setIcon(obrazek3);
                    checker++;
                }
                case 2 -> {
                    obrazekBTN3.setBounds(330, 50, 150, 150);
                    obrazekBTN3.setIcon(obrazek3Preview);
                    checker = 1;
                }
            }
        } else if (e.getSource() == settingsBTN1) {
            okno.setSize(1000,1000);
        }else if (e.getSource() == settingsBTN2) {
            okno.setSize(750,750);
        }else if (e.getSource() == settingsBTN3) {
            okno.setSize(500,500);
        }else if (e.getSource() == settingsBTN4) {
            obrazekBTN1.setBackground(Color.red);
            obrazekBTN2.setBackground(Color.red);
            obrazekBTN3.setBackground(Color.red);
        }else if (e.getSource() == settingsBTN5) {
            obrazekBTN1.setBackground(Color.black);
            obrazekBTN2.setBackground(Color.black);
            obrazekBTN3.setBackground(Color.black);
        }else if (e.getSource() == settingsBTN6) {
            obrazekBTN1.setBackground(Color.blue);
            obrazekBTN2.setBackground(Color.blue);
            obrazekBTN3.setBackground(Color.blue);
        }else if (e.getSource() == settingsBTN7) {
            okno.getContentPane().setBackground(Color.RED);
        }else if (e.getSource() == settingsBTN8) {
            okno.getContentPane().setBackground(Color.BLACK);
        }else if (e.getSource() == settingsBTN9) {
            okno.getContentPane().setBackground(Color.BLUE);
        }
    }
}