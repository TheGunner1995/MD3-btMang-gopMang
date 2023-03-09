import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int sumLenght = arr1.length + arr2.length;
        int[] arr3 = new int[sumLenght];
        for (int i = 0; i < sumLenght; i++) {
            if (i<arr1.length){
                arr3[i] = arr1[i];
            }else {
                arr3[i] = arr2[i-arr1.length];
            }
        }
        System.out.println("mảng gộp là : " + Arrays.toString(arr3));
    }
}