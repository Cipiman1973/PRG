package baf;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;

public class Tabulkovac {
    JTextField hledat = new JTextField();
    JButton pridatPrazdnyRadekBTN = new JButton("Přidat prázdný řádek");
    JButton hledaniBTN = new JButton("Hledat řádek");
    JButton smazatBTN = new JButton("Smazat řádek");
    JFrame okno = new JFrame("Tabulka žáků");
    JPanel tabulkaPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    JScrollPane skrolovaciPanel;
    JTable druhaTabulka;
    JTextField prazdneOkno = new JTextField();

    String[] radek = {"ID", "Jmeno", "Vek"};
    DefaultTableModel tabulka = new DefaultTableModel(radek, 0);

    void initComponents() {
        okno.setLayout(null);
        okno.setSize(1000, 1000);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setResizable(false);

        hledaniBTN.addActionListener(e -> hledaniBTN(hledat.getText()));

        pridatPrazdnyRadekBTN.addActionListener(e ->{
            pridatPrazdnyRadekBTN(generateID(),prazdneOkno.getText(), prazdneOkno.getText());
        });

        smazatBTN.addActionListener(e -> {
            if (druhaTabulka.getSelectedRow() != -1) {
                tabulka.removeRow(druhaTabulka.getSelectedRow());
            } else {
                JOptionPane.showMessageDialog(null, "Musíte označit řádek");
            }
        });
    }

    void createPanels() {
        skrolovaciPanel = new JScrollPane(tabulkaPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        skrolovaciPanel.setBounds(0, 0, 800, 764);
        mainPanel.setBounds(800, 0, 200, 800);
        tabulkaPanel.setBounds(0, 0, 800,800);
        tabulkaPanel.setPreferredSize(new Dimension(800, 800));

        tabulkaPanel.setBackground(Color.pink);
        tabulkaPanel.setLayout(new BorderLayout());

        mainPanel.setBackground(Color.lightGray);

        mainPanel.setLayout(null);

        okno.add(skrolovaciPanel);
        okno.add(mainPanel);
    }

    void renderTable() {
        druhaTabulka = new JTable(tabulka);
        druhaTabulka.setBounds(0, 0, 800, 800);
        druhaTabulka.setFillsViewportHeight(true);
        druhaTabulka.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabulkaPanel.add(druhaTabulka, BorderLayout.CENTER);
        tabulkaPanel.add(druhaTabulka.getTableHeader(), BorderLayout.NORTH);
    }

    void renderSidePanel() {
        hledat.setBounds(10, 10, 160, 20);
        hledaniBTN.setBounds(10, 40, 160, 30);
        pridatPrazdnyRadekBTN.setBounds(10, 160, 160, 30);
        smazatBTN.setBounds(10, 200, 160, 30);

        mainPanel.add(hledat);
        mainPanel.add(hledaniBTN);
        mainPanel.add(pridatPrazdnyRadekBTN);
        mainPanel.add(smazatBTN);

        pridatPrazdnyRadekBTN.setBackground(Color.green);
        smazatBTN.setBackground(Color.red);
    }

    void hledaniBTN(String filterPhrase) {
        TableRowSorter<TableModel> hledac = new TableRowSorter<TableModel>(((DefaultTableModel) druhaTabulka.getModel()));
        hledac.setRowFilter(RowFilter.regexFilter(filterPhrase));
        druhaTabulka.setRowSorter(hledac);
        refresh();
    }

    int generateID() {
        int id = 1;
        while (!checkID(id)) {
            System.out.println("špatné id: " + id);
            id++;
        }
        return id;
    }

    boolean checkID(Integer id) {
        boolean sameID = false;
        for (int i = 0; i < druhaTabulka.getRowCount(); i++) {
            if (id == druhaTabulka.getValueAt(i, 0)) {
                sameID = true;
                System.out.println("Stejné id je: " + id + " na pozici " + i + " : " + druhaTabulka.getValueAt(i, 0));
            }
        }

        if (sameID) {
            return false;
        } else {
            return true;
        }
    }

    void pridatPrazdnyRadekBTN(Integer id, String data1, String data2) {
        tabulka.addRow(new Object[]{id, data1 = "", data2= ""});
    }

    void refresh() {
        okno.setVisible(true);
        okno.repaint();
        okno.revalidate();
    }
}
