
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * GradesInfo class
 * By: Priscilla Trejo, CSC 210, Smith College
 * contains the functions for each required option from HW2 as well as the main interective loop.
 * @return Futher actions and questions until the user chooses to quit the loop
 */

 
 public class GradesInfo {

       // Helper Array to string function (May or may not be used)
    public static String arrayToString(int[] array){
     String arrString= " ";
     for (int i=0; i <array.length; i++){
            arrString+=" " + array[i];
        };
        return arrString;
    }


       //nrMaxScores
       public static int arrayCount(int[] array, int item) {

        int amt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                amt++;
            }
            else {
                amt = amt;
            }
        }
        return amt;
    }

    public static void nrMaxScore(){

        int [] testArray={50, 34, 88, 92, 0, 100, 72, 99};
        int item = 100;
        int copy = arrayCount(testArray, item);
        System.out.println("The highest score was achieved by" +" "+ (copy) +" "+ "student(s).");

    }

       //nrMinScores
       public static void nrMinScore(){

        int [] testArray={50, 34, 88, 92, 0, 100, 72, 99};
        int item = 0;
        int copy = arrayCount(testArray, item);
        System.out.println("The lowest score was received by" +" "+ (copy) +" "+ "student(s).");

    }
       //getRank
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




       //sort pseudo code
    public static void sort() {  
     int [] array = new int [] {50, 34, 88, 92, 0, 100, 72, 99};  
    // sort() method of the Arrays class  
    Arrays.sort(array);    
    //prints array using the for loop  
    for (int i = 0; i < array.length; i++)   
        {System.out.println(array[i]);
      }  
    }



        //perfectScore pseudo code
    /* 
    input: array[], int value
    output:boolean
    method:
        for i=0 thru array.length
            if array[i]= value
            return true
        return false*/
    //7. perfectScore function
    public static boolean perfectScore(int[] array,int value) {
        for(int i =0; i < array.length; i ++)
            if(array[i] == value)
                return true;
            return false;
    }
    // //Perfect score executioner
    public static void perfectScoreQ() {
        int [] testArray={50, 34, 88, 92, 0, 100, 72, 99};
        int value = 100;
        boolean present = perfectScore(testArray, value);
        System.out.println(present);

    }


    //score of zero pseudo code
    /* 
    input: array[], int value
    output:boolean
    method:
        for i=0 thru array.length
            if array[i]= value
            return true
        return false*/
    //7. bottom score
    public static boolean bottomScore(int[] array,int value) {
        for(int i =0; i < array.length; i ++)
            if(array[i] == value)
                return true;
            return false;
    }
    // Bottom score executioner
    public static void bottomScoreQ() {
        int [] testArray={50, 34, 88, 92, 0, 100, 72, 99};
        int value = 0;
        boolean present = perfectScore(testArray, value);
        System.out.println(present);

    }



    //getMaxScore pseudo code
    /* input: array[]
    output:int max
    method:
        int array[] = {}
        int i ; max
        max = array[0]
        for (i=0; i<array.length;i++) 
            if (min < array[i])
            min = array[i]
            return max*/
    //getMaxScore
    public static int findMax(int[] array) {
        int i ; int max;
        max = array[0];
        for (i=0; i<array.length;i++) 
            if (max < array[i])
            max = array[i];
            return max;
     }
    //Max score executioner
    public static void getMaxScore(){
        int [] testArray={50, 34, 88, 92, 0, 100, 72, 99};
        int max = findMax(testArray);
        System.out.println(max);


    }

        //findMin pseudo code
    /* input: array[]
    output:int min
    method:
        int array[] = {}
        int i ; min
        min = array[0]
        for (i=0; i<array.length;i++) 
            if (min > array[i])
            min = array[i]
            return min*/
    //9. findMinfunction
    public static int findMin(int[] array) {
        
        int i ; int min;
        min = array[0];
        for (i=0; i<array.length;i++) 
            if (min > array[i])
            min = array[i];
            return min;

     }

    //Tester for findMinfunction
    public static void testFindMin(){
        int [] testArray={50, 34, 88, 92, 0, 100, 72, 99};
        int min = findMin(testArray);
        System.out.println(min);

    }
 
     public static void main(String[] args) throws IOException {
         
 
         // Checkpoint for loop
         boolean checkingGrades = true;
 
         try (// We'll use this to get input from the user.
        Scanner userInput = new Scanner(System.in)) {
            // Storage for user's responses
             String userResponse = "";
 
             // Students and grade options
             System.out.println("******************************************");
             System.out.println("***********CHECK STUDENT'S GRADES**********");
             System.out.println("*******Student ID's: (01,02,03,04,05,06,07,08) *********");
             System.out.println("******************************************\n");
             System.out.println("1. Get Score");
             System.out.println("2. Get Rank");
             System.out.println("3. Perfect Score?");
             System.out.println("4. Score of Zero?");
             System.out.println("5. Highest Score?");
             System.out.println("6. Highest Score Recipients ");
             System.out.println("7. Lowest Score?");
             System.out.println("8. Lowest Score Recipients ");
             System.out.println("9. Sorted Scores");
             System.out.println("0. Quit");
            
 
             // Instructions
             System.out.println("Enter a number from the menu \n");
             userResponse = userInput.nextLine().toUpperCase();

            do{
 
                if (userResponse.equals("1")) {
                    System.out.println( "Please enter student's ID number.\n");
                    userResponse = userInput.nextLine().toUpperCase();}
                    if (userResponse.equals("01"))
                    {
                        System.out.println( "Student 01 has a score of: 50\n");
                        userResponse = userInput.nextLine().toUpperCase();}

                    else if (userResponse.equals("02")) {
                        System.out.println("Student 02 has a score of: 34\n");
                        userResponse = userInput.nextLine().toUpperCase();}

                    else if (userResponse.equals("03")) {
                        System.out.println("Student 03 has a score of: 88\n");
                        userResponse = userInput.nextLine().toUpperCase();}

                    else if (userResponse.equals("04")) {
                        System.out.println("Student 04 has a score of: 92\n");
                        userResponse = userInput.nextLine().toUpperCase();}

                    else if (userResponse.equals("05")) {
                        System.out.println("Student 05 has a score of: 0\n");
                        userResponse = userInput.nextLine().toUpperCase();}

                    else if (userResponse.equals("06")) {
                        System.out.println("Student 06 has a score of: 100\n");
                        userResponse = userInput.nextLine().toUpperCase();}

                    else if (userResponse.equals("07")) {
                        System.out.println("Student 07 has a score of: 72\n");
                        userResponse = userInput.nextLine().toUpperCase();}

                    else if (userResponse.equals("08")) {
                        System.out.println("Student 08 has a score of: 99\n");
                        userResponse = userInput.nextLine().toUpperCase();}
 
                     
                else if (userResponse.equals("2")) {
                    testIsElement();
                    userResponse = userInput.nextLine().toUpperCase();}


                else if (userResponse.equals("3")) {
                    System.out.println("Did anyone receive a perfect score? :\n");
                    perfectScoreQ();
                    userResponse = userInput.nextLine().toUpperCase();}


                else if (userResponse.equals("4")) {
                    System.out.println("Did anyone receive a score of 0 percent? :\n");
                    bottomScoreQ();
                    userResponse = userInput.nextLine().toUpperCase();}

                else if (userResponse.equals("5")) {
                    System.out.println("What was the highest score? :" );
                    getMaxScore();
                    userResponse = userInput.nextLine().toUpperCase();}

                else if (userResponse.equals("6")) {
                    System.out.println("How many students received the highest score? :\n");
                    nrMaxScore();
                    userResponse = userInput.nextLine().toUpperCase();}

                else if (userResponse.equals("7")) {
                    System.out.println("What was the lowest score? :\n");
                    testFindMin();
                    userResponse = userInput.nextLine().toUpperCase();}

                else if (userResponse.equals("8")) {
                    System.out.println("How many students received the lowest score? :\n");
                    nrMinScore();
                    userResponse = userInput.nextLine().toUpperCase();}

                else if (userResponse.equals("9")) {
                    System.out.println("Here's all the scores sorted lowest to highest: \n");
                    sort();
                    userResponse = userInput.nextLine().toUpperCase();}

                else if (userResponse.equals("0")) {
                    System.out.println("Goodbye. Restart application to see menu options again.\n");
                    checkingGrades = false;
                    userResponse = userInput.nextLine().toUpperCase();}
                    
        } while (checkingGrades);
     }
  }
}
 

