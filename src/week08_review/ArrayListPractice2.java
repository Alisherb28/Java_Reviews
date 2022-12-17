package week08_review;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"};

        // converting array to list:
        ArrayList<String> names = new ArrayList<>( Arrays.asList(arr) );

        System.out.println(names);

        // names.removeIf( p -> p.toLowerCase().charAt(0) == p.toLowerCase().charAt(p.length()-1) );
        names.removeIf( p ->  ( ""+p.charAt(0) ).equalsIgnoreCase(  ""+p.charAt(p.length()-1) )  );

        System.out.println(names);


        // converting arraylist to array:
        arr = names.toArray(new String[0]);

        System.out.println(Arrays.toString(arr));



        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        //int[] numbers = nums.toArray(new int[0]);
        Integer[] numbers = nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(numbers));



        int[] a1 = {10, 20, 30, 40};
        // ArrayList<Integer> list = new ArrayList<>( Arrays.asList(a1));
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : a1) {
            list.add(each);
        }









    }

}

/*
  2. Write a program that can remove string elements from an arraylist if the first and last characters of the string are same
    ex:
        list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}
    output:
        ["Canada","Lan", "Ebrahim", "Farida"]
 */
