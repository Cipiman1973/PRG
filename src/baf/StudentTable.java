package baf;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class StudentTable extends JFrame
{

    public StudentTable()
    {


        Student row1 = new Student( "Honza", 18);
        Student row2 = new Student("Lukaš", 18);
        Student row3 = new Student("Zdeněk", 18);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(row1);
        studentList.add(row2);
        studentList.add(row3);

        StudentTableModel model = new StudentTableModel(studentList);
        JTable table = new JTable(model);

        this.add(new JPanel());
        this.add(new JScrollPane(table));

        this.setTitle("Editable Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentTable();
            }
        });
    }    
}
