package com.ex44;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Enoc Mena
 */


import com.ex44.com.ex44.IO;

import java.io.*;

public class Exercise44
{
    public static void main(String[] args) {
        try (IO io = new IO())
        {
            ProductSearch db = new ProductSearch("C:\\exercise44_input.json");
            Product pro;
            while (true)
            {
                String in = io.promptTrimmed("What is the product name? ");
                if (db.has(in)) {
                    pro = db.get(in);
                    break;
                }
                io.println("Sorry, that product was not found in our inventory.");
            }

            io.printf("Name: %s\nPrice: %.2f\nQuantity: %d\n",
                    pro.name,
                    pro.price,
                    pro.quantity
            );

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}

