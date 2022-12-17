package week02_review;

public class Circle {

    public static void main(String[] args) {

        double radius = 10;

        double area = radius * radius * 3.14;

        double perimeter = 2 * radius * 3.14;

        System.out.println("Area of the circle is " + area);
        System.out.println("Perimeter of the circle is " + Math.round(perimeter));



    }

}


/*
Create a class named Circle and declare the following variables:
                radius
                area
                perimeter
    Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5
            output:
                   Area of the circle is 78.5
                   Perimeter of the circle is 31.4
 */
