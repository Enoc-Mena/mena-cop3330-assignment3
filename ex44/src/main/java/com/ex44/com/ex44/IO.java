package com.ex44.com.ex44;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Enoc Mena
 */

import com.ex44.StreamReader;

import java.io.*;

public class IO implements Closeable
{
    private BufferedReader in;
    private PrintStream out;

    public IO()
    {
        this.in = new BufferedReader(new StreamReader());
        this.out = System.out;
    }
    @Override
    public void close() throws IOException {
        this.in.close();
    }
    public void printf(String fmt, Object ... args) { this.out.printf(fmt, args); }

    public void print(String msg) { this.out.print(msg); }

    public void println(String msg) { this.out.println(msg); }

    public void println() { this.out.println(); }

    public String getTrimmed() {
        try { return this.in.readLine().trim(); }
        catch (IOException e) {
            System.err.println(e.getMessage());
            return "";
        }
    }

    public String getLine(String def) {
        try { return this.in.readLine(); }
        catch (IOException e) {
            System.err.println(e.getMessage());
            return def;
        }
    }

    public String promptTrimmed(String msg) {
        this.out.print(msg);
        this.out.flush();
        return this.getTrimmed();
    }

    public String promptLine(String msg) {
        this.out.print(msg);
        this.out.flush();
        return this.getLine("");
    }

    public float promptFloatDefaulting(String msg, float def) {
        this.out.print(msg);
        this.out.flush();
        try { return Integer.parseInt(this.in.readLine()); }
        catch (NumberFormatException | IOException e) { return def; }
    }

    public int promptIntDefaulting(String msg, int def) {
        this.out.print(msg);
        this.out.flush();
        try { return Integer.parseInt(this.in.readLine()); }
        catch (NumberFormatException | IOException e) { return def; }
    }

    public float demandFloat(String msg) {
        return this.demandFloat(msg, "It needs to be a _number_: ");
    }
    public float demandFloat(String msg, String demand) {
        this.out.print(msg);
        while (true) {
            this.out.flush();
            try  { return Float.parseFloat(this.in.readLine()); }
            catch (NumberFormatException e) { this.out.print(demand); }
            catch (IOException e) { System.err.println(e.getMessage()); }
        }
    }

    public int demandInt(String msg) {
        return this.demandInt(msg, "It needs to be an _integer_: ");
    }
    public int demandInt(String msg, String demand) {
        this.out.print(msg);
        while (true) {
            this.out.flush();
            try  { return Integer.parseInt(this.in.readLine()); }
            catch (NumberFormatException e) { this.out.print(demand); }
            catch (IOException e) { System.err.println(e.getMessage()); }
        }
    }
}

