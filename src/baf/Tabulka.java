package baf;

public class Tabulka {
    public static void main(String[] args) {

        Tabulkovac tabulkicka = new Tabulkovac();

        tabulkicka.initComponents();
        tabulkicka.createPanels();
        tabulkicka.renderTable();
        tabulkicka.renderSidePanel();
        tabulkicka.refresh();
    }
}
