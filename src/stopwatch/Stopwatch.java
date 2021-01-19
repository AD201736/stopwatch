package stopwatch;

import java.lang.*;
import java.util.Scanner;

public class Stopwatch {

    public static void main(String[] args) {
        long startTime = 0;
        boolean end = false;
        boolean start = false;
        Scanner in = new Scanner(System.in);
        while (end == false){
        System.out.println("Stopwatch: \n select an option by typing in the designated number: \n 1: Start stopwatch.\n 2: Stop stopwatch \n 3: Exit.\n");
        int user = in.nextInt();
        if (user == 1) {
            if (start == true) {
                System.out.println("You already have a stopwatch started. Stop it to start another.");
            } else {
                startTime = System.currentTimeMillis();
                System.out.println("Stopwatch started");
                start = true;
            }
        } else if (user == 2) {

            System.out.println("Stopwatch stopped");
            long estimated = System.currentTimeMillis() - startTime;
            System.out.println("The duration of the stopwatch is " + estimated + "milliseconds");
            start = false;

        }
        else if (user == 3){
            System.out.println("Exiting");
            end = true;
        }
    }
    }
}
