package com.ex42;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HandlingTheFile
{
    public static ArrayList<Map<String, String>> read(String filePath) throws IOException
    {

        //Create array for names
        ArrayList<Map<String, String>> names = new ArrayList<>();

        //Find file path
        File f = new File(filePath);
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(f);

        //Read in file
        while (sc.hasNextLine())
        {
            Scanner sc1 = new Scanner(sc.nextLine());
            sc1.useDelimiter(",");
            Map<String, String> n = new HashMap<>();
            while (sc1.hasNext()) {
                n.put("last", sc1.next());
                n.put("first", sc1.next());
                n.put("salary", sc1.next());
            }
            names.add(n);
        }
        return names;
    }
    public static String printDetails(ArrayList<Map<String, String>> names)
    {

        //Format output
        StringBuilder out = new StringBuilder();
        out.append(String.format("%-10s %-10s %-10s%n", "Last", "First", "Salary"));
        out.append(String.format("---------------------------------%n"));
        for (int i = 0; i < names.size(); i++)
        {
            Map<String, String> temp = names.get(i);
            out.append(String.format("%-10s %-10s $%-10s%n", temp.get("last"), temp.get("first"), temp.get("salary")));
        }
        return out.toString();
    }
}
