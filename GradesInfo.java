
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

    //00. Helper Array to string function
    public static String arrayToString(int[] array){
     String arrString= " ";
     for (int i=0; i <array.length; i++){
            arrString+=" " + array[i];
        };
        return arrString;
    }
    //0. Quit: This option is programmed into the loop, no function necessary

    //1. GetScore: Since I was able to create my own array of grades I also programmed this into the loop

    // 2. Get Rank
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

    // I used this as my test function but also incorporated it into the loop
    public static void getRank() {
        int [] testArray={50, 34, 88, 92, 0, 100, 72, 99};
        System.out.println("7.==Students: 01,02,03,04,05,06,07,08==");
        System.out.print("Associated Scores: 50, 34, 88, 92, 0, 100, 72, 99\n");
        int[] present = getRanksArray(testArray);
        System.out.println("Student's ranked (Based on scores):" + arrayToString(present));
    }

    // 3. Perfect Score
    public static boolean perfectScore(int[] array,int value) {
        for(int i =0; i < array.length; i ++)
            if(array[i] == value)
                return true;
            return false;
    }

    // This was used to test my function but it is also called into the loop
    public static void perfectScoreQ() {
        int [] testArray={50, 34, 88, 92, 0, 100, 72, 99};
        int value = 100;
        boolean present = perfectScore(testArray, value);
        System.out.println(present);

    }

    // 4. Score of Zero
    public static boolean bottomScore(int[] array,int value) {
        for(int i =0; i < array.length; i ++)
            if(array[i] == value)
                return true;
            return false;
    }
    
    // This was used to test my function but it is also called into the loop
    public static void bottomScoreQ() {
        int [] testArray={50, 34, 88, 92, 0, 100, 72, 99};
        int value = 0;
        boolean present = perfectScore(testArray, value);
        System.out.println(present);

    }

    // 5. Highest Score

    // 6. Highest Score Recipients
    // 7. Lowest Score
    // 8. Lowest Score Recipients
    // 9. Sorted Scores
    
   


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
 
         try (// Takes user input
        Scanner userInput = new Scanner(System.in)) {
            // Storage for user's responses
             String userResponse = "";
 
             // Students and grade options
             System.out.println("******************************************");
             System.out.println("***********CHECK STUDENT'S GRADES**********");
             System.out.println("*******Student ID's: (01,02,03,04,05,06,07,08)*********");
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
                 // Here we begin the different options of the loop
                 //1. get score: nested loop for each student's ID number
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
 
                //2. get rank: returns the IDs of students and their grades and shows their ranks 
                else if (userResponse.equals("2")) {
                    getRank();
                    userResponse = userInput.nextLine().toUpperCase();}

                //3. perfect score: returns true or false depending on whether or not 100 is present in the grades array
                else if (userResponse.equals("3")) {
                    System.out.println("Did anyone receive a perfect score? :\n");
                    perfectScoreQ();
                    userResponse = userInput.nextLine().toUpperCase();}

                //4. score of zero: returns true or false depending on whether or not 0 is present in the grades array
                else if (userResponse.equals("4")) {
                    System.out.println("Did anyone receive a score of 0 percent? :\n");
                    bottomScoreQ();
                    userResponse = userInput.nextLine().toUpperCase();}
                
                //5.Highest score: returns the highest score int in the array    
                else if (userResponse.equals("5")) {
                    System.out.println("What was the highest score? :" );
                    getMaxScore();
                    userResponse = userInput.nextLine().toUpperCase();}
                
                //6.How many students received the highest score: returns the int amount of ...
                //...times the highest score was present in the array, in this case the highest score was 100
                else if (userResponse.equals("6")) {
                    System.out.println("How many students received the highest score? :\n");
                    nrMaxScore();
                    userResponse = userInput.nextLine().toUpperCase();}

                 //7.Lowest score: returns the lowest score int in the array    
                else if (userResponse.equals("7")) {
                    System.out.println("What was the lowest score? :\n");
                    testFindMin();
                    userResponse = userInput.nextLine().toUpperCase();}

                 //8.How many students received the lowest score: returns the int amount of ...
                //...times the lowest score was present in the array, in this case the highest score was 0   
                else if (userResponse.equals("8")) {
                    System.out.println("How many students received the lowest score? :\n");
                    nrMinScore();
                    userResponse = userInput.nextLine().toUpperCase();}

                //9.Sorted scores: returns a list of grades sorted from highest to lowest    
                else if (userResponse.equals("9")) {
                    System.out.println("Here's all the scores sorted lowest to highest: \n");
                    sort();
                    userResponse = userInput.nextLine().toUpperCase();}

                //10. Quit: Final option that allows the user to exit loop, however to go through th loop again the user...
                //...will need to re-run the code    
                else if (userResponse.equals("0")) {
                    System.out.println("Goodbye. Restart application to see menu options again.\n");
                    checkingGrades = false;
                    userResponse = userInput.nextLine().toUpperCase();}
                    
        } while (checkingGrades);
     }
  }
}
 

