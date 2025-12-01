import java.util.Scanner;

public class Ex4 {

    public static boolean negative(int a){
            
           return a < 0 ;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (negative(x)){
            System.out.println(x + " est negative");
    }else {
        System.out.println(x + " n'est pas negative");
    }
    
    }
}
