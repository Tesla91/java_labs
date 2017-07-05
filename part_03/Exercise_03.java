package part_03;


import java.util.Random;

/**

 Implement the following methods

 */

class Exercise_03 {


    public static void main(String[] strings) {


        // use a for loop to iterate 1000 times {
        for (int i = 0; i <= 1000; i++) ;
        // Generate a random int between >= 1 and <= 12
        Random rn = new Random();
        int answer = rn.nextInt(12) + 1;
        System.out.println(answer);
        // call getMonthName(int month) and pass your random int

        // print the name of the month and the random int generated to the console
        System.out.println(getMonthName(answer));
    }

    // Get the name for the month using the random int you generated
    public static String getMonthName(int month) {
        // use a switch statement to determine the name of the month
        switch (month) {
            case 1:
                return "Januar";
            case 2:
                return "Februar";
            case 3:
                return "Marz";
            case 4:
                return "April";
            case 5:
                return "Mai";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Dezember";
            default:
                return "OTHER";
        }
        // return the month name

    }
}