package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */
public class Exercise_11 {

    public static void main(String[] strings) {

        int day = 86400;
        int born = day / 6;
        int dies = day / -12;
        int immigrates = day / 40;
        int peopleADay = born + dies + immigrates;
        int peopleAYear = peopleADay * 365;
        int peopleInThreeYears = peopleAYear * 3;
        int population = 380123456;

        System.out.println(peopleInThreeYears + population);




    }
}
