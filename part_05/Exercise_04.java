package part_05;

/**
 * Write two classes. Class_01 should have the main().
 * Class_02 must have 3 or more private variables. Class_02 must also have at least 3 overloaded constructors.
 * In Class_01.main() create several instances of Class_02 using each overloaded constructor.
 * Each constructor should do something slightly differently.
 * Class_02 must have at least two private instance variables.
 *
 * Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

class Class_01C {
    public static void main(String[] args) {
        Class_02C class2C1 = new Class_02C(7);
        Class_02C class2C2 = new Class_02C(9.2);
        Class_02C class2C3 = new Class_02C('h');

        Class_01C class1C1 = new Class_01C();
        class1C1.method_01C1(class2C1);
        class1C1.method_01C2(class2C2);
        class1C1.method_01C3(class2C3);
    }

    void method_01C1(Class_02C class2C1) {
        class2C1.setA(88);
        System.out.println("Class2C1.setA is " + class2C1.getA());
    }

    void method_01C2(Class_02C class2C2) {
        class2C2.setB(61.74);
        System.out.println("Class2C2.setB is " + class2C2.getB());
    }

    void method_01C3(Class_02C class2C3){
        class2C3.setC('f');
        System.out.println("Class2C3.setC is " + class2C3.getC());
    }
}

class Class_02C{
    private int a;
    private double b;
    private char c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    Class_02C(int x){
        System.out.println("inside Class_02C(int x)");
        a = x;
    }

    Class_02C(double y){
        System.out.println("inside Class_02C(double y)");
        b = y;
    }

    Class_02C(char z){
        System.out.println("inside Class_02C(char z)");
        c = z;
    }
}