package part_05;

/**
 * Write one class. This class must have two methods, a main() + a recursive method. The recursive method must take in
 * an integer as a parameter. The recursive method must then print out "Hello Recursion!" as many times as the "initial"
 * input parameter dictates. For instance if the int passed to the recursive method is 10. The recursive method must print
 * out "Hello Recursion!" 10 times.
 *
 */
class Recursive{

    int inta = 10;


    void recurse(int b){
        if(b < inta) recurse(b+1);
        System.out.println("Hello Recursion!");
    }
}
class Recur {
    public static void main(String[] args) {
        Recursive a =  new Recursive ();
        a.recurse(0);
    }
}
