import eu.epfc.prm.Array;

import java.util.Scanner;


public class Liste {
    //ex1
    public static int somme(Array<Integer> liste){
        int somme = 0;
        for (int i = 0 ; i < liste.size(); i++) {
            somme += liste.get(i);
        }
        return somme ;
    }
    //ex 2
    public static double moyenne(Array<Integer> list){
        int nb = 0 ;
        for (int i = 0 ; i < list.size(); i++){
            nb ++ ;
        }return (double) somme(list) /nb ;
    }
    //ex 3
    public static boolean Apparait(Array<Integer> list , int n ){
        boolean apparait = false ;
        for (int i = 0 ; i < list.size(); i++){
            if(list.get(i) == n){
                apparait = true ;
            }
        }return apparait ;
    }
    //ex 3 bis
    public static boolean Apparaitbis(Array<Integer> list , int n ){
        boolean apparait = false ;
        Scanner s = new Scanner(System.in);
        System.out.println("Par ou voulez vous commencer ?");
        int pos = s.nextInt() ;
        if (pos >= list.size() || pos < 0 )
            throw new IndexOutOfBoundsException("position en dehors de la liste");
        for (int i = pos ; i < list.size(); i++){
            if(list.get(i) == n){
                apparait = true ;
            }
        }return apparait ;
    }
    //ex 4
    public static int PrmAppa(Array<Integer> list , int n ){
        int pos = -1 ;
        boolean pas = true ;
        for(int i = 0 ; i < list.size() && pas; i++ ){
            if (list.get(i) == n ) {
                pos = i ;
                pas = false;
            }
        }
        return pos ;
    }
    //ex 5
    public static int DerniereApparition(Array<Integer> list , int n ){
        int pos = -1 ;
        for(int i = 0 ; i < list.size(); i++){
            if (list.get(i) == n ){
                pos = i ;
            }
        }return pos ;
    }
    //ex 6
    public static void EchangePos(Array<Integer> tab , int a , int b ){
        if (a > tab.size() -1 || b > tab.size() -1 || a < 0 || b < 0 ){
            throw new RuntimeException("La position est en dehors du tableau");
        }
        int temp = tab.get(a);
        tab.set(a,tab.get(b));
        tab.set(b,temp);
    }
    //ex 7
    public static void InversionTableau(Array<Integer> tab ){
        for(int i = 0 ; i < tab.size()/2 ;i++){
            int val_a = tab.get(i);
            int val_b = tab.get(tab.size()- i - 1 );
            tab.set(i , val_b);
            tab.set(tab.size() - i - 1 , val_a );
        }

    }
    //ex 8

    public static void PermutationCycliqueGauche(Array<Integer> tab ){
        if(!tab.isEmpty()){
            int val_0 = tab.get(0);
            for (int i = 1; i < tab.size(); i++) {
                int n = tab.get(i);
                tab.set(i - 1, n);
            }
            tab.set(tab.size() - 1, val_0);
        }
    }
    //ex 9
    public static void PermutationCycliqueDroite(Array<Integer> tab ){
        if(!tab.isEmpty()){
            int tmp = tab.get(tab.size()-1);
            for(int i = tab.size() -2 ; i >= 0 ; i-- ){
                tab.set( i+1 , tab.get(i));
            } tab.set(0 , tmp);
        }
    }
    //ex 10
    public static void insert(Array<Integer> tab , int n , int pos ){
        if(pos <= tab.size() && pos >= 0 ) {
            tab.add(0);
            for (int i = tab.size() - 2 ; i >= pos ; i-- ){
                tab.set(i+1 , tab.get(i));
            }tab.set(pos,n);
        }
    }

    //ex 11
    public static void delete(Array<Integer> tab , int pos ){
        if (pos < tab.size() && pos >= 0 ){
            for(int i = pos + 1  ; i < tab.size() ; i ++  ) {
                tab.set(i - 1, tab.get(i));
            }tab.reduceTo(tab.size() - 1 );
        }

    }
    //ex 12
    public static void deleteNb(Array<Integer> tab , int n ) {
        int compteur_curseur = 0;
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i) != n) {
                tab.set(compteur_curseur, tab.get(i));
                compteur_curseur++;
            }
        }
        tab.reduceTo(compteur_curseur);
    }
    //ex 12 bis
    public static void deleteNbPos(Array<Integer> tab , int n , int pos ) {
        int compteur_curseur = pos;
        for (int i = pos ; i < tab.size(); i++) {
            if (tab.get(i) != n ) {
                tab.set(compteur_curseur, tab.get(i));
                compteur_curseur++;
            }
        }
        tab.reduceTo(compteur_curseur);
    }
    //ex 13
    public static void deleteDoublon(Array<Integer> tab){
        int x = 0 ;
        while (x < tab.size()){
            deleteNbPos(tab , tab.get(x), x+1 );
            x++;
        }
    }
    public static void main() {
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3,4);
        Array<Integer> tab1 = new Array<>(1);
        deleteDoublon(tab);
        System.out.println(tab);
    }
}
