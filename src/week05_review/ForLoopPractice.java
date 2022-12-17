package week05_review;
import java.util.Scanner;

public class ForLoopPractice {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Enter a number");
        scan.nextInt();
        System.out.println("Enter a number");
        scan.nextInt();
        System.out.println("Enter a number");
        scan.nextInt();
        System.out.println("Enter a number");
        scan.nextInt();
        System.out.println("Enter a number");
        scan.nextInt();
*/

        int max = -2147483648 ; // max = 10
        int min = 2147483647;

        for (int i = 1; i < 6; i++) {

            System.out.println("Enter a number");
            int num = scan.nextInt(); // 10, 20, 30, 40, 50

            if(num > max){
                max = num;
            }

            if(num < min){
                min = num;
            }


        }


        System.out.println("max = " + max);
        System.out.println("min = " + min);

        scan.close();




    }

}
