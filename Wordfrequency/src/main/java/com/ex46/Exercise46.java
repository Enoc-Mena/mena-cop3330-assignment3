package com.ex46;

public class Exercise46
{
    public static void main(String[] args)
    {
        WordFrequencyFinder wff = new WordFrequencyFinder();
        System.out.print(wff.makeTheChart(wff.countTheWords(wff.removeAllBlanks(wff.makeTheList(wff.removeTheBreaksOfLine(wff.parseTheFile()))))));
    }
}

