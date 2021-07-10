package com.ex43.com.ex43;

import com.ex43.WebDetails;

import java.io.IOException;
import java.util.Scanner;

public class Exercise43
{
    private static WebDetails WebsiteDetails;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Site name: ");
        String title = sc.nextLine().trim();
        System.out.print("Author: ");
        String author = sc.nextLine().trim();
        String path = String.format("C:/%s/",
                title);
        System.out.print("Do you want a folder for JavaScript? ");
        String JS = sc.nextLine().trim().toLowerCase();
        System.out.print("Do you want a folder for CSS? ");
        String CSS = sc.nextLine().trim().toLowerCase();
        String output = WebsiteDetails.create(path, author, title, JS, CSS);
        System.out.println(output);
    }
}
