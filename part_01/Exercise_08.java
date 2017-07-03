package Part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {

    private static final double radius = 3.14;

    public static void main(String[] args) {

        double area = 3.1416 * radius *radius;
        double perimeter = 2 * 3.1416 * radius;

        System.out.println("area is " + area);
        System.out.println("perimeter is " + perimeter);
    }
}
