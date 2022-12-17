package week06_review;

import java.util.Scanner;

public class TestObjects {

    public static void main(String[] args)  {

        CydeoStudent student1 = new CydeoStudent();
        student1.setInfo("Josh", 25, 'M', true, false, 28, "Java", "Encapsulation");

        CydeoStudent student2 = new CydeoStudent();
        student2.setInfo("Emily", 28, 'F', false, false, 24, "Java", "Inheritance");

        CydeoStudent student3 = new CydeoStudent();
        student3.setInfo("Daniel", 45, 'M', true, true, 26, "Java", "Polymorphism");


        student1.name = "Sajjad";


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        student1.study();


        CydeoStudent student4 = new CydeoStudent();
        System.out.println(student4);

        student4.study();

        System.out.println("------------------------------------");


        CydeoStudent s1 = new CydeoStudent();
        student1.setInfo("Josh", 25, 'M', true, false, 28, "Java", "Encapsulation");


        CydeoStudent s2 = s1;


        System.out.println("----------------------------------");

        int num = new Scanner(System.in).nextInt();




    }

}
