package baf;

import java.security.PublicKey;
import java.util.List;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class StudentTableModel extends AbstractTableModel
{
    private final List<Student> studentList;

    private final String[] columnNames = new String[] {
            "Name", "Age"
    };
    private final Class[] columnClass = new Class[] {
       String.class, Double.class
    };

    public StudentTableModel(List<Student> studentList)
    {
        this.studentList = studentList;
    }

    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }

    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }

    @Override
    public int getRowCount()
    {
        return studentList.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Student row = studentList.get(rowIndex);
        if(0 == columnIndex) {
            return row.getName();
        }
        else if(1 == columnIndex) {
            return row.getAge();
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        Student row = studentList.get(rowIndex);
        if(0 == columnIndex) {
            row.setName((String) aValue);
        }
        else if(1 == columnIndex) {
            row.setAge((int) aValue);
        }

    }
    
}
