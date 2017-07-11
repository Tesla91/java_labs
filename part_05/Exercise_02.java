package part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you must manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */

class Class_01A{
    public static void main(String[] args) {
        Class_02A class2A = new Class_02A();
        Class_01A class1A = new Class_01A();
        class1A.method_01A(class2A);
        class1A.method_02A(class2A);

    }

    void method_01A(Class_02A class2A){
        class2A.setA(9);
        class2A.setB(8);
        class2A.setC(7);
        System.out.println("Class2A.setA is " + class2A.getA());
        System.out.println("Class2A.setB is " + class2A.getB());
        System.out.println("Class2A.setC is " + class2A.getC());
    }
    void method_02A(Class_02A class2A){
        class2A.setA(1);
        class2A.setB(2);
        class2A.setC(3);
        System.out.println("Class2A.setA is " + class2A.getA());
        System.out.println("Class2A.setB is " + class2A.getB());
        System.out.println("Class2A.setC is " + class2A.getC());

    }

}

class Class_02A{
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}