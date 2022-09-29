package baf;
import java.util.Random;
import java.util.*;
public class RPS {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int skore = 0;
        int RPS = 3;
        String PCMove = "";
        String GamerMove = "";
        while(true){
            System.out.println("Zadejte kamen nebo nuzky nebo papir");
            GamerMove = scan.nextLine();

            System.out.println("Tvoje Skore je: " + skore);
            if (GamerMove.equals("end")){
                break;
            }

            if (!GamerMove.equals("kamen") && !GamerMove.equals("nuzky") && !GamerMove.equals("papir")){
                System.out.println("Dude nezadal jsi kamen nebo nuzky nebo papir");
            } else {
                int rando = random.nextInt(RPS);

                if (rando == 1){
                    PCMove = "kamen";
                } else if (rando == 2){
                    PCMove = "nuzky";
                } else if (rando == 3){
                    PCMove = "papir";
                }
                
                if (PCMove.equals(GamerMove)){
                    System.out.println("Skoro");
                } else if(((GamerMove.equals("rock") && GamerMove.equals("scissors")) || (GamerMove.equals("scissors") && GamerMove.equals("paper")) || (GamerMove.equals("paper") && GamerMove.equals("rock")))){
                    System.out.println("WP you won kid");
                    skore++;
                }else{
                    System.out.println("Es you noob");
                }
            }


        }
        System.out.println("Dont play this game anymore thx");
    }
}
