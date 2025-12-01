public class Ex7 {

    public static int puissance(int a , int x ){
        int produit = 1 ;  
        for (int cpt = 0 ; x > cpt ; ++cpt ){
            produit *= a   ;
        }
        return produit ;
    }
    public static void main(String[] args) {
        System.out.println(puissance(2, 4));
        System.out.println(puissance(-5, 3));
    }
}
