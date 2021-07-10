package com.ex42.com.exercise42;

import com.ex42.HandlingTheFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Exercise42
{
    public static void main(String[] args) throws IOException
    {
        //Take in file
        String path = "C:\\exercise42_input.txt";

        //Read in file and create array
        ArrayList<Map<String, String>> names = HandlingTheFile.read(path);

        //Print out file
        System.out.println();

        String out = HandlingTheFile.printDetails(names);

        System.out.println(out);

    }
}
