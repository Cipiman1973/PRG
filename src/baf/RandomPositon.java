package baf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.Random;

public class RandomPositon implements MouseListener{

    private static JFrame okno =new JFrame("SecondProgram");
     JButton randomBTN = new JButton();

    public static void main(String[] args) {
        RandomPositon test = new RandomPositon();
    }
    private RandomPositon(){
        okno.setSize(1200,900);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLayout(null);
        okno.setVisible(true);
        okno.add(randomBTN);
        randomBTN.addMouseListener(this);
        randomBTN.setBounds(0, 0, 50,50);
        randomBTN.setBackground(Color.red);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Random rnd = new Random();
        int xPos = rnd.nextInt(1150) + 1;
        int yPos = rnd.nextInt(850) + 1;
        randomBTN.setBounds(xPos, yPos, 50,50);

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
