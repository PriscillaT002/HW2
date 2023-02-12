import java.util.Scanner;
import java.io.*;
public class MidTermProject {

    private static final int StudentID = 0;
    public static void main(String[] args) throws IOException {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Here is the sample of menu choices for Main Menu.");
        
        System.out.println("\nWelcome to University Enrollment" + "\n1. Create Student");
        
        System.out.println("Please enter a valid choice(1, 0 to Quit) :");
        int userInput = keyboard.nextInt();
        
        if(userInput == 1) {
            CreateStudent();
        } else if(userInput == 0) {
            System.out.print("Done");
        } else {
            System.out.println("Invalid Option, Please try again.");
            userInput = keyboard.nextInt();
            if(userInput == 1) {
                CreateStudent();
            } else if(userInput == 0) {
                System.out.print("Done");
            }
    public static void CreateStudent() throws IOException {
        String FullName;
        String address;
        String city;
        String state;
        
        Scanner keyboard = new Scanner(System.in);
        
        FileOutputStream fstream =
                new FileOutputStream("StudentInfo.dat");
        DataOutputStream outputFile =
                new DataOutputStream(fstream);
        
        System.out.print("\nPlease enter your information bellow.\n" + "\nFull Name: ");
        FullName = keyboard.nextLine();
        outputFile.writeUTF(FullName);
        
        System.out.print("Address: ");
        address = keyboard.nextLine();
        outputFile.writeUTF(address);
        
        System.out.print("City: ");
        city = keyboard.nextLine();
        outputFile.writeUTF(city);
        
        System.out.print("State: ");
        state = keyboard.nextLine();
        outputFile.writeUTF(state);

        //allow the user to select its own ID
        System.out.print("Please get a Student ID(1-10): ");
        StudentID = keyboard.nextInt();
        //Used a lop to compare index with student ID and after that index increments
        for(int index = 0; index == StudentID; index++) {
            //if the ID has been selected, display a message and allow the user to select a different ID
            if(index == StudentID) {
                System.out.print("The selected ID has been selected already, Please select a different ID");
                StudentID = keyboard.nextInt();
            }
        }
        //write the ID in the file
        outputFile.writeInt(StudentID);
        
        System.out.print("Successfully Created");
        
    }
        
        System.out.print("Successfully Created");

        }
        

    public static void EditStudent() throws IOException {
        String editName;
        String editaddress;
        String editCity;
        String editState;
        
        Scanner keyboard = new Scanner(System.in);
        
        RandomAccessFile file = 
                new RandomAccessFile("StudentInfo.dat", "rw");
        file.seek(0);
        
        System.out.print("\nPlease enter NEW information bellow.\n" + "\nFull Name: ");
        editName = keyboard.nextLine();
        file.writeUTF(editName);
        
        System.out.print("Address: ");
        editaddress = keyboard.nextLine();
        file.writeUTF(editaddress);
        
        System.out.print("City: ");
        editCity = keyboard.nextLine();
        file.writeUTF(editCity);
        
        System.out.print("State: ");
        editState = keyboard.nextLine();
        file.writeUTF(editState);
        
        file.close();
    }
    public static void DisplayStudent() throws IOException {
        FileInputStream fstream = new FileInputStream("StudentInfo.dat");
        DataInputStream inputFile = new DataInputStream(fstream);
        
        String student;
        boolean endOfFile = false;
        
        //this do not display the ID number that was written in CreateStudent()
        while(!endOfFile)
        {
            try
            {
                student = inputFile.readUTF();
                //Tried the following to display the ID but didn't work
                // int StudentID = inputFile.readInt();
                System.out.print(student + " ");
            }
            catch (EOFException e)
            {
                endOfFile = true;
            }
        }
        System.out.println("\nDone");
        
        inputFile.close();

    } 