package com.company;

public class Book {

    public int id;
    public String name;
    public String author;
    public int date;
    public int numOfPages;
    public int cost;
    public boolean hasHardCover;

    public Book(int id, String name, String author, int date, int numOfPages, int cost, boolean hasHardCover) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.date = date;
        this.numOfPages = numOfPages;
        this.cost = cost;
        this.hasHardCover = hasHardCover;
    }
    @Override
    public String toString(){
        String coverDescription = hasHardCover ? "Hard cover" : "Soft cover";
        return "\"" + name + "\"" + " | " + author + " | " + date + " year" + "   (More: "
                + numOfPages + " pages" + " | " + "$" + cost + " | " + coverDescription +")";
    }
}
