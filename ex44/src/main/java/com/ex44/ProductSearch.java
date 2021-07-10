/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex44;

import java.io.IOException;
import java.util.*;

public class ProductSearch<Gson>
{
    private Map<String, Product> products;
    private Gson gson;
    private String inputFilename;
    private InputOutput FileInputOutput;

    ProductSearch(String inputFilename) throws IOException {
        this.inputFilename = inputFilename;
        this.gson = new Gson();
        this.read();
    }

    public void add(Product product) {
        this.products.put(product.name.toLowerCase(Locale.ROOT), product);
    }

    public Product get(String name) {
        return this.products.get(name.toLowerCase(Locale.ROOT));
    }

    public boolean has(String name) {
        return this.products.get(name.toLowerCase(Locale.ROOT)) != null;
    }

    public void read() throws IOException {
        this.products = new HashMap<>();

        Arrays
                .stream(
                        this.gson
                                .fromJson(FileInputOutput.slurp(this.inputFilename), JSONParsing.class)
                                .products)
                .forEach(product -> this.products.put(product.name.toLowerCase(Locale.ROOT), product));
    }

    public void write() throws IOException {
        JSONParsing jp = new JSONParsing();
        jp.products = this.products.values().toArray(new Product[0]);
        String json = this.gson.toJson(jp);
        FileInputOutput.spit(this.inputFilename, json);
    }
}

