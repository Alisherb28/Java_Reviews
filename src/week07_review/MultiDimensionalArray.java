package week07_review;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        String[] row1 = {"Java",	"SQL",	"HTML",	"CSS",	"Python"};
        String[] row2 = {"Selenium",	"API",	"Jenkin" };
        String[] row3 = {"Cydeo",	"Wooden spoon",	"Batch 28"};

        String[][] sheet1 = {row1, row2, row3};
        String[][] sheet2 = {};
        String[][] sheet3 = {};

        //[index of one dimensional arrays][index number of elements]
        System.out.println(sheet1[0][1]); //

        String[][][] excelFile = {sheet1, sheet2, sheet3};


    }
}
