import java.util.Scanner;

public class Strings {
    //ex 1
    public static boolean EstMin(char c ){
        boolean res = false;
        if (c >= 'a' && c <= 'z'){
            res = true ;
        }return res ;
    }
    //ex 2
    public static char ConversionMaj(char c ){
        char conv = c ;
        if(EstMin(c)){
            conv = (char)((int) c - ((int) 'a' - (int) 'A')) ;
        }return conv ;
    }
    //ex 3
    public static boolean UniquementMin(String s ){
        boolean check = true ;
        for(int i = 0; i < s.length() && check; i++ ){
            if (!EstMin(s.charAt(i))){
                check = false ;
            }
        }return check ;
    }
    //ex 4
    public static String EnMaj(String s ){
        String copy = " ";
        for(int i = 0 ; i < s.length(); i++){
            if(EstMin(s.charAt(i))) {
                copy += ConversionMaj(s.charAt(i));
            }else {
                copy += s.charAt(i);

            }
        }return copy;
    }
    //ex 5
    public static int NbApparition(String s , char c ){
        int rep = 0 ;
        for (int i = 0 ; s.length() > i ; i ++ ){
            if (s.charAt(i) == c  ){
                rep++;
            }
        }return  rep ;
    }
    //ex 6
    public static String Reverse(String s ){
        String coppy = "" ;
        for(int i = s.length() -1  ; i >= 0  ; i--){
            coppy += s.charAt(i);

        }return coppy;
    }
    //ex 7
    public static boolean EstPalindrome(String s ){
        return s.compareTo(Reverse(s)) == 0 ;
    }

    public static boolean EstPalindromePhrase(String s ) {
        boolean check = true;
        int a = 0, b = s.length() - 1;
        while (a < b && check) {
            if (s.charAt(a) == ' ') {
                a++;
            } else if (s.charAt(b) == ' ') {
                b--;
            }else {
                check = ConversionMaj(s.charAt(a)) == ConversionMaj(s.charAt(b));
                a++;
                b--;
            }
        }return check ;

    }
    // ex 9
    public static int PremierApparition(String s , char c ){
        boolean trouve = false ;
        int res = -1 ;
        for (int i = 0 ; i < s.length() && !trouve ; i++){
            if(s.charAt(i) == c ){
                res = i ;
                trouve = true ;
            }
        }return res ;
    }
    //ex 10
    public static boolean sontEgaux(String s1 , String s2 ){
        boolean egaux = false  ;
        if(s1.length() == s2.length()){
            egaux = true ;
            for (int i = 0 ; s1.length() > i && egaux ; i++ ){
                if(s1.charAt(i) != s2.charAt(i)){
                    egaux = false ;
                }
            }
        }return egaux;
    }
    //ex 11
    public static boolean inclus(String ssch , String ch){
        int pos_ssch = 0 ;
        for (int i = 0 ; i < ch.length() && pos_ssch < ssch.length() ; i++){
            if (ch.charAt(i) == ssch.charAt(pos_ssch)){
                pos_ssch ++ ;
            }
       }
        System.out.println(pos_ssch);
        return pos_ssch == ssch.length();
    }
    //ex 12
    public static int compare(String ch1 , String ch2){
        int i = 0 , lg = Math.min(ch1.length(),ch2.length());
        while (i < lg && ch1.charAt(i) == ch2.charAt(i)){
            i++ ;
        }if(i == lg ){
            return ch1.length() - ch2.length();
        }else {
            return (int) ch1.charAt(i) - (int) ch2.charAt(i);
        }
    }
    //ex 13
    public static String correctMaj(String s ){
        String copy = "";
        copy += ConversionMaj(s.charAt(0));
        for (int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i-1) == ' ' ){
                copy += ConversionMaj(s.charAt(i));
            }else {
                copy += s.charAt(i);
            }
        }return copy;
    }
    //ex 14
    public static String intPositifToString(int x){
        if (x < 0 ){
            throw new RuntimeException("seulement des nombres positif");}
     return  "dsdsd" ;
    }
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println(intPositifToString(0));


    }
}