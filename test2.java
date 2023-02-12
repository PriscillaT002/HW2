public class test2{


   
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

        int [] testArray={50, 34, 88, 92, 0, 100, 100, 72, 99};
        int item = 100;
        int copy = arrayCount(testArray, item);
        System.out.println("The highest score was achieved by :" + (copy) +" "+ "student(s).");

    }

    public static void main(String[] args){

        //===================
        //Test Main Functions
        //===================
        nrMaxScore();
    }
}