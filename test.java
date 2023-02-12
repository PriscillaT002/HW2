
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

   
    public static int[] findCount(int[] arr) {
         int[] result = new int[arr.length];
         for (int i=0; i<arr.length; i++){
             for (int j=0; j<arr.length; j++) {
                 if (arr[i]==arr[j])
                     result[i]++;
             }
         }
         return result;
    }

    public static void nrMaxScore(){

        int [] testArray={50, 34, 88, 92, 0, 100, 72, 99};
        int[] copy = findCount(testArray);
        System.out.println("The highest score was achieved by : " + arrayToString(copy) + "student(s).");

    }

    public static void main(String[] args){

        //===================
        //Test Main Functions
        //===================
        nrMaxScore();
    }
}
