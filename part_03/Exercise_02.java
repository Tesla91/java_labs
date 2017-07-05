package part_03;

import java.util.Scanner;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task.

 */

class BasicMath {
    public static void main(String args[]){
        System.out.println("Enter a value: ");
        Scanner input = new Scanner(System.in);
        int var1 = input.nextInt();
        System.out.println("Enter a value: ");
        int var2 = input.nextInt();
        System.out.println("Enter a value: ");
        int var3 = input.nextInt();

        int result = multiply(var1, var2);
        double result2 = divide(result, var3);
        System.out.println(var1 + " * " + var2 + " = " + result );
        System.out.println(result + " / " + var3 + " = " + result2);

    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double divide(double x, double y){
        return x / y;
    }
}