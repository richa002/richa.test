public class CountOccurenceOfCharacter {
    public static void main(String[] args) {
        count("sstrjsd",'s');
    }
    public  static void count(String s,char c){
        int count=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)==c)
            count++;
        }
        System.out.println("This character appeared for "+count +" times in "+s);
    }
}
