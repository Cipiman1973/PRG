package baf;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Dama extends JPanel implements ActionListener, MouseListener {
    public static int sirkaOkna = 720, vyskaOkna = sirkaOkna;
    public static final int ctvrcPlocha = sirkaOkna/8;
    public static final int pocetCtvrc = sirkaOkna/ctvrcPlocha;
    public static int[][] damaArray = new int[pocetCtvrc][pocetCtvrc];
    public static final int nulaCheck = 0;
    public static int oranzova = 1;
    public static final int oranzova_kralovna = 2;
    static BufferedImage susyKralovna;
    public static final int zluta = 3;
    public static final int zluta_kralovna = 4;
    static BufferedImage susyKing;
    public int currentPlayer = oranzova;
    public static int[][] gameData = new int[pocetCtvrc][pocetCtvrc];
    public boolean beziHra = false;
    public static int[][] moznoHrat = new int[pocetCtvrc][pocetCtvrc];
    public int storedradek, sloupecSloupec;
    public boolean moveMak = false;
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void actionPerformed(ActionEvent e) {}
    public Dama(){
        window(sirkaOkna, vyskaOkna, this);
        sestavitHraciPlochu();
        repaint();
        try {
            susyKralovna = ImageIO.read(new File("susy_kralovna.jpg"));
            susyKing = ImageIO.read(new File("fries_xxl.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean konecHryInternal(int sloupec, int radek, int oranzovaNum, int zlutaNum){
        if(gameData[sloupec][radek] == oranzova || gameData[sloupec][radek] == oranzova_kralovna) {
            oranzovaNum += 1;
        }
        if(gameData[sloupec][radek] == zluta || gameData[sloupec][radek] == zluta_kralovna) {
            zlutaNum += 1;
        }
        if(sloupec == pocetCtvrc-1 && radek == pocetCtvrc-1){
            return oranzovaNum == 0 || zlutaNum == 0;
        }
        if(sloupec == pocetCtvrc-1){
            radek += 1;
            sloupec = -1;
        }
        return konecHryInternal(sloupec+1, radek, oranzovaNum, zlutaNum);
    }

    public void window(int sirkaOkna, int vyskaOkna, Dama game){
        JFrame okno = new JFrame();
        okno.setSize(sirkaOkna, vyskaOkna);
        okno.setIconImage(susyKralovna);
        okno.setIconImage(susyKing);
        okno.setBackground(Color.black);
        okno.setLocationRelativeTo(null);
        okno.pack();
        Insets insets = okno.getInsets();
        int frameLeftBorder = insets.left;
        int frameRightBorder = insets.right;
        int frameTopBorder = insets.top;
        int frameBottomBorder = insets.bottom;
        okno.setPreferredSize(new Dimension(sirkaOkna + frameLeftBorder + frameRightBorder, vyskaOkna + frameBottomBorder + frameTopBorder));
        okno.setMaximumSize(new Dimension(sirkaOkna + frameLeftBorder + frameRightBorder, vyskaOkna + frameBottomBorder + frameTopBorder));
        okno.setMinimumSize(new Dimension(sirkaOkna + frameLeftBorder + frameRightBorder, vyskaOkna + frameBottomBorder + frameTopBorder));
        okno.setLocationRelativeTo(null);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.addMouseListener(this);
        okno.requestFocus();
        okno.setVisible(true);
        okno.add(game);
    }

    public void sestavitHraciPlochu(){
        for(int sloupec=0; sloupec < (pocetCtvrc); sloupec+=2){
            gameData[sloupec][5] = oranzova;
            gameData[sloupec][7] = oranzova;
        }
        for(int sloupec=1; sloupec < (pocetCtvrc); sloupec+=2)
            gameData[sloupec][6] = oranzova;
        for(int sloupec=1; sloupec < (pocetCtvrc); sloupec+=2){
            gameData[sloupec][0] = zluta;
            gameData[sloupec][2] = zluta;
        }
        for(int sloupec=0; sloupec < (pocetCtvrc); sloupec+=2)
            gameData[sloupec][1] = zluta;
    }

    public static void vybratDamu(int sloupec, int radek, Graphics g, Color color){
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setColor(color);
        g.fillOval((sloupec*ctvrcPlocha)+2, (radek*ctvrcPlocha)+2, ctvrcPlocha-4, ctvrcPlocha-4);
    }

    public void paint(Graphics g){
        super.paintComponent(g);
        for(int radek = 0; radek < pocetCtvrc; radek++){
            for(int sloupec = 0; sloupec < pocetCtvrc; sloupec++){
                if((radek%2 == 0 && sloupec%2 == 0) || (radek%2 != 0 && sloupec%2 != 0)){
                    damaArray[sloupec][radek] = 0;
                    g.setColor(Color.white);
                    g.fillRect(sloupec*ctvrcPlocha, radek*ctvrcPlocha, ctvrcPlocha, ctvrcPlocha);
                }
                else{
                    damaArray[sloupec][radek] = 1;
                    g.setColor(Color.darkGray);
                    g.fillRect(sloupec*ctvrcPlocha, radek*ctvrcPlocha, ctvrcPlocha, ctvrcPlocha);
                }
                if(teamChecker(sloupec, radek)){
                    g.setColor(Color.darkGray.darker());
                    g.fillRect(sloupec*ctvrcPlocha, radek*ctvrcPlocha, ctvrcPlocha, ctvrcPlocha);
                }
                if(moznoHrat[sloupec][radek] == 1){
                    g.setColor(Color.white.darker());
                    g.fillRect(sloupec*ctvrcPlocha, radek*ctvrcPlocha, ctvrcPlocha, ctvrcPlocha);
                }
                if(gameData[sloupec][radek] == zluta)
                    vybratDamu(sloupec, radek, g, Color.yellow);
                else if(gameData[sloupec][radek] == zluta_kralovna){
                    vybratDamu(sloupec, radek, g, Color.yellow);
                    g.drawImage(susyKralovna, (sloupec*ctvrcPlocha)+6, (radek*ctvrcPlocha)+6, ctvrcPlocha-10, ctvrcPlocha-10, null);
                }
                else if(gameData[sloupec][radek] == oranzova)
                    vybratDamu(sloupec, radek, g, Color.red);
                else if(gameData[sloupec][radek] == oranzova_kralovna){
                    vybratDamu(sloupec, radek, g, Color.red);
                    g.drawImage(susyKing, (sloupec*ctvrcPlocha)+6, (radek*ctvrcPlocha)+6, ctvrcPlocha-12, ctvrcPlocha-12, null);
                }
            }
        }
        if(konecHry())
            konecHryText(g);
    }
    public void konecHryText(Graphics g) {
        String msg = "GG one of you won";
        Font small = new Font("Helvetica", Font.BOLD, 40);
        FontMetrics metr = getFontMetrics(small);
        g.setColor(Color.BLACK);
        g.setFont(small);
        g.drawString(msg, (sirkaOkna - metr.stringWidth(msg)) / 2, sirkaOkna / 2);
    }

    public void resetHry(){
        sloupecSloupec = 0;
        storedradek = 0;
        beziHra = false;
        moveMak = false;
        for(int radek = 0; radek < pocetCtvrc; radek++){
            for(int sloupec = 0; sloupec < pocetCtvrc; sloupec++){
                moznoHrat[sloupec][radek] = 0;
            }
        }
        repaint();
    }

    public void mousePressed(java.awt.event.MouseEvent evt) {
        int sloupec = (evt.getX()-8) / ctvrcPlocha;
        int radek = (evt.getY()-30) / ctvrcPlocha;
        if(!beziHra && gameData[sloupec][radek] != 0 || beziHra && teamChecker(sloupec, radek)){
            resetHry();
            sloupecSloupec = sloupec;
            storedradek = radek;
            getmoznoHrat(sloupec, radek);
        }
        else if(beziHra && moznoHrat[sloupec][radek] == 1){
            makeMove(sloupec, radek, sloupecSloupec, storedradek);
        }
        else if(beziHra && moznoHrat[sloupec][radek] == 0){
            resetHry();
        }
    }

    public void hracChanger(){
        if(currentPlayer == oranzova)
            currentPlayer = zluta;
        else currentPlayer = oranzova;
    }

    public void makeMove(int sloupec, int radek, int sloupecSloupec, int storedradek){
        int x = gameData[sloupecSloupec][storedradek];
        gameData[sloupec][radek] = x;
        gameData[sloupecSloupec][storedradek] = nulaCheck;
        kralovnaJe(sloupec, radek);
        if(moveMak)
            preskocenaDama(sloupec, radek, sloupecSloupec, storedradek);
        resetHry();
        hracChanger();
    }
    public void kralovnaJe(int sloupec, int radek){
        if(gameData[sloupec][radek] == oranzova && radek == 0)
            gameData[sloupec][radek] = oranzova_kralovna;
        else if(gameData[sloupec][radek] == zluta && radek == pocetCtvrc-1)
            gameData[sloupec][radek] = zluta_kralovna;
    }
    public void preskocenaDama(int sloupec, int radek, int sloupecSloupec, int storedradek){
        int pieceradek = -1;
        int piecesloupec = -1;
        if(sloupec > sloupecSloupec && radek > storedradek){
            pieceradek = radek-1;
            piecesloupec = sloupec-1;
        }
        if(sloupec > sloupecSloupec && radek < storedradek){
            pieceradek = radek+1;
            piecesloupec = sloupec-1;
        }
        if(sloupec < sloupecSloupec && radek > storedradek){
            pieceradek = radek-1;
            piecesloupec = sloupec+1;
        }
        if(sloupec < sloupecSloupec && radek < storedradek){
            pieceradek = radek+1;
            piecesloupec = sloupec+1;
        }
        gameData[piecesloupec][pieceradek] = nulaCheck;
    }

    public void getmoznoHrat(int sloupec, int radek){
        beziHra = true;
        if((teamChecker(sloupec, radek))){
            if(gameData[sloupec][radek] == oranzova){
                tahNahoru(sloupec, radek);
            }
            if(gameData[sloupec][radek] == zluta){
                tahDolu(sloupec, radek);
            }
            if(gameData[sloupec][radek] == oranzova_kralovna || gameData[sloupec][radek] == zluta_kralovna){
                tahNahoru(sloupec, radek);
                tahDolu(sloupec, radek);
            }
            repaint();
        }
    }

    public void tahNahoru(int sloupec, int radek){
        int radekUp = radek-1;
        if(sloupec == 0 && radek != 0){
            for(int i = sloupec; i < sloupec+2; i++){
                if(gameData[sloupec][radek] != 0 && gameData[i][radekUp] != 0){
                    if(tahChecker(sloupec, radek, i, radekUp)){
                        int jumpsloupec = kamPosunout(sloupec, radek, i, radekUp)[0];
                        int jumpradek = kamPosunout(sloupec, radek, i, radekUp)[1];
                        moznoHrat[jumpsloupec][jumpradek] = 1;
                    }
                }
                else if(damaArray[i][radekUp] == 1 && gameData[i][radekUp] == 0)
                    moznoHrat[i][radekUp] = 1;
            }
        }
        else if(sloupec == (pocetCtvrc - 1) && radek != 0){
            if(gameData[sloupec][radek] != 0 && gameData[sloupec-1][radekUp] != 0){
                if(tahChecker(sloupec, radek, sloupec - 1, radekUp)){
                    int jumpsloupec = kamPosunout(sloupec, radek, sloupec-1, radekUp)[0];
                    int jumpradek = kamPosunout(sloupec, radek, sloupec-1, radekUp)[1];
                    moznoHrat[jumpsloupec][jumpradek] = 1;
                }
            }
            else if(damaArray[sloupec-1][radekUp] == 1 && gameData[sloupec-1][radekUp] == 0)
                moznoHrat[sloupec-1][radekUp] = 1;
        }
        else if(sloupec != pocetCtvrc - 1 && sloupec != 0 && radek != 0){
            for(int i = sloupec-1; i <= sloupec+1; i++){
                if(gameData[sloupec][radek] != 0 && gameData[i][radekUp] != 0){
                    if(tahChecker(sloupec, radek, i, radekUp)){
                        int jumpsloupec = kamPosunout(sloupec, radek, i, radekUp)[0];
                        int jumpradek = kamPosunout(sloupec, radek, i, radekUp)[1];
                        moznoHrat[jumpsloupec][jumpradek] = 1;
                    }
                }
                else if(damaArray[i][radekUp] == 1 && gameData[i][radekUp] == 0)
                    moznoHrat[i][radekUp] = 1;
            }
        }
    }

    public void tahDolu(int sloupec, int radek){
        int radekDown = radek+1;
        if(sloupec == 0 && radek != pocetCtvrc-1){
            if(gameData[sloupec][radek] != 0 && gameData[sloupec+1][radekDown] != 0){
                if(tahChecker(sloupec, radek, sloupec + 1, radekDown)){
                    int jumpsloupec = kamPosunout(sloupec, radek, sloupec+1, radekDown)[0];
                    int jumpradek = kamPosunout(sloupec, radek, sloupec+1, radekDown)[1];
                    moznoHrat[jumpsloupec][jumpradek] = 1;
                }
            }
            else if(damaArray[sloupec+1][radekDown] == 1 && gameData[sloupec+1][radekDown] == 0)
                moznoHrat[sloupec+1][radekDown] = 1;
        }
        else if(sloupec == pocetCtvrc - 1 && radek != pocetCtvrc-1){
            if(gameData[sloupec][radek] != 0 && gameData[sloupec-1][radekDown] != 0){
                if(tahChecker(sloupec, radek, sloupec - 1, radekDown)){
                    int jumpsloupec = kamPosunout(sloupec, radek, sloupec-1, radekDown)[0];
                    int jumpradek = kamPosunout(sloupec, radek, sloupec-1, radekDown)[1];
                    moznoHrat[jumpsloupec][jumpradek] = 1;
                }
            }
            else if(damaArray[sloupec-1][radekDown] == 1 && gameData[sloupec-1][radekDown] == 0)
                moznoHrat[sloupec-1][radekDown] = 1;
        }
        else if(sloupec != pocetCtvrc-1 && sloupec != 0 && radek != pocetCtvrc-1){
            for(int i = sloupec-1; i <= sloupec+1; i++){
                if(gameData[sloupec][radek] != 0 && gameData[i][radekDown] != 0){
                    if(tahChecker(sloupec, radek, i, radekDown)){
                        int jumpsloupec = kamPosunout(sloupec, radek, i, radekDown)[0];
                        int jumpradek = kamPosunout(sloupec, radek, i, radekDown)[1];
                        moznoHrat[jumpsloupec][jumpradek] = 1;
                    }
                }
                else if(damaArray[i][radekDown] == 1 && gameData[i][radekDown] == 0)
                    moznoHrat[i][radekDown] = 1;
            }
        }
    }

    public boolean teamChecker(int sloupec, int radek){
        if(currentPlayer == oranzova && (gameData[sloupec][radek] == oranzova || gameData[sloupec][radek] == oranzova_kralovna))
            return true;
        return currentPlayer == zluta && (gameData[sloupec][radek] == zluta || gameData[sloupec][radek] == zluta_kralovna);
    }

    public boolean poziceChecker(int sloupec, int radek){
        return radek >= 0 && radek < pocetCtvrc && sloupec >= 0 && sloupec < pocetCtvrc;
    }

    public boolean tahChecker(int sloupec, int radek, int sloupecEnemy, int radekEnemy){
        if(((gameData[sloupec][radek] == zluta || gameData[sloupec][radek] == zluta_kralovna) && (gameData[sloupecEnemy][radekEnemy] == oranzova
                || gameData[sloupecEnemy][radekEnemy] == oranzova_kralovna)) 
                || (gameData[sloupec][radek] == oranzova || gameData[sloupec][radek] == oranzova_kralovna) && (gameData[sloupecEnemy][radekEnemy] == zluta
                || gameData[sloupecEnemy][radekEnemy] == zluta_kralovna)){
            if(sloupecEnemy == 0 || sloupecEnemy == pocetCtvrc-1 || radekEnemy == 0 || radekEnemy == pocetCtvrc-1)
                return false;
            int[] toData = kamPosunout(sloupec, radek, sloupecEnemy, radekEnemy);
            if(!poziceChecker(toData[0], toData[1]))
                return false;
            if(gameData[toData[0]][toData[1]] == 0){
                moveMak = true;
                return true;
            }
        }
        return false;
    }

    public int[] kamPosunout(int sloupec, int radek, int sloupecEnemy, int radekEnemy){
        if(sloupec > sloupecEnemy && radek > radekEnemy && gameData[sloupec-2][radek-2] == 0)
            return new int[] {sloupec-2, radek-2};
        else if(sloupec > sloupecEnemy && radek < radekEnemy && gameData[sloupec-2][radek+2] == 0)
            return new int[] {sloupec-2, radek+2};
        else if(sloupec < sloupecEnemy && radek > radekEnemy && gameData[sloupec+2][radek-2] == 0)
            return new int[] {sloupec+2, radek-2};
        else
            return new int[] {sloupec+2, radek+2};
    }
    public boolean konecHry(){
        return konecHryInternal(0, 0, 0, 0);
    }
    public static void main(String[] args){
        new Dama();
    }
}
