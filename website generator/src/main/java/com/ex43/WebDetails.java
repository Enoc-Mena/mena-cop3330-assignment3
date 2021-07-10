package com.ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WebDetails
{
    public static String HTMLcreation(String p, String title, String author) throws IOException
    {
        String content = String.format("<!DOCTYPE html>\n<html>\n<head>\n" +
                "<title>%s</title>\n<meta name=\"author\" content=\"%s\">\n" +
                "</head>\n</html>", author, title);
        try {
            File f = new File(p);
            BufferedWriter out = new BufferedWriter(new FileWriter(f));
            out.write(content);
            out.close();
            return String.format("Created./website/%s%n", p);
        } catch (IOException e ) {
            return "Unable to generate the file of HTML";
        }
    }

    public static String create(String path, String author, String title, String JS, String CSS) throws IOException {
        Scanner in = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        if (JS.equals("y")) {
            if (CSS.equals("y")) {
                output.append(directoryCreation(path + "css/"));
            }
            output.append(directoryCreation(path + "js/"));
            output.append(HTMLcreation(path + "index.html", title, author));
        }
        else {
            if (CSS.equals("y")) {
                output.append(directoryCreation(path + "css\\"));
            }
            output.append(HTMLcreation(path + "index.html", title, author));
        }
        return output.toString();
    }

    public static String directoryCreation(String path) {
        File f = new File(path);
        f.mkdirs();
        return String.format("Created./website/%s%n", path);
    }
}

