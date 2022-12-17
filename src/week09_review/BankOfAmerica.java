package week09_review;

import java.time.LocalDate;

public class BankOfAmerica {
    public static void main(String[] args) {
       Tester tester1=new Tester("Josh",'M',LocalDate.of(1985,4,5),"A01","QA",100000);
// tester1.setInfo()

        Tester tester2=new Tester("Ali");
        Tester tester3=new Tester("Saja",'F');
        Tester tester4=new Tester("Yana",'F',LocalDate.of(1999,5,1));
        System.out.println(tester1);
        System.out.println(tester2);
        System.out.println(tester3);
        System.out.println(tester4);
        Developer dev1=new Developer("Aaron",'M',LocalDate.of(1991,2,20),"B35","Java Developer",120000);

        System.out.println(dev1);
        tester1.smokeTesting();
        dev1.fixingBug();

    }
}



