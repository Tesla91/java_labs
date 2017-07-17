

package part_08;

/**
 * Created by nicola on 7/15/17.
 */

/**
 *Write a class with at least one method that uses a try/catch statement. Make sure the catch block is executed, ie
 * generate an error an catch it in the catch block.
 */

public class Exercise_01 {

    public static void main(String[] args) {
        int nums [] = {8, 3, 40};
        int nums2 [] = {4, 0, 2};

        for(int i = 0; i < nums.length; i++){

            try{
                System.out.println(nums[i] / nums2[i]);
                nums[5] = 5;
            }
            catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("Index out of bounds");
            }
            catch (ArithmeticException exc){
                System.out.println("Cant divide by zero");
            }
            finally{
                System.out.println("leaving try");
            }
        }
    }
}


