package week03_review;
import java.util.Scanner;

public class NextLineMethod2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // \n

        System.out.println("Are you employed:");
        String employed = input.next(); //yes

        input.nextLine();
        // everytime when we are using nextLine() after the OTHER methods of scanner, we MUST provide one additional nextLine() to clear the scanner memory

        System.out.println("Enter your job title:");
        String job_title = input.nextLine();

        System.out.println("employed = " + employed);
        System.out.println("job_title = " + job_title);


        System.out.println("Enter your gender:");
        String gender = input.next();

        System.out.println("gender = " + gender);

        input.close();

    }

}