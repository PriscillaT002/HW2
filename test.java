
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
        int [] testArray={1,2,3,4};
        //int value = 3;
        System.out.println("7.====== Testing: isElement =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(testArray));
        System.out.print("Input value: ");
        //System.out.println(value);
        int[] present = getRanksArray(testArray);
        System.out.println("Present ?:" + present);
        System.out.println("7. ===Done:isElement===\n");

    }

}
