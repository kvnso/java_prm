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
     * prec       5 1 1 2 3 4 4 8 8 8 1  prec = e 
     * e        5 1 1 2 3 4 4 8 8 8 1 2 e = it.next()
     * max      5 5 5 5 5 5 5 8 8 8 8 8  if(e > max) max = e 
     * res      0 0 0 0 0 0 0 5 5 5 5 5  if (e > max ) res = nbplat ;    
     * nbplat   1 2 2 3 4 5 5 6 6 6 7 8  if( e != it.next()) nbplat++ ; 
     */ 
    public static int nbPlatAvantPremierMax( SeqInt s ){
        SeqIntIterator it = s.iterator();
        int res = 0  ; 
        if (it.hasNext()){
            int e = it.next();
            int  max = e ; 
            int nbPlat = 1 ;
            while (it.hasNext()){
                int prec = e ;
                e = it.next();
                if (e != prec){
                    if ( e > max ){
                        max = e ; 
                        res = nbPlat ; 
                    }
                    nbPlat ++ ;
                }
            }
        }return res ;
    }
                
    /* ex 4  
    prec          5 1 4 3 3 2 2 5 1 1 7 1 1    prec = e 
    e           5 1 4 3 3 2 2 5 1 1 7 1 1 2  e = it.next()                 
    max         5 5 5 5 5 5 5 5 5 5 7 7 7 7  if(max < e) max = e
    res         0 1 2 3 3 4 4 0 1 1 0 1 1 2  if(e >= max) res = 0 else if (prec != e) res++     
    */ 
    
    public static int nbPlatApresMax( SeqInt s ) {
        SeqIntIterator it = s.iterator();
        int res = 0 ;
        if (it.hasNext()){
            int e = it.next();
            int max = e ;
            while (it.hasNext()) {
              int prec = e ;
              e = it.next();
              if (e >= max ){
                  max = e ; 
                  res = 0 ;
              }
              else if (prec != e ){
                  res ++ ;
              }
            }
        }return res ;
    }
    
    
    /* ex 5 
     * prec       2 2 2 1 1 4 5 5 5 4 4 1 1 prec = e 
     * e        2 2 2 1 1 4 5 5 5 4 4 1 1 1 e = it.next()
     * res      0 0 1 1 1 1 1 1 2 2 2 2 2 3 if ( lg == 3 ) res ++ 
     * lg       1 2 3 1 2 1 1 2 3 1 2 1 2 3 if ( prec != e ) lg = 1 ; else lg++ 
    */
    
    public static int lgPlatEgale3( SeqInt s ) {

        SeqIntIterator it = s.iterator();
        int res = 0 ; 
        if (it.hasNext()){
            int e = it.next();
            int lg = 1 ;
            while (it.hasNext()){
                int prec = e ; 
                e = it.next();
                if ( prec != e ){
                    lg = 1 ;
                }else{
                    lg++ ;
                    if ( lg == 3 )
                        res++ ;
                 }
            }
        }return res ; 
    }
                
   /* ex 6 
    * prec     5 5 5 3 2 2 1 1 2 7 7 7 7 2 1  prec = e    
    * e      5 5 5 3 2 2 1 1 2 7 7 7 7 2 1 1  e = it.next()       
    * lg     1 2 3 1 1 2 1 2 1 1 2 3 4 1 1 2  if ( prec != e ) lg = 1 ; else lg++  
    * LG 2   0 1 1 1 1 2 2 3 3 3 4 4 4 4 4 5  if (lg == LG ) res++ 
    */

    public static int lgPlatEgaleLG ( SeqInt s , int LG){
    
        SeqIntIterator it = s.iterator();
        int res = 0 ; 
        if (it.hasNext()){
            int e = it.next();
            int lg = 1 ;
            if (lg == LG)
               res = 1 ; 
            while (it.hasNext()) {
                int prec = e ;
                e = it.next();
                if (prec != e ) 
                    lg = 1 ; 
                else
                    ++lg ; 
                if (lg == LG) 
                    res ++ ;
            }
        }return res ;
    }

   /* ex 7 
    *prec     5 3 3 1 2 1 2 4 6 1 1 3 4 2 prec = e 
    * e     5 3 3 1 2 1 2 4 6 1 1 3 4 2 1 e = it.next() 
    *
    * lg    1 2 3 4 1 1 1 2 3 1 2 3 1 2 1  if ( e % 2 == prec % 2 )  
    * LG 1  1 0 0 0 1 2 3 2 2 3 2 2 3 2 3  if ( lg == 1 ) res ++ else if ( lg == n + 1) res --  
    * LG 2  1 1 0 0 1 2 3 3 2 3 3 2 3 3 4   
    *
    */                
    public static int nbPariteEgaleLG( SeqInt s , int LG){
        
        SeqIntIterator it = s.iterator();
        int res = 0 ;
        if (it.hasNext()){
            int e = it.next();
            int lg = 1 ;
            res = 1 ;
            while (it.hasNext()) {
                int prec = e ;
                e = it.next();
                if ( e % 2 == prec % 2 ){
                    lg++ ; 
                    if (lg == LG + 1)
                        --res ;
                }else {
                    lg = 1 ;
                    res ++ ; 
                }
            }   
        }return res ;
    }    
    
    /* ex 8 
     * prec       1 1 2 2 2 3 3 1 1 1 2 2 2 2 5 1  e = prec 
     * e        1 1 2 2 2 3 3 1 1 1 2 2 2 2 5 1 1  e = it.next()
     * res      0 0 0 0 1 1 1 1 1 2 2 2 3 2 2 2 2  if ( lg == 3 ) ++res else if ( lg > 3 ) res --  
     * lg       1 2 1 2 3 1 2 1 2 3 1 2 3 4 1 1 2  if ( prec != e ) lg = 1 else  ++lg 
     *
     */ 

    public static int platEgal3 ( SeqInt s ){

        SeqIntIterator it = s.iterator();
        int res = 0 ;
        if (it.hasNext()){
            int e = it.next();
            int lg = 1 ;
            while (it.hasNext()){
                int prec = e ; 
                e = it.next();
                if ( prec != e ){
                    if (lg == 3 )
                        ++res ; 
                    lg = 1 ; 
                }else {
                    ++lg ; 
                }
            }if (lg == 3)
                ++res ;
        }return res ; 
    } 
    
    /* ex 9  
     * prec     1 2 2 3 1 1 1 2 4 3 3 5 5  prec = e   
     * e      1 2 2 3 1 1 1 2 4 3 3 5 5 1  e = it.next() 
     * lg     1 1 2 1 1 2 3 1 1 1 2 1 2 1  if ( prec != e ) lg = 1 else lg++  
     * res    1 2 1 2 3 2 2 3 4 5 4 5 4 5  if ( lg == 1 ) ++res 
     *
     */            

    public static int platEgal1( SeqInt s ){
        SeqIntIterator it = s.iterator();
        int res = 0 ; 
        if (it.hasNext()){
            int e = it.next();
            int lg = 1 ; 
            while (it.hasNext()){
                int prec = e ;
                e = it.next();
                if (prec != e ){
                    if (lg == 1 ){
                        ++res ;
                    }
                    lg = 1 ;
                }else{
                   ++lg ;
                }
            }if (lg == 1 ) 
                ++res ; 
        }return res ; 
    }
     
    /* ex 10
     * prec      2 2 1 1 1 3 4 4 4 1 3 3 2 1 1 1 4 4 prec = e 
     * e       2 2 1 1 1 3 4 4 4 1 3 3 2 1 1 1 4 4 3 e = it.next()
     * lg      1 2 1 2 3 1 1 2 3 1 1 2 1 1 2 3 1 2 1 if(e != prec) lg = 1 else ++lg 
     * lg 2    0 1 1 2 1 1 1 2 1 1 1 2 2 2 3 2 2 3 3  
     * lg 1    1 0 1 0 0 1 2 1 1 2 3 2 3 4 3 3 4 3 4 
     * res   if (lg == LG) ++res else if (lg = LG + 1 ) --res   
     *
     */

    public static int nbPlatLong ( SeqInt s , int LG){

        SeqIntIterator it = s.iterator();
        int res = 0 ;
        if(it.hasNext()){
            int e = it.next();
            int lg = 1 ;
            if ( LG == 1 ){
               res = 1 ; 
            } 
            while (it.hasNext()) {
                int prec = e ;
                e = it.next();
                if (e != prec){
                    lg = 1 ;
                }else {
                    ++lg ;
                }if ( lg == LG){
                    ++res ; 
                }else if ( lg == LG + 1 ){
                    --res ; 
                }
                
            }
        }return res ;
    }

   /* ex 11 
    * prec       1 1 5 2 4 1 2 4 2 1 3 5 2  prec = e 
    * e        1 1 5 2 4 1 2 4 2 1 3 5 2 1  e = it.next()
    * lg       1 2 3 1 2 1 1 2 3 1 2 3 1 1  if ( e % 2 == prec % 2 ) ++lg  else lg = 1 ; 
    * LG 1     1 0 0 1 0 1 2 1 1 2 1 1 2 3 
    * LG 3     0 0 1 1 1 1 1 1 2 2 2 3 3 3 if ( lg == LG ) ++res  else if ( lg == LG + 1 ) --res  
    * 
    */         

    public static int nbPariteLG(SeqInt s , int LG){
        SeqIntIterator it = s.iterator();
        int res = 0 ; 
        if( it.hasNext()){
            int e = it.next();
            int lg = 1 ; 
            if(LG == 1 ){
                res = 1 ; 
            }
            while (it.hasNext()) {
                int prec = e ; 
                e = it.next();
                if ( e % 2 == prec % 2 ){
                    ++lg ;
                }else {
                    lg = 1 ;
                }
                if( lg == LG ){
                    ++res ; 
                }else if( lg == LG + 1 ){
                    --res ; 
                }
            }
        }return res ; 
    }
 
  /* 
   * prec     1 1 3 3 3 2 2 1 2 2 4 4 4 2 1 prec = e 
   * e      1 1 3 3 3 2 2 1 2 2 4 4 4 2 1 1 e = it.next()
   * lg     1 2 1 2 3 1 2 1 1 2 1 2 3 1 1 2  if(prec != e ) res = 1 else res++ 
   * [1;2]  1 1 2 2 1 2  
   *
   *
   *
   */     
            
                
            
    
    public static void main(String[] args) {

        SeqInt s = new SeqInt(1 ,1 ,5 ,2 ,4 ,1 ,2 ,4 ,2 ,1 ,3 ,5 ,2 ,1 );
        SeqInt s1 = new SeqInt(1);
        System.out.println("3  = " + nbPariteLG(s, 2));
    }

}
