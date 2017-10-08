import java.util.Scanner;

/**
 * Created by stephenboynton on 6/30/17.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] myIntegers = getIntegers(5);

        printArray(myIntegers);

        double average = getAverage(myIntegers);

        System.out.println(average);


    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + "integer values \r");
        int[] values = new int[number];

        for (int i = 0, len = values.length; i < len; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {

        for (int i = 0, len = array.length; i < len; i++) {
            System.out.println(array[i]);
        }
    }

    public static double getAverage(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;

    }

/*        int[] myArray= new int[10]; //creates ten spaces to be filled

        int[] my2Array = { 4, 5, 6, 8 , 9, 12, 30 }; // initializes with numbers known



        myArray[5] = 50;

        System.out.println(myArray);

        printArray(myArray);

    }

    public static void printArray(int[] array) {

        for (int i = 0, len = array.length; i<len; i++) {
            System.out.println(array[i]);
        }

    }*/

}
