package com.ex46;

import java.nio.file.*;
import java.util.*;

public class WordFrequencyFinder
{
    private static Path path = Paths.get("exercise46_input.txt");

    public String parseTheFile()
    {
        String text;
        try {
            text = Files.readString(path);
        }catch(Exception ex){
            text = "Cannot find the file.";
        }
        return text;
    }

    public String removeTheBreaksOfLine(String in)
    {
        in = in.replace("\n", " ").replace("\r", "");
        return in;
    }

    public Map<String,Integer> countTheWords(ArrayList<String> w)
    {
        String com;
        boolean c;
        int current = 0;
        Map<String,Integer> count = new HashMap<String,Integer>();

        for(int i=0; i<w.size(); i++)
        {
            c = false;
            com = w.get(i);
            if((count.containsKey(com)))
            {
                c = true;
                count.put(com, count.get(com)+1);
            }
            if(!c){
                count.put(com,1);
                current++;
            }
        }
        return count;
    }

    public ArrayList<String> removeAllBlanks(ArrayList<String> in)
    {
        ArrayList<String> res = in;
        for(int i=0; i<in.size(); i++){
            if(res.get(i).isBlank()){
                res.remove(i);
            }
        }
        return res;
    }

    public String makeTheChart(Map<String,Integer> in)
    {
        Map<String,Integer> m = in;
        String res = "";
        while(!m.isEmpty()){
            Integer maximum = 0;
            String mKey = "";
            for (Map.Entry<String,Integer> entry : m.entrySet()) {
                if(entry.getValue() > maximum)
                {
                    maximum = entry.getValue();
                    mKey = entry.getKey();
                }
            }
            String count = "";
            for(int i=0; i<maximum; i++){
                count += "*";
            }
            res = res + String.format("%-15s",mKey+":") + String.format("%-10s",count) + "\n";
            m.remove(mKey);
        }
        return res;
    }

    public ArrayList<String> makeTheList(String in)
    {
        ArrayList<String> l = new ArrayList<String>(Arrays.asList(in.split(" ")));
        return l;
    }
}
