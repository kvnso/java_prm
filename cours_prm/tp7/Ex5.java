import java.util.Scanner;

public class Ex5 {

    public static boolean pair(int a){
        return a % 2 == 0 ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (pair(a)) {
            System.out.println("Est paire");
        }else {
            System.out.println("Pas paire");
        }
    }
}
