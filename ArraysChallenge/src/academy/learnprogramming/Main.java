package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntArray = getIntegers(5);
        int[] sortedArray = sortIntegers(myIntArray);
        printArray(sortedArray);



    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.");
        int[] values = new int[number];
        for(int i = 0; i< values.length; i++ ){
            values[i] = scanner.nextInt();
        }

        return values;

    }

    public static int[] sortIntegers(int[] array){

        for(int i = 0; i < array.length; i++){
            int element = array[i];
            System.out.println(element);
            for(int j = 0; j< array.length; j++){
                if(array[j] > element){
                    array[j] = element;
                }
            }
        }

        return array;


    }
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
