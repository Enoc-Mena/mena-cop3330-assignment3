/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex41;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Helper {

    public static ArrayList<String> read(String path) throws IOException
    {
        ArrayList<String> names = new ArrayList<>();
        File f = new File(path);
        Scanner in = new Scanner(f);
        while (in.hasNext())
        {
            names.add(in.nextLine().trim());
        }
        return names;
    }


}
