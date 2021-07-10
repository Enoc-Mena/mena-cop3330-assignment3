/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex41;

import jdk.internal.icu.impl.StringPrepDataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise41 {

    public static void main(String[] args) throws IOException
    {

        //Find file path
        String path = "C:\\exercise41_input.txt";

        //Create an array for the names
        ArrayList<String> names = Helper.read(path);

        //Sort the names
        Collections.sort(names);

        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));

        }

    }

}
