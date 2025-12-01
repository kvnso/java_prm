

public class Ex8 {

    public static int puissance(int a , int x ){
        int produit = 0 ;

        for (int i = 0 ; i < x ; ++i){
           for(int j = 0 ; j < x ; ++j){
              produit += a ;
           }
        }
        if (a<0){
            produit = - produit ;
        }
        return produit; 
                                
    }
    public static void main(String[] args) {
        System.out.println(puissance(2, 5));
    }
    
}
