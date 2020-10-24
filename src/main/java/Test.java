import java.util.Arrays;

// program to reverse an array
public class Test {
    public static void main(String[] args) {
        reverse(1,4,3,6,44);
       }
       public static void reverse(int ...arr){
           int [] arr2=new int[arr.length];
           System.out.println(Arrays.toString(arr));
           for(int i=0;i<arr.length;i++){
               arr2[arr.length-1-i]=arr[i];
           }
           System.out.println(Arrays.toString(arr2));
       }
}
