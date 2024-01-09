import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array for primitives
        int[] arr = new int[5];

        //arr[1] = 3;
        //arr[2] = 8;
        //arr[3] = 98;
        //arr[4] = 876;
        //System.out.println(arr[3]);

        for(int i = 0;i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        //for(int i = 0;i < arr.length; i++){
        //    System.out.println(arr[i]);
        //}

        //for(int num : arr){// for every element in array, print the element
            //System.out.print(num + "");// here num represents element of the array
       // }

        System.out.println(Arrays.toString(arr));

        //array of objects

        String[] str = new String[3];
        for(int i = 0;i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
