package com.company;

import java.io.*;
import java.util.Scanner;

public class opg2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("hvad skal filen kaldes:");
        String dokumentNavn = sc.nextLine();
        File file = new File("data/" + dokumentNavn + ".txt");
        if (file.createNewFile()){
            System.out.println("du har lavet en fil med navn " +dokumentNavn);
            PrintStream ps = new PrintStream(new FileOutputStream(file,true));
            System.out.println("havd skal der stå i filen:");
            String tekst = sc.nextLine();
            ps.println(tekst);
        } else if (file.exists()){
            System.out.println("fillen med navn " +dokumentNavn + " ekistere alarede");
        }

    }
}
