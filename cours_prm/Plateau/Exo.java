import seqint.SeqInt;
import seqint.SeqIntIterator ;

public class Exo{

    /* ex1 
     * prec      1 1 2 3 4 4 5 1 4 4 prec = e ;
     * e       1 1 2 3 4 4 5 1 4 4 5 e = it.next();
     nb plat 0 1 1 2 3 4 4 5 6 7 7 8  if(prec !=  e ) 
                                        nbplat ++ ; 
    */ 
    public static int nbPlateau( SeqInt s ){
        SeqIntIterator it = s.iterator();
        int nbplat = 0 ;
        if (it.hasNext()){
           int e = it.next();
           nbplat = 1 ; 
           while (it.hasNext()) {
                int prec = e ;
                e = it.next();
                if ( prec != e ){
                    nbplat ++ ;
                }
            }    
        }return nbplat ;
    }

    /* ex2 
     * prec           1 2 4 2 1 3 5 2 5 3 1 2 3  prec = e ;
     * e            1 2 4 2 1 3 5 2 5 3 1 2 3 2  e = it.next();
     * nbParite   0 1 2 2 2 3 3 3 4 5 5 5 6 7 8  if( e % 2 != prec % 2 )
     *                                             nbParite ++ 
     */ 
    
    public static int nbParite ( SeqInt s ){
        SeqIntIterator it = s.iterator();
        int nbParite = 0 ;
        if(it.hasNext()){
            nbParite = 1 ;
            int e = it.next();
            while (it.hasNext()) {
                int prec = e ;
                e = it.next();
                if (e % 2 != prec % 2 ){
                    nbParite ++ ;
                }
            }
        }return nbParite ;
    }    
    
    /* ex 3 
     *
     *
     *
     */ 

    public static void main(String[] args) {

        SeqInt s = new SeqInt(1, 2, 4, 2, 1, 3, 5, 2, 5, 3, 1, 2, 3, 2);
        System.out.println("8 = " + nbParite(s)); 
    }


}
