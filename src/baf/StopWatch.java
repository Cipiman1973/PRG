package baf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopWatch implements ActionListener {

    JFrame okno = new JFrame("Stopwatch");
    JButton startBtn = new JButton("Start");
    JButton resetBtn = new JButton("Reset");
    JButton lapBtn = new JButton("Lap");
    JLabel timeLabel = new JLabel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    int Watch = 0;
    int sec = 0;
    int min = 0;
    int hour = 0;
    boolean lapped1 = false;
    boolean lapped2 = false;
    boolean lapped3 = false;
    boolean time = false;
    String seconds = String.format("%02d", sec);
    String minutes = String.format("%02d", min);
    String hours = String.format("%02d", hour);

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Watch = Watch + 1000;
            hour = (Watch / 3600000);
            min = (Watch / 60000) % 60;
            sec = (Watch / 1000) % 60;

            String seconds = String.format("%02d", sec);
            String minutes = String.format("%02d", min);
            String hours = String.format("%02d", hour);
            timeLabel.setText(hours + ":" + minutes + ":" + seconds);
        }
    });

    StopWatch() {
        timeLabel.setText(hours + ":" + minutes + ":" + seconds);
        timeLabel.setBounds(70, 100, 280, 100);
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        label1.setBounds(400, 100, 120, 30);
        label1.setText("Lap 1 :" + hours + ":" + minutes + ":" + seconds);

        label2.setBounds(400, 200, 120, 30);
        label2.setText("Lap 2 :" + hours + ":" + minutes + ":" + seconds);

        label3.setBounds(400, 300, 120, 30);
        label3.setText("Lap 3 :" + hours + ":" + minutes + ":" + seconds);

        startBtn.setBounds(70, 250, 80, 30);
        startBtn.setFocusable(false);
        startBtn.addActionListener(this);

        resetBtn.setBounds(170, 250, 80, 30);
        resetBtn.setFocusable(false);
        resetBtn.addActionListener(this);

        lapBtn.setBounds(270, 250, 80, 30);
        lapBtn.setFocusable(false);
        lapBtn.addActionListener(this);

        okno.add(label1);
        okno.add(label2);
        okno.add(label3);
        okno.add(lapBtn);
        okno.add(startBtn);
        okno.add(resetBtn);
        okno.add(timeLabel);
        
        okno.setSize(800, 500);
        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okno.setLayout(null);
        okno.setLocationRelativeTo(null);
        okno.setResizable(false);
        okno.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn) {
            start();
            if (!time) {
                time = true;
                startBtn.setText("Stop");
                start();
            } else {
                time = false;
                startBtn.setText("Start");
                stop();
            }
        }
        if (e.getSource() == resetBtn) {
            time = false;
            startBtn.setText("Start");
            reset();
        }
        if (e.getSource() == lapBtn && !lapped1) {
            lap();
            lapped1 = true;
        } else if (e.getSource() == lapBtn && !lapped2) {
            lap();
            lapped2 = true;
        } else if (e.getSource() == lapBtn && !lapped3) {
            lap();
            lapped3 = true;
        }

    }

    void start() {
        timer.start();
    }

    void stop() {
        timer.stop();
    }

    void reset() {
        timer.stop();
        Watch = 0;
        sec = 0;
        min = 0;
        hour = 0;

        String seconds = String.format("%02d", sec);
        String minutes = String.format("%02d", min);
        String hours = String.format("%02d", hour);
        timeLabel.setText(hours + ":" + minutes + ":" + seconds);
        lapped1 = false;
        lapped2 = false;
        lapped3 = false;
        label1.setText("Lap 1 :" + hours + ":" + minutes + ":" + seconds);
        label2.setText("Lap 2 :" + hours + ":" + minutes + ":" + seconds);
        label3.setText("Lap 3 :" + hours + ":" + minutes + ":" + seconds);
    }

    void lap() {
        String seconds = String.format("%02d", sec);
        String minutes = String.format("%02d", min);
        String hours = String.format("%02d", hour);

        if (!lapped1) {
            label1.setText("Lap 1 :" + hours + ":" + minutes + ":" + seconds);
        } else if (!lapped2) {
            label2.setText("Lap 2 :" + hours + ":" + minutes + ":" + seconds);
        } else if (!lapped3) {
            label3.setText("Lap 3 :" + hours + ":" + minutes + ":" + seconds);
        }
    }

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
    }
}