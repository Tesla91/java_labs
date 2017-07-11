package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */

class Outer{
    static public int x;
    static public int y;

    public static void main(String[] args) {
        Inner obj1 = new Inner();
        x = y = 1;
        int a = obj1.meth1(7,9);
        System.out.println(a);
    }

    static class Inner{
        int meth1(int x, int y){
            return x + y;
        }

        int meth2(int y){
            return y;
        }


    }
}