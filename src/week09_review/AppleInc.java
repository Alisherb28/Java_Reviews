package week09_review;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AppleInc {
    public static void main(String[] args) {
        Tester[] testers = {
                new Tester("Sajjad", 'M', LocalDate.of(1998, 3, 4), "A01", "QA", 135000),
                new Tester("Serhan", 'M', LocalDate.of(1997, 7, 4), "A02", "SDET", 105000),
                new Tester("Ana", 'F', LocalDate.of(1996, 9, 4), "AB3", "QE", 110000),
        };
        Developer[] developers = {
                new Developer("Hilal", 'F', LocalDate.of(1982, 12, 4), "9874", "Front end Developer", 110000),
                new Developer("Mahmut", 'M', LocalDate.of(1989, 4, 14), "3265", "Back end Developer", 120000),
                new Developer("Ediz", 'M', LocalDate.of(2001, 10, 28), "9563", "Developer", 130000),
                new Developer("Hamid", 'M', LocalDate.of(1989, 10, 10), "303", "Developer", 200000),
                new Developer("Serhan", 'M', LocalDate.of(1990, 11, 25), "308", "Developer", 160000)
        };

        Developer dev2 = new Developer("Halima", 'F', LocalDate.of(1997, 12, 4), "1224", "Swift Developer", 150000);

        ScrumTeam scrum1 = new ScrumTeam("Nazar", "Olzhas", "Kudret", 14);
        scrum1.addTesters(testers);
        scrum1.addDevelopers(developers);
        scrum1.removeDeveloper("9563");
        scrum1.removeTester("A02");
        scrum1.addDeveloper(dev2);
        System.out.println(scrum1);

        System.out.println("-------------------------------------------------------------------");

        for (Tester eachTester : scrum1.Testers) {
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }

        System.out.println("--------------------------------------------");
        for (Developer eachDev : scrum1.Developers) {
            System.out.println(eachDev.name + " : " + eachDev.salary);

        }

        System.out.println("--------------------------------------------");


        Tester[] testers2 = {
                new Tester("Don", 'M', LocalDate.of(1995, 3, 4), "B01", "QA", 120000),
                new Tester("Monica", 'F', LocalDate.of(1990, 7, 4), "B02", "SDET", 115000),
                new Tester("Kent", 'M', LocalDate.of(1999, 9, 4), "B03", "QE", 150000),
                new Tester("Michael", 'M', LocalDate.of(2001, 9, 4), "B04", "SDET", 80000),
        };
        Developer[] developers2 = {
                new Developer("Tuna", 'M', LocalDate.of(1992, 12, 4), "8874", "Front end Developer", 95000),
                new Developer("Muhtar", 'M', LocalDate.of(1999, 4, 14), "8265", "Back end Developer", 130000),
                new Developer("Eddie", 'M', LocalDate.of(2000, 10, 28), "8563", "Developer", 150000),
                new Developer("Hamzat", 'M', LocalDate.of(1987, 10, 10), "7003", "Developer", 110000),
                new Developer("Sergey", 'M', LocalDate.of(1996, 11, 25), "9008", "Developer", 140000),
                new Developer("Zura", 'F', LocalDate.of(2000, 10, 10), "7003", "Front end Developer", 75000),
                new Developer("Corey", 'F', LocalDate.of(2001, 11, 25), "9008", "Back end Developer", 77000)
        };

        ScrumTeam scrum2 = new ScrumTeam("Donovan", "Lionel", "Kelly", 21);
        scrum2.addDevelopers(developers2);
        scrum2.addTesters(testers2);
        scrum2.removeDeveloper("7003");

        Developer dev3 = new Developer("Salima", 'F', LocalDate.of(1999, 11, 4), "1224", "Swift Developer", 110000);
        scrum2.addDeveloper(dev3);
        System.out.println(scrum2);
        System.out.println("---------------------------------------------");

        Tester[] testers3 = {
                new Tester("Annie", 'F', LocalDate.of(1996, 3, 4), "C01", "SDET", 160000),
                new Tester("Monica", 'F', LocalDate.of(1994, 7, 4), "C02", "SDET", 110000),
                new Tester("Bill", 'M', LocalDate.of(2000, 9, 4), "C03", "QE", 79000),
        };
        Developer[] developers3 = {
                new Developer("Asya", 'F', LocalDate.of(1990, 12, 4), "874", "Front end Developer", 90000),
                new Developer("Muhit", 'M', LocalDate.of(1989, 4, 14), "265", "Back end Developer", 100000),
                new Developer("Evelyn", 'F', LocalDate.of(2002, 10, 28), "563", "Developer", 130000),
                new Developer("Ramzan", 'M', LocalDate.of(1988, 10, 10), "700", "Developer", 140000),
                new Developer("Svetlana", 'F', LocalDate.of(1986, 11, 25), "908", "Developer", 110000),
                new Developer("Irene", 'F', LocalDate.of(2000, 11, 25), "908", "Front end Developer", 85000)
        };

        ScrumTeam scrum3 = new ScrumTeam("Mahoney", "Robert", "Barbara", 28);
        scrum3.addDevelopers(developers3);
        scrum3.addTesters(testers3);
        scrum3.removeDeveloper("874");

        Developer dev4 = new Developer("Samanta", 'F', LocalDate.of(1993, 10, 4), "224", "Front end Developer", 100000);
        scrum3.addDeveloper(dev4);
        System.out.println(scrum3);
        System.out.println("---------------------------------------------");

        // ArrayList<ScrumTeam> scrums = new ArrayList<>();
        ScrumTeam[] scrums = {scrum1, scrum2, scrum3};
        for (ScrumTeam eachTeam : scrums) {
            for (Tester tester : eachTeam.Testers) {
                System.out.println(tester.name + "-" + tester.jobTitle + "-" + tester.salary);
            }
        }
        System.out.println("------------------------------------------------------------------");
        for (ScrumTeam eachTeam : scrums) {
            for (Developer developer : eachTeam.Developers) {
                System.out.println(developer.name + "-" + developer.jobTitle + "-" + developer.salary);
            }
        }
        System.out.println("--------------------------------------------------------------");




        System.out.println("--------------------------------------------------------------");
        for (ScrumTeam eachTeam : scrums) {
            eachTeam.Developers.removeIf(p -> p.salary < 80000);
            eachTeam.Testers.removeIf(p -> p.salary > 145000);
            for (Tester eachtester : eachTeam.Testers) {
                System.out.println(eachtester);
            }
            for (Developer eachdeveloper : eachTeam.Developers) {
                System.out.println(eachdeveloper);
            }
        }

        System.out.println("------------------------------------------------------------------");

        int richTesters = 0;
        int richDevelopers = 0;
        for (ScrumTeam eachTeam : scrums) {
            eachTeam.Testers.removeIf(p -> p.salary <= 115000);
            richTesters += eachTeam.Testers.size();
            eachTeam.Developers.removeIf(p -> p.salary <= 115000);
            richDevelopers += eachTeam.Developers.size();
        }
        System.out.println("Testers are making more than 115k total: " + richTesters);
        System.out.println("Developers are making more than 115k total: " + richDevelopers);


        }
    }





/*
1. Create an object of ScrumTeam named scrum2:
        1.1 add 7 developers to the scrum2
        1.2 add 4 testers to the scrum2

2. Create an object of ScrumTeam named scrum3:
        2.1 add 6 developers to the scrum3
        2.2 add 3 testers to the scrum4

3. create an array of ScrumTeam named scrums with the length of 3:
        3.1 assign scrum1, scrum2, scrum3 to the indexes of scrums

        3.2 Display the names, job title and salaries  of all the testers in the following format
                    name - jobTitle - $salary

        3.3 Display the names, job title and salaries  of all the Developers in the following format
                    name - jobTitle - $salary

        3.4 Which tester has the maximum salary?

        3.5 Which tester has the minimum salary?

        3.6 Which developer has the maximum salary?

        3.7 Which developer has the minimum salary?

        3.8 How many testers are making more than 115k?

        3.9 How many developers are making more than 115k?

        3.10 Write a program that can remove all the developers from all scrum teams that has the salary less than $80000

        3.11 Write a program that can remove all the testers from all scrum teams that has the salary greater than $145000
 */
