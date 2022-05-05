package com.TEKsystems.org;

import java.util.Scanner;
import java.io.*;

public class Files {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "and", "stuff"};
        String[] moreWords = {"the", "end"};
        Scanner stdIn = new Scanner(System.in);
        PrintWriter fileOut;
        String fileOutName;

        try {
            System.out.print("Enter the file name for output: ");
            fileOutName = stdIn.next();

            fileOut = new PrintWriter(fileOutName);
            for (int i = 0; i < words.length; ++i)
                fileOut.println("words[" + i + "] = " + words[i]);
            fileOut.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Error : " + e.getMessage());
        }
    }
}
