package week03_review;

public class Switchstatement {
    public static void main(String[] args) {


        int day = 7;
        String result = "";

        switch (day) {

            case 1:
                result = "Monday";
                break;

            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "Wednesday";
                break;

            case 4:
                result = "Thursday";
                break;

            case 5:
                result = "Friday";
                break;

            case 6:
                result = "Saturday";
                break;

            case 7:
                result = "Sunday";
                break;

            default:
                if (day < 1) {
                    result = "Minimum day number can not be less than 1";
                } else {
                    result = "Maximum day number can not be greater than 7";
                }

        }


        System.out.println(result);


        System.out.println("-------------------------------------------------");

        int month = 5;
        if(month >= 1 && month<=12){

            if(month == 1){

            }else if(month == 2){

            }

        }else {
            System.out.println("Invalid");
        }




    }
}
