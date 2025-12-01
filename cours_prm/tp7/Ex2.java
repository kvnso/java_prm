import java.util.Scanner;

public class Ex2 {

    public static double moyenne(double a, double  b){
        return  (a+ b)/ 2 ; 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(moyenne(x,y));
  
                }  
}
