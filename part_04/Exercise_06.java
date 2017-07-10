package part_04;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */
class Queue{
    private int q[];               // this array holds the queue
    private int putloc, getloc;     // the put and get indices

    Queue(int size) {
        q = new int[size];         // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a int into the queue

    public void put(int num) {
        if(putloc==q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putloc++] = num;
    }

    // get a int from the queue
    public int get() {
        if(getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return (int) 0;
        }

        return q[getloc++];
    }
}


class Exercise_06 {
    public static void main(String args[]) {
        Queue ints = new Queue(101);
        int num;
        int i;

        System.out.println("Using ints to store numbers.");
        // put some numbers into ints
        for(i=0; i < 101; i++)
            ints.put((int) (0 + i));

        // retrieve and display elements from ints
        System.out.print("Contents of ints: ");
        for(i=0; i < 101; i++) {
            num = ints.get();
            if(num % 2 == 0) System.out.println(num);
        }

        System.out.println(" ");

    }

}
