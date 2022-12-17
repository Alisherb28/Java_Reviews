package week09_review;

import java.time.LocalDate;

public class Developer {
    public String name;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public String employeeID;
    public String jobTitle;
    public double salary;
    public static boolean hasProgrammingSkill=true;

    public Developer(String name, char gender, LocalDate dateOfBirth,  String employeeID, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear()-dateOfBirth.getYear();
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public void coding(){
        System.out.println(name+" from "+jobTitle+" one of the best team member of coding Java.");
    }
    public void unitTesting(){
        System.out.println(name+" employeeID is: "+employeeID+" all sprint cycle will work with unit testing.");
    }
    public void fixingBug(){
        System.out.println(name+" is "+age+" years old.Best "+jobTitle+" that's why his salary is "+salary+" .");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", employeeID='" + employeeID + '\'' +
                ", JobTitle='" + jobTitle + '\'' +
                ", Salary=" + salary +
                '}';
    }
}
