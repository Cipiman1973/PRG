package baf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quiz implements ActionListener {

    JFrame okno = new JFrame("Quiz");
    JLabel otazka = new JLabel("Press 'Get New Question'.");
    JLabel odpovedovac = new JLabel("Correct/Wrong");
    JButton getQuiz = new JButton("Get New Question");
    JButton odpoved1 = new JButton();
    JButton odpoved2 = new JButton();
    JButton odpoved3 = new JButton();
    int rndQuiz;
    int correctAnswer;
    int x = 8;
    int btn1 = 1;
    int btn2 = 2;
    int btn3 = 3;


    ArrayList<List> otazky = new ArrayList<List>();
    ArrayList<List> correctWrong = new ArrayList<List>();
    
    Quiz(){
        okno.setSize(600,600);
        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okno.setLayout(null);
        okno.setLocationRelativeTo(null);
        okno.setResizable(false);
        okno.setVisible(true);

        okno.add(getQuiz);
        okno.add(otazka);
        okno.add(odpovedovac);
        okno.add(odpoved1);
        okno.add(odpoved2);
        okno.add(odpoved3);

        getQuiz.setBounds(0,0,600,50);
        otazka.setBounds(0, 60, 300, 50);
        odpoved1.setBounds(0,120,600, 50);
        odpoved2.setBounds(0,180,600, 50);
        odpoved3.setBounds(0,240,600, 50);
        odpovedovac.setBounds(100, 300, 400, 50);

        getQuiz.addActionListener(this);
        odpoved1.addActionListener(this);
        odpoved2.addActionListener(this);
        odpoved3.addActionListener(this);

        // otazky.add(otazkaArray);

        List list1 = new ArrayList();
        list1.add("How tall is big dig dominik?");
        list1.add("158 cm");
        list1.add("164 cm");
        list1.add("154 cm");
        list1.add("2");

        List list2 = new ArrayList();
        list2.add("What is the Capital of CZ?");
        list2.add("Praha");
        list2.add("Brno");
        list2.add("Plzeň");
        list2.add("1");

        List list3 = new ArrayList();
        list3.add("Who teaches C4 PRG?");
        list3.add("Kodytek");
        list3.add("Macura");
        list3.add("Gazda");
        list3.add("3");

        List list4 = new ArrayList();
        list4.add("Is this good quiz?");
        list4.add("Yes");
        list4.add("no");
        list4.add("yes");
        list4.add("1");

        List list5 = new ArrayList();
        list5.add("What is current inflation of CR?");
        list5.add("20 %");
        list5.add("21 %");
        list5.add("18 %");
        list5.add("3");

        List list6 = new ArrayList();
        list6.add("Which Brand is bad?");
        list6.add("Apple");
        list6.add("Samsung");
        list6.add("Xiaomi");
        list6.add("1");

        List list7 = new ArrayList();
        list7.add("How much does 4080 12G cost?");
        list7.add("699 $");
        list7.add("899 $");
        list7.add("799 $");
        list7.add("2");

        List list8 = new ArrayList();
        list8.add("How tall is Snezka?");
        list8.add("1569 m");
        list8.add("1603 m");
        list8.add("1605 m");
        list8.add("2");

        otazky.add(list1);
        otazky.add(list2);
        otazky.add(list3);
        otazky.add(list4);
        otazky.add(list5);
        otazky.add(list6);
        otazky.add(list7);
        otazky.add(list8);
        
        List correct = new ArrayList();
        correct.add("You are Correct! My Friend");
        correct.add("Very good my apprentice, you are Correct");
        correct.add("OMG $69$ $420$ you are correct!!!");
        correct.add("Correcto");
        correct.add("Gut");
        correct.add("Noice");
        correct.add("Sheeeesh");
        correct.add("es");

        List wrong = new ArrayList();
        wrong.add("!!!!! You are Wrong, very dumb !!!!!");
        wrong.add("!!!!! Very bad my apprentice, you are Wrong !!!!!");
        wrong.add("!!!! So bad go kill your self !!!!!");
        wrong.add("very bad");
        wrong.add("sad");
        wrong.add("You are stupid");
        wrong.add("RIP");
        wrong.add("no!");

        correctWrong.add(correct);
        correctWrong.add(wrong);
    };
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Random random = new Random();


        if (e.getSource() == getQuiz){

        rndQuiz = random.nextInt(otazky.size());
        System.out.println(rndQuiz);
        odpovedovac.setText("");

        otazka.setText((String) otazky.get(rndQuiz).get(0));
        odpoved1.setText((String) otazky.get(rndQuiz).get(1));
        odpoved2.setText((String) otazky.get(rndQuiz).get(2));
        odpoved3.setText((String) otazky.get(rndQuiz).get(3));
        
        correctAnswer= Integer.parseInt((String) otazky.get(rndQuiz).get(4));

        otazky.remove(rndQuiz);

        } else if (e.getSource() == odpoved1) {

            if (btn1 == correctAnswer){
                int btn1good = random.nextInt(8);
                odpovedovac.setText((String)correctWrong.get(0).get(btn1good));
            } else {
                int btn1good = random.nextInt(8);
                odpovedovac.setText((String)correctWrong.get(1).get(btn1good));
            }

        }else if (e.getSource() == odpoved2) {
            if (btn2 == correctAnswer){
                int btn1good = random.nextInt(8);
                odpovedovac.setText((String)correctWrong.get(0).get(btn1good));
            } else {
                int btn1good = random.nextInt(8);
                odpovedovac.setText((String)correctWrong.get(1).get(btn1good));
            }
        }else if (e.getSource() == odpoved3) {
            if (btn3 == correctAnswer){
                int btn1good = random.nextInt(8);
                odpovedovac.setText((String)correctWrong.get(0).get(btn1good));
            } else {
                int btn1good = random.nextInt(8);
                odpovedovac.setText((String)correctWrong.get(1).get(btn1good));
            }
        }


    }
}
