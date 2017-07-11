package part_05;

/**
 * Write two classes. In Class_01 have a main method that creates an instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class Class_01B{
    public static void main(String[] args) {
        Class_02B class2B = new Class_02B();
        class2B.method2B(1);
        System.out.println("giving method2B(1)");
        class2B.method2B(3.5);
        System.out.println("giving method2B(3.5)");
        class2B.method2B('x');
        System.out.println("giving method2B('x')");

    }

}

class Class_02B{
    int method2B(int a){
        System.out.println("creating method2B(int a)");
        return a;
    }
    double method2B(double b){
        System.out.println("overloading method2B(double b)");
        return b;
    }
    char method2B(char c){
        System.out.println("overloading method2B(char c)");
        return c;
    }

}