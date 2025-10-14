import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] x) {

        int arr[]={1,2,6,4,7};
        System.out.println(Arrays.toString(arr));
        int emptyNumbers []={};
        for(int i=arr.length;i>0;i--){
        emptyNumbers = Arrays.copyOf(emptyNumbers, emptyNumbers.length + 1);
        emptyNumbers[emptyNumbers.length - 1] = arr[i-1]; 
        // System.out.println(arr[i-1]);
        }
        System.out.println(Arrays.toString(emptyNumbers));



    }
}
