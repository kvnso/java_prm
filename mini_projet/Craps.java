import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static int lancerDeuxDee(){
        Random generateur = new Random();
        int d1 = generateur.nextInt(6) + 1 ;
        int d2 = generateur.nextInt(6) + 1 ;
        int somme = d1 + d2 ;
        System.out.println("Vous avez lancé " + d1 + " et " + d2 + ". La somme est " + somme + "." );
        return somme ; 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=".repeat(34) );
        System.out.println("| Bievenue a toi nouveau joueur |");
        System.out.println("=".repeat(34) );
        System.out.println();

        int jeton = 10 ;
        int mise  ;
        boolean zero = false ;
        while(jeton > 0 && !zero ) {
            System.out.println("Vous avez "+jeton + " jetons");
            System.out.print("Combien de jeton voulez vous miser ? (0 pour arreter) : ");
            mise = scan.nextInt();
            if(mise == 0){
                zero = true;
            }else if(mise < 0){
                System.out.println("Vous essayez de rouler le casino. Votre mise doit être entre 1 et " + jeton + ". Recommencez.");
                System.out.println();
            }
            else {
                int somme_de = lancerDeuxDee() ; 
                if (somme_de == 7 || somme_de == 11) {
                    System.out.println("Gagné");
                    jeton += mise  ;
                } else if (somme_de == 2 || somme_de == 3 || somme_de == 12) {
                    System.out.println("Perdu !");
                    jeton -= mise ;

                } else {
                    int but = somme_de;
                    boolean arret = false;
                    System.out.println("Votre nouveau but est " + somme_de);
                    while (!arret) {
                        somme_de = lancerDeuxDee();
                        if (somme_de == but) {
                            System.out.println("Gagné");
                            arret = true;
                            jeton += mise;
                        }
                        else if  (somme_de == 7) {
                            System.out.println("Perdu !");
                            arret = true;
                            jeton -= mise;
                        }
                    }

                }
            }
        }
        System.out.println("Nombre de jetons: " + jeton);
        System.out.println("Merci et à bientot !");
    }
}
