package part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class Class_01{
    public static void main(String[] args) {
        Class_02 class2 = new Class_02();
        class2.setA(1);
        class2.setB(2);
        class2.setC(3);
        System.out.println("class2.setA is " + class2.getA());
        System.out.println("class2.setB is " + class2.getB());
        System.out.println("class2.setC is " + class2.getC());
        System.out.println(class2.createAndSetClass3());
    }
}

class Class_02{
    private int a;
    private int b;
    private int c;

    public String createAndSetClass3(){
        Class_03 class3 = new Class_03();
        class3.setX("Hey! ");
        class3.setY("My name is ");
        class3.setZ("Nicola.");
        System.out.println("class3.setX is " + class3.getX());
        System.out.println("class3.setY is " + class3.getY());
        System.out.println("class3.setZ is " + class3.getZ());
        return "all done";
    }

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

class Class_03{
    private String x;
    private String y;
    private String z;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }
}