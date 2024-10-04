import java.util.Arrays;

public class Java{
    public static void sorting(int[] arr){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 2, 5, 4};
        System.out.println("Given array");
        System.out.println(Arrays.toString(arr));
        sorting(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}