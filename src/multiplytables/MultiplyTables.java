package multiplytables;

import java.util.Arrays;
import java.util.Scanner;


public class MultiplyTables {
//created febuary 29th 2020


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers, I, the genie, will give you the product");

        //allows user to input 1st number
        System.out.print("Enter a first integer: ");
        int num1 = input.nextInt();

        //allows user to input second number
        System.out.print("Enter a second integer: ");
        int num2 = input.nextInt();

        //ends program if either of the numbers are not in the expected range(1-12)
        if (num1 > 12 || num2 > 12) {
            System.out.println("Woah! I cant count that high! choose a smaller number");
            System.exit(0);
        }
        if (num1 == 0 || num2 == 0) {
            System.out.println("Really, a zero. Who do you think I am? Try again please");
            System.exit(0);
        }
        if (num1 < 1 || num2 < 1) {
            System.out.println("Come on! Get those negative numbers out of here!");
            System.exit(0);
        }


        //creates list
        int list[] = {1,2,3,4,5,6,7,8,9,10,11,12};

        for (int j = 1; j < 13; j++) {
            //multiplys int i by j, 12 times, replaces value for respective index
            for (int i = 0; i < 12; i++) {
                list[i] *= j;
            }
            //prints the line
            System.out.println(Arrays.toString(list));
            //resets the array to original array
            //(if there is a more simple way to do this, let me know)
            list[0] = 1;
            list[1] = 2;
            list[2] = 3;
            list[3] = 4;
            list[4] = 5;
            list[5] = 6;
            list[6] = 7;
            list[7] = 8;
            list[8] = 9;
            list[9] = 10;
            list[10] = 11;
            list[11] = 12;

        }
        //prints out punch line
        System.out.println();
        System.out.println("Its in there somewhere! Have fun finding it");
        //haha


    }


}