package baf;
import java.util.*;
public class Prumer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Zadávejte čísla dokuk chcete, pokud chcete vypočítat průměr zadejte END");
        int baf = 0;
        for (int x = 0; x < 1000;){

        if (scan.hasNextInt()){
             baf += scan.nextInt();
            x++;
        } else if (scan.hasNext("end")){
            int bum = baf/x;
            System.out.println("Průměr je: " + bum);
            break;
        }}
    }
}
