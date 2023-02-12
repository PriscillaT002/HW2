
 import java.io.IOException;
 import java.util.Hashtable;
 import java.util.Scanner;
 import java.util.Set;
 
 public class GradesInfo {

       // Helper Array to string
       public static String arrayToString(int[] array){
        String arrString= " ";
        for (int i=0; i <array.length; i++){
            arrString+=" " + array[i];
        };
        return arrString;
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
    //Student Scores
    public static void getMaxScore(){
        int [] testArray={50, 34, 88, 92, 0, 100, 72, 99};
        int max = findMax(testArray);
        System.out.println(max);


    }
 
     public static void main(String[] args) throws IOException {
         
 
         // Where the loop should end
         boolean checkingGrades = true;
 
         try (// We'll use this to get input from the user.
        Scanner userInput = new Scanner(System.in)) {
            // Storage for user's responses
             String userResponse = "";
 
             // Students and grade options
             System.out.println("******************************************");
             System.out.println("***********CHECK STUDENT'S GRADES**********");
             System.out.println("*******Student ID's: (1,2,3,4,5,6,7,8) *********");
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

 
                     
                else if (userResponse.equals("2")) {
                    System.out.println("Please enter student't ID number.\n");
                    userResponse = userInput.nextLine().toUpperCase();}


                else if (userResponse.equals("3")) {
                    System.out.println("Did anyone receive a perfect score? :\n");
                    userResponse = userInput.nextLine().toUpperCase();}


                else if (userResponse.equals("4")) {
                    System.out.println("Did anyone receive a score of 0 percent? :\n");
                    userResponse = userInput.nextLine().toUpperCase();}

                else if (userResponse.equals("5")) {
                    System.out.println("What was the highest score? :" );
                    getMaxScore();
                    userResponse = userInput.nextLine().toUpperCase();}

                else if (userResponse.equals("6")) {
                    System.out.println("How many students received the highest score? :\n");
                    userResponse = userInput.nextLine().toUpperCase();}

                else if (userResponse.equals("7")) {
                    System.out.println("What was the lowest score? :\n");
                    userResponse = userInput.nextLine().toUpperCase();}

                else if (userResponse.equals("8")) {
                    System.out.println("How many students received the lowest score? :\n");
                    userResponse = userInput.nextLine().toUpperCase();}

                else if (userResponse.equals("9")) {
                    System.out.println("Here's all the scores sorted: \n");
                    userResponse = userInput.nextLine().toUpperCase();}

                else if (userResponse.equals("0")) {
                    System.out.println("Goodbye. Restart application to see menu options.\n");
                    checkingGrades = false;
                    userResponse = userInput.nextLine().toUpperCase();}
                    
        } while (checkingGrades);
     }
  }
}
 

