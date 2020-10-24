import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        sort(32,54,23,1,43);
    }
    public static void sort(int ...arr){
        System.out.println(Arrays.toString(arr));
        int l=arr.length;

        int temp=0;
        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){

                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
               }


        }
        System.out.println(Arrays.toString(arr));
    }
}
