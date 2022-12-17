package week09_review;

import java.time.LocalDate;

public class Tester {
    public String name;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public String employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name) {
        this.name = name;
        //jobTitle="Unknown";
    }

    public Tester(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Tester(String name, char gender, LocalDate dateOfBirth) {
        this(name,gender);
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear()-dateOfBirth.getYear();
    }

    public Tester(String name, char gender, LocalDate dateOfBirth, String employeeID, String jobTitle, double salary) {
        this(name,gender,dateOfBirth);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
     /*
    public static void Tester(){
        System.out.println("Regular Method");
    }
    public static void main(String[] args) {
        new Tester();
    }
*/

    public void   smokeTesting(){
        System.out.println(name+" is a "+jobTitle+" he can process a smoke testing in our software.");
    }
    public void creatingTicket(){
        System.out.println(name+" has experience to work with creating ticket and can help us with our tickets.");
    }
    public void dailyStandUp(){
        System.out.println("Team List: "+name+" "+age+" years old. \nEmployeeID: "+employeeID+" "+jobTitle+" .");
    }

    public String toString() {
        return "Tester{" +
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
/*
Scrum Task:
	1. create a class called Tester
		    Attributes:
		        name, gender, dateOfBirth, age, employeeID, JobTitle, Salary

		    Add a constructor that can set all the fields

		    Actions:
		       smokeTesting(),  creatingTicket(), dailyStandUp() toString()

	2. create a class called Developer
	        Attributes:
	        	name, gender, dateOfBirth, age, employeeID, JobTitle, Salary

        	Add a constructor that can set all the fields

	        Actions:
	        	coding(), unitTesting(), fixingBug(), toString()

	3. create a class called ScrumTeam
           	Attributes:
                  PO, BA, SM (for storing their names ONLY)
                  testers, developers, daysOfSprint

            Add a constructor that can set the PO, BA, SM and daysOfSprint

         	Actions:
                addTester(Tester tester): adds the given tester to the testers ArrayList

                addTesters(Tester[] testers): adds the given testers to the testers ArrayList

                addDeveloper(Developer developer): adds the given developer to the developers ArrayList

                addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

                removeTester(long employeeID): removes the given tester from the testers ArrayList

                removeDeveloper(long employeeID): removes the developer from the developers ArrayList

                toString(): prints number of tester,& developers,  PO name, SM name, BA name, and daysOfSprint

	4.create a class called MyScrumTeam:
            1. create an array of Testers and add the testers from your group
            2. create an array of developers add the developers from your group
            3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */