package week03_review;
import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // \n

        System.out.println("Enter an integer:");

        int num = input.nextInt(); //12

        System.out.println("You have entered "+num);

        System.out.println("Enter a decimal number:");

        double num2 = input.nextDouble();

        System.out.println("You have entered "+num2);

        System.out.println("Are you employed?");
        String employed = input.next();

        System.out.println("employed = " + employed);

        input.close();



    }

}