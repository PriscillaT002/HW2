
import java.io.IOException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;


public class test {

    public static String arrayToString(int[] array){
        String arrString= " ";
        for (int i=0; i <array.length; i++){
            arrString+=" " + array[i];
        };
        return arrString;
    }

    public static int[] getRanksArray(int[] array) {
        int[] result = new int[array.length];
    
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    count++;
                }
            }
            result[i] = count + 1;
        }
        return result;
    }
    public static void testIsElement() {
        int [] testArray={50, 34, 88, 92, 0, 100, 72, 99};
        //int value = 3;
        System.out.println("7.====== Testing: isElement =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(testArray));
        System.out.print("Input value: ");
        //System.out.println(value);
        int[] present = getRanksArray(testArray);
        System.out.println("Present ?:" + arrayToString(present));
        System.out.println("7. ===Done:isElement===\n");

    }
    public static void main(String[] args){

        //===================
        //Test Main Functions
        //===================
        // testCopy();
        // testAddAll();
        // testAddArrays();
        // testMultiplyAll();
        // testFindAverage();
        // testSwap();
           testIsElement();
         //testIndexOf();
        // testFindMin(); 
        // testFindMinIndex();
        // testFindMax();
        // testFindMaxIndex();
        // testReverse();                  
        // testReturnReverse();
        // testIntersection();
        // testUnion();

    }
}
