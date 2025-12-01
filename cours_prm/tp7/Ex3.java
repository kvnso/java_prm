import java.util.Scanner;

public class Ex3 {

    public static int max(int a , int b){
        int maximum = 0 ;
        if (a > b){
           maximum = a;
        }
        else {
           maximum = b ;
        }
       return maximum ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println(max(x, y));

    }


}
