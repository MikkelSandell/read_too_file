package com.company;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class opg1 {

    public static void main(String[] args) throws IOException {
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
                String tekst = "du gættede " + counter + " gang";
                File file = new File("data/output.txt");PrintStream ps = new PrintStream(new FileOutputStream(file,true));
                if (file.createNewFile()){
                    System.out.println("Fil oprettet i datamapenne: " + file.getName());
                }else {
                    System.out.println("fillen er oprettet");
                }
                FileWriter myWriter = new FileWriter("data/output.txt");
                myWriter.write(tekst);
                myWriter.close();

                }
                gentag = false;
            }


        }
    }

