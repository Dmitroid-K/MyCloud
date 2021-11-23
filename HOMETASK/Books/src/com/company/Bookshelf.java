package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bookshelf {

    List<Book> shelf = new ArrayList<>();

    public void add(Book book){
        shelf.add(book);
    }


    public List<Book> searchAuthor(String name){
        return shelf.stream().filter(x->x.author.contains(name)).collect(Collectors.toList());

    }
    public List<Book> searchKeyWord (String key){
        return shelf.stream().filter(x->x.name.contains(key)).collect(Collectors.toList());

    }
    public List<Book> searchByDate(int from, int to){
        return shelf.stream().filter(x->x.date>=from && x.date<to).collect(Collectors.toList());

    }


    @Override
    public String toString() {
        return "BOOKSHELF" + "\n" + shelf;
    }
}