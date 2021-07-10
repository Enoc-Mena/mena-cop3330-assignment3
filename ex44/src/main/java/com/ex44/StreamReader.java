/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex44;

import java.io.InputStreamReader;

public class StreamReader extends InputStreamReader
{
    public StreamReader()
    {
        super(System.in);
    }

    @Override
    public void close() {}
}

