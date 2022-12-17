package week07_review;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice1 {

    public static void main(String[] args) {

        //scores: 10, 11, 12, 13, 14, 15

        int[] scores = {10, 11, 12, 13, 14, 15}; //new int[6]

        System.out.println(Arrays.toString(scores));

        System.out.println("----------------------------------");

        String[] words = {"Java", "Selenium", "API", "SQL", "Wooden Spoon", "Python"};

        String[] result =new String[words.length]; // index: 0 ~ 5

        /*
        result[0] = "Java";
        result[1] = "Selenium";
        result[2] = "API";
         */

        for (int i = words.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = words[i];
            // result += words.charAt(i);
        }

        System.out.println(Arrays.toString(result));



        System.out.println("-------------------------------");

        int[] numbers = new int[7]; // index: 0 ~ 4

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i]= input.nextInt();
        }


        System.out.println(Arrays.toString(numbers));


        input.close();

    }


}
