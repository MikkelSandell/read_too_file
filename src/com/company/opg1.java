package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class opg1 {

    public static void main(String[] args) throws FileNotFoundException {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(5) + 1;
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        boolean gentag = true;
        while (gentag){
            int guess = sc.nextInt();
            if (randomNumber !=guess){
                System.out.println("forket");
                counter++;
            }else {
                System.out.println("korrekt");
                System.out.println("du gættede " + counter + " gange");
                gentag = false;
            }


        }
        File file = new File("data/output.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file,true));
        ps.println(counter);
    }
}
