package com.company;

public class Main {

    public static void main(String[] args) {
	    Book book1 = new Book(0, "How to succeed", "Bob", 2012, 350, 60, true);
        Book book2 = new Book(1, "Learn programming in 1 hour", "Ken", 2018, 150, 45, false);
        Book book3 = new Book(2, "My inspiring Autobiography", "Jim", 2010, 900, 10, true);
        Book book4 = new Book(3, "Rich Mam Poor Mam", "Bob", 1994, 320, 60, false);
        Bookshelf myBookshelf = new Bookshelf();
        myBookshelf.add(book1);
        myBookshelf.add(book2);
        myBookshelf.add(book3);
        myBookshelf.add(book4);

        System.out.println(myBookshelf.searchAuthor("Bob"));
        System.out.println(myBookshelf.searchKeyWord("programming"));
        System.out.println(myBookshelf.searchByDate(1990, 2000));


    }
}
