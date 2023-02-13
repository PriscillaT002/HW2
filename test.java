
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
        System.out.println("7.==Students: 01,02,03,04,05,06,07,08==");
        System.out.print("Associated Scores: 50, 34, 88, 92, 0, 100, 72, 99\n");
        int[] present = getRanksArray(testArray);
        System.out.println("Student's ranked (Based on scores):" + arrayToString(present));

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
