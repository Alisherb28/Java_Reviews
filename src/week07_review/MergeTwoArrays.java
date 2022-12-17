package week07_review;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C", "D", "Java", "Python"}; // index: 0 ~ 5
        String[] arr2 = {"E", "F", "G"}; // index: 0 ~ 2

        String[] arr3 = new String[arr1.length + arr2.length];

        int k = 0; // for indexes of third array

        for (int i = 0; i < arr1.length; i++, k++) { // i: for indexes of first array
            arr3[k] = arr1[i]; // elements of first array being assigned to the indexes of third array
        }

        for (int j = 0; j< arr2.length; j++, k++) { // j: indexes of second array
            arr3[k] = arr2[j]; //elements of second array being assigned
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