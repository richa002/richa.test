public class WhehterOnlyDigits {
    public static void main(String[] args) {
       check("432423ds") ;
    }
    public static void check(String s){
        System.out.println(s.matches("\\d*"));
    }
}
