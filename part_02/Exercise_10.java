package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {
    public static void main (String[] args) {
        int i, j;

        for (i = 1; i <= 100; i++) {
            boolean primeNum = true;
            for (j = 2; j < i; j++) {
                if (i % 2 == 0 || i % j ==0) {
                    primeNum = false;
                }
            }
            if (primeNum) {
                System.out.println(i);
            }
        }
    }
}
