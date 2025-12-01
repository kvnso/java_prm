public class Ex6 {

    public static int produit(int a , int b ){
        int somme = 0  ;
        if ( b < 0){
            b = -b ;
            a = -a ; 
        }
        for ( int cpt = 0 ; cpt < b ; ++cpt){
            somme +=a ;
        }
        return somme ; 
    }
    public static void main(String[] args) {
        System.out.println(produit(0,5));
        System.out.println(produit(-3, 3));
        System.out.println(produit(-5, 4));
        System.out.println(produit(5, -4 ));
        System.out.println(produit(-4, -5));
    }

}
