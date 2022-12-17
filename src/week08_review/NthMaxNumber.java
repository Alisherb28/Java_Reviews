package week08_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthMaxNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15) );
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15) );
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15) );

        System.out.println(list);

        /*
        list.removeIf( p -> p ==Collections.max(list));  // removes the first maximum number
        System.out.println(list);
        list.removeIf( p -> p ==Collections.max(list)); // removes the second maximum number
        System.out.println(list);
        list.removeIf( p -> p ==Collections.max(list)); // removes the third maximum number
        System.out.println(list);
        list.removeIf( p -> p ==Collections.max(list)); // removes the fourth maximum number
        System.out.println(list);
         */

        int n = 5;

        for (int i = 0; i < n-1; i++) {
            list.removeIf( p -> p ==Collections.max(list));
        }

        int result = Collections.max(list);

        System.out.println("result = " + result);


        // in order to find the nth max number, we can remove the first (n-1) max numbers. then the next maximum number will be the nth max number

        // in order to find the nth min number, we can remove the first (n-1) min numbers. then the next minimum number will be the nth min number




    }

}
/*
3. write a program that can return the nth largest number from an arraylist
            ex:
                arraylist = {1,2,3,4,5,6,7,7,8,8}
                n = 5
            output:
                4
 */

