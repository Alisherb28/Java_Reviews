package week03_review;

public class Test {
    public static void main(String[] args) {

        int month = 1;
        String res = "";


        switch (month) {
            case 1:
                res = "Jan";
            case 2:
                res = "Feb";
            case 3:
                res = "Mar";
            case 4:
                res = "Apr";
            case 5:
                res = "May";
            case 6:
                res = "Jun";
            case 7:
                res = "Jul";
            case 8:
                res = "Aug";
            case 9:
                res = "Sep";
            case 10:
                res = "Oct";
            case 11:
                res = "Nov";
            case 12:
                res = "Dec";
            default:
                res = "Invalid";
        }


        System.out.println(res);

    }
}
