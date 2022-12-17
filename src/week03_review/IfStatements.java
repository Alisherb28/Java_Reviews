package week03_review;

public class IfStatements {
    public static void main(String[] args) {

        // Odd Or Even
        int num = 100;

        /*
        if(num % 2 != 0){
            System.out.println("Odd Number");
        }
        if(num % 2 == 0){
            System.out.println("Even Number");
        }
*/

        if(num % 2 != 0){
            System.out.println("Odd Number");
        }else{
            System.out.println("Even Number");
        }

        System.out.println("-------------------------------------------------");

        // 28days, 30days, 31days
        int month = -5;

        boolean isValid = month >= 1 && month <= 12;
        boolean has30Days = month == 4 || month ==6 || month == 9 || month == 11;

        if(isValid){ //if the month is valid

            if(month == 2){
                System.out.println("28 Days");
            }else if(has30Days){
                System.out.println("30 Days");
            }else{
                System.out.println("31 days");
            }

        }else{ //if the month is NOT valid. month < 1  or month > 12

            if(month < 1){
                System.out.println("minimum month number is 1");
            }else{
                System.out.println("maximum month number is 12");
            }

        }




        //30 days: 4,6,9,11


    }

}
