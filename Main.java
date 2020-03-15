package academy.learnProgramming;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers[5];
        for(int i = 0; i < myIntegers.length; i++){
            System.out.println(myIntegers[i]);
        }
         }

         public static int[] getIntegers(int number){
             System.out.println("enter the values");
            int[] values = new Int[number];

            for(int i = 0; i < values.length; i++)
                values[i] = scn.nextInt();
             return values;
         }
}
