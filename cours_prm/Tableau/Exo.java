import eu.epfc.prm.Array ; 
public class Exo{
    public static int sommeTableau(Array<Integer> tab ){
        if(tab.isEmpty())
            throw new RuntimeException("Tableau vide");
           
        int somme = 0 ;
        for(int i = 0; i < tab.size();++i){
            somme += tab.get(i); 
        }
        return somme ;
    }
    public static boolean Apparait(Array<Integer> tab , int  n ){
        boolean res  = false ;
        for(int i = 0 ; i < tab.size() && !res; ++i){
            if (tab.get(i) == n)
                res = true  ;
        }

        return res ;
    }
    public static void main(String[] args) {

        Array<Integer> tab = new Array<>(1,2,3);
        System.out.println(Apparait(tab,1));
        System.out.println(Apparait(tab ,0));
        System.out.println(sommeTableau(new Array<Integer>()));
    
    }
}
