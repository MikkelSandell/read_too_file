package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class opg2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String dokumentNavn = sc.nextLine();
        File file = new File("data/" + dokumentNavn);
        PrintStream ps = new PrintStream(new FileOutputStream(file,true));
        String tekst = sc.nextLine();
        ps.println(tekst);
    }
}
