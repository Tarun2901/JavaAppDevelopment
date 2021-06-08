package com.example.demo.Repository;

import com.example.demo.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BooksDB {
    ArrayList<Book> booksList = new ArrayList<>();

    public String saveBook(Book book) {
        for (Book books : booksList) {
            if (books.getId() == book.getId()) {
                return "Not able to store the book";
            }
        }
        booksList.add(book);
        System.out.println(book.toString() + " is inserted");
        return "Able to store the book";
    }

    public List<Book> getBooks() {
        return booksList;
    }

    public Book getBookByID(long id) {
        for (Book books : booksList) {
            if (books.getId() == id) {
                return books;
            }
        }
        return null;
    }
}


