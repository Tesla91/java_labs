package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
 * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
 * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
 * variable and the static variable for each class.
 */


class Class_01D{
    public static void main(String[] args) {
        Class_02D obj1 = new Class_02D();
        Class_02D obj2 = new Class_02D();
        Class_02D obj3 = new Class_02D();

        obj1.a = 1;
        obj2.b = 2;
        obj3.c = 3;
        System.out.println("obj1.a is " + obj1.a);
        System.out.println("obj2.b is " + obj2.b);
        System.out.println("obj3.c is " + obj3.c);
    }
}

class Class_02D{
    int a;
    int b;
    static int c;

}