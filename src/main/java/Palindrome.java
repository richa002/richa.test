public class Palindrome {
    public static void main(String[] args) {
        checkPalindrome("sanas");
    }
    public  static void checkPalindrome(String s){
        boolean flag=true;
        for(int i=0;i<(s.length()-1)/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                flag=false;
            }
        }
        System.out.println(flag);
    }
}
