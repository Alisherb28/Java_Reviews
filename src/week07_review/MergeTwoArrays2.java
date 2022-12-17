package week07_review;
import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C", "D", "Java", "Python"}; // index: 0 ~ 5
        String[] arr2 = {"E", "F", "G"}; // index: 0 ~ 2

        String[] arr3 = new String[arr1.length + arr2.length];

        int k = 0; // for indexes of third array

        for (String each : arr1) { // each: elements of first array
            arr3[k++] = each; // each element of first array being assigned to each index of third array
        }

        for (String each : arr2) { // each: elements of first array
            arr3[k++] = each; // each element of first array being assigned to each index of third array
        }


        System.out.println(Arrays.toString(arr3));



    }

}
/*
Write a program that can merge two arrays of String and retuns the third array
            Ex:
                String[] arr1 = {"A", "B", "C", "D"};
                String[] arr2 = {"E", "F", "G"};
            output:
               arr3 = {"A", "B", "C", "D", "E", "F", "G"};
 */
