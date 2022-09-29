package baf;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Calculator implements ActionListener{

    private static JFrame okno =new JFrame("Calculator");

    private static String FirstNumber = "", SecondNumber = "", Result = "";
    private static JTextField TextovyPole = new JTextField(50);

    private Calculator(){
        

        TextovyPole.setBounds(20,50,500,40);
        TextovyPole.setVisible(true);
        TextovyPole.setEditable(false);

        
        
        JButton btnPlus = new JButton("+");
        JButton btnDivide = new JButton("/");
        JButton btnMinus = new JButton("-");
        JButton btnMultiply = new JButton("*");

        okno.add(btnPlus);
        okno.add(btnDivide);
        okno.add(btnMinus);
        okno.add(btnMultiply);

        btnPlus.setBounds(20,100, 50,50);
        btnDivide.setBounds(80,100, 50,50);
        btnMinus.setBounds(140,100, 50,50);
        btnMultiply.setBounds(200,100, 50,50);


        JButton btnOne = new JButton("1");
        JButton btnTwo = new JButton("2");
        JButton btnThree = new JButton("3");
        JButton btnFour = new JButton("4");
        JButton btnFive = new JButton("5");
        JButton btnSix = new JButton("6");
        JButton btnSeven = new JButton("7");
        JButton btnEight = new JButton("8");
        JButton btnNine = new JButton("9");
        JButton btnZero = new JButton("0");

        okno.add(btnOne);
        okno.add(btnTwo);
        okno.add(btnThree);
        okno.add(btnFour);
        okno.add(btnFive);
        okno.add(btnSix);
        okno.add(btnSeven);
        okno.add(btnEight);
        okno.add(btnNine);
        okno.add(btnZero);

        btnOne.setBounds(80,160, 50,50);
        btnTwo.setBounds(140,160, 50,50);
        btnThree.setBounds(200,160, 50,50);
        btnFour.setBounds(80,220, 50,50);
        btnFive.setBounds(140,220, 50,50);
        btnSix.setBounds(200,220, 50,50);
        btnSeven.setBounds(80,280, 50,50);
        btnEight.setBounds(140,280, 50,50);
        btnNine.setBounds(200,280, 50,50);
        btnZero.setBounds(140,340, 50,50);


        JButton btnSudostLichost = new JButton("O");
        JButton btnPrvoCislo = new JButton("P");
        JButton btnRoundingUp = new JButton("R");
        JButton btnClear = new JButton("C");

        okno.add(btnSudostLichost);
        okno.add(btnPrvoCislo);
        okno.add(btnRoundingUp);
        okno.add(btnClear);

        btnSudostLichost.setBounds(20,160, 50,50);
        btnPrvoCislo.setBounds(20,220, 50,50);
        btnRoundingUp.setBounds(20,280, 50,50);
        btnClear.setBounds(20,340, 50,50);


        JButton btnRovnaSe = new JButton("=");

        okno.add(btnRovnaSe);

        btnRovnaSe.setBounds(200,340 ,50,50);


        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnDivide.addActionListener(this);
        btnMultiply.addActionListener(this);

        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        btnFour.addActionListener(this);
        btnFive.addActionListener(this);
        btnSix.addActionListener(this);
        btnSeven.addActionListener(this);
        btnEight.addActionListener(this);
        btnNine.addActionListener(this);
        btnZero.addActionListener(this);

        btnSudostLichost.addActionListener(this);
        btnRoundingUp.addActionListener(this);
        btnPrvoCislo.addActionListener(this);

        btnRovnaSe.addActionListener(this);


        okno.setSize(1200,900);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLayout(null);
        okno.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String btnCommand = e.getActionCommand();

        if ((btnCommand.charAt(0) >= '0' && btnCommand.charAt(0) <= '9') || btnCommand.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!SecondNumber.equals(""))
                Result = Result + btnCommand;
            else
                FirstNumber = FirstNumber + btnCommand;

            // set the value of text
            TextovyPole.setText(FirstNumber + SecondNumber + Result);
        }
        else if (btnCommand.charAt(0) == 'C') {
            // clear the one letter
            FirstNumber = SecondNumber = Result = "";

            // set the value of text
            TextovyPole.setText(FirstNumber + SecondNumber + Result);
        }
        else if (btnCommand.charAt(0) == '=') {

            double te;

            // store the value in 1st
            if (SecondNumber.equals("+"))
                te = (Double.parseDouble(FirstNumber) + Double.parseDouble(Result));
            else if (SecondNumber.equals("-"))
                te = (Double.parseDouble(FirstNumber) - Double.parseDouble(Result));
            else if (SecondNumber.equals("/"))
                te = (Double.parseDouble(FirstNumber) / Double.parseDouble(Result));
            else
                te = (Double.parseDouble(FirstNumber) * Double.parseDouble(Result));

            // set the value of text
            TextovyPole.setText(FirstNumber + SecondNumber + Result + "=" + te);

            // convert it to string
            FirstNumber = Double.toString(te);

            SecondNumber = Result = "";
        }
        else {
            // if there was no operand
            if (SecondNumber.equals("") || Result.equals(""))
                SecondNumber = btnCommand;
                // else evaluate
            else {
                double te;

                // store the value in 1st
                if (SecondNumber.equals("+"))
                    te = (Double.parseDouble(FirstNumber) + Double.parseDouble(Result));
                else if (SecondNumber.equals("-"))
                    te = (Double.parseDouble(FirstNumber) - Double.parseDouble(Result));
                else if (SecondNumber.equals("/"))
                    te = (Double.parseDouble(FirstNumber) / Double.parseDouble(Result));
                else
                    te = (Double.parseDouble(FirstNumber) * Double.parseDouble(Result));

                // convert it to string
                FirstNumber = Double.toString(te);

                // place the operator
                SecondNumber = btnCommand;

                // make the operand blank
                Result = "";
            }

            // set the value of text
            TextovyPole.setText(FirstNumber + SecondNumber + Result);
        }



    }

    public static void main(String[] args) {
        Calculator test = new Calculator();
    }



}
