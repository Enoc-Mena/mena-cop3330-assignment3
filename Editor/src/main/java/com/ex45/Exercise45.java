package com.ex45;

import java.util.Scanner;

public class Exercise45
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        //Asks for the name of the file
        System.out.print("What is the name of your output file? ");
        String outFile = sc.nextLine();  //Starts to create file
        Editor ed = new Editor();
        ed.fName = "C:\\exercise45_input.txt"; //Creates path for output file
        ed.fDes = "C:\\exercise45_output.txt";// + outFile;
        ed.t = "utilize";
        ed.replace = "use";
        ed.replaceTheTextInFile();


    }
}
