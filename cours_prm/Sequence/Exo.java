import seqint.SeqInt;
import seqint.SeqIntIterator;
public class Exo{
    //exo 1 
    public static boolean  estvide(SeqInt s){
        SeqIntIterator it  = s.iterator();
        return !it.hasNext();
    }
    //exo 2
    public static int nbVal(SeqInt s){
        SeqIntIterator it = s.iterator();
        int nb = 0 ;
        while(it.hasNext()){
            nb++ ;
            it.next();
        }return nb ; 
    }  
    //exo 3     
    public static int somme(SeqInt s){
        SeqIntIterator it = s.iterator();
        int somme = 0 ;
        while (it.hasNext()) {
            somme += it.next() ;

        }return somme ;
    }

    //exo 4 
    public static int nbApparition(SeqInt s , int n){
        SeqIntIterator it = s.iterator();
        int repet = 0 ;
        while (it.hasNext()){
            if (it.next()  == n){
                repet ++ ;
            }
        }return repet ;
    }
    //exo 5 
    public static double moyen(SeqInt s ){
        SeqIntIterator it = s.iterator();
        if (!it.hasNext()){
            throw new RuntimeException("Erreur : Moyenne du sequence vide ! ");
        }
        int somme = 0 ;
        int nb = 0 ;
        while(it.hasNext()){
            somme += it.next();
            nb += 1 ;

        }return  (double) somme / nb ;
    }
    //exo 6 
    public static int Max(SeqInt s ){
        SeqIntIterator it = s.iterator();
        int max = it.next() ;
        if(!it.hasNext()){
            throw new RuntimeException("Max impossible dans une sequence vide .");
        }
        while (it.hasNext()) {
            int current = it.next();
            if (current > max ){
                max = current ;
            }

        }return max ;
    }
    //exo 7  
    public static int PosDernierApp(SeqInt s , int n ){
        SeqIntIterator it = s.iterator();
        int pos = 0 ,pos_curent = 0 ;
        while (it.hasNext()) {
            int nb  = it.next();
            pos_curent++ ; 
            if( n == nb ){
                pos = pos_curent ;
            }
        }return pos ;
    }
    //exo 8 
    public static int PremierePos(SeqInt s , int n ){
        SeqIntIterator it = s.iterator();
        int  pos_curent = 0  ;
        boolean trouve = false ; 
        while (it.hasNext() && !trouve ) {
            int nb = it.next() ; 
            trouve = nb == n ;
            pos_curent ++ ; 
        }
        if(trouve) 
            return pos_curent ;
        else 
            return 0 ;

    }
    //exo 9 
    public static boolean Croissant(SeqInt s ){
        SeqIntIterator it = s.iterator();
        int prec ;
        boolean croissant = true ;
        if (it.hasNext()){
            int e  = it.next() ;

            while (it.hasNext() && croissant ) {
                prec = e ; 
                e = it.next();
                croissant = prec < e ;
            }   
        }
        return croissant ; 
    }
    //exo 10 
    public static boolean UnPalier(SeqInt s ){
        SeqIntIterator it = s.iterator(); 
        boolean resultat = false ;
        if(it.hasNext()){
            int e = it.next();

            while (it.hasNext() && !resultat) {
                int suiv = it.next();
                resultat = e == suiv ;
                e = suiv ;
                
            }
        }
        return resultat ;
    }
    //exo 11 
    public static int DernierMax(SeqInt s){
        SeqIntIterator it = s.iterator();
        int resultat = 0 ;
        if (it.hasNext()){
           int max = it.next();
           int position_courant = 1 ;
           resultat = 1 ;

           while (it.hasNext()){
              int current = it.next();
              position_courant += 1 ;
              if (current >=  max){
                 max = current ;
                 resultat = position_courant ;
              }
           }
        }return resultat ;
    } 
    //exo 12 
    public static int PremierMax(SeqInt s ){
       SeqIntIterator it = s.iterator();
       int resultat = 0 ;
        if (it.hasNext()){
           int max = it.next();
           int position_courant = 1 ;
           resultat = 1 ;
           while (it.hasNext()){
              int courant = it.next();
              position_courant ++ ;
              if (courant > max){
                  max = courant ;
                  resultat = position_courant;
              }
           }
        }return resultat ;
    }
    //exo 13 
    public static int NbMax(SeqInt s ){
        SeqIntIterator it = s.iterator();
        int resultat = 0 ; 
        if(it.hasNext()){
           int max = it.next();
           resultat  = 1 ;
           while (it.hasNext()){
               int current = it.next();
               if (current == max){
                   resultat ++ ;
               }else if (current > max){
                   resultat = 1 ;
                   max = current;
               }
           }
        }return resultat ;
    } 
    //ex 14
    public static int MaxNeg(SeqInt s ){
        SeqIntIterator it = s.iterator();
        int resultat = 0 ;
        boolean neg = false ;
        while (it.hasNext() && !neg ){
            int x = it.next();
            neg = x < 0 ;
            if (neg){
                resultat = x ;
        }
        }
        while (it.hasNext()){
            int x = it.next();
            if ( x < 0 && x > resultat){
                resultat = x ;
            }
        } return resultat ;
    }
    //ex 15  
                
                
            




            public static void main(String[] args) {
                SeqInt s = new SeqInt(1,-2,-1,7,-10,7,2,8);
                System.out.println(MaxNeg(s));
                SeqInt s1 = new SeqInt(5,1,3,4,5,5,5,0);
                System.out.println(MaxNeg(s1));

            }
    }
