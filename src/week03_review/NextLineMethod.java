package week03_review;
import java.util.Scanner;

public class NextLineMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // \n

        System.out.println("Enter your full name:");
        String fullName = input.nextLine(); //Daniel James King

        System.out.println("fullName = " + fullName);

        System.out.println("Enter your age:");
        int age = input.nextInt(); //29

        System.out.println("age = " + age);

        input.nextLine(); //in order to clear the scanner

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("schoolName = " + schoolName);





    }

}
