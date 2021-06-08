package com.example.demo.Controller;

import com.example.demo.Model.Book;
import com.example.demo.Service.BookService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    //Dependency Injection
    @Autowired
    BookService bookService;

    @ApiOperation("This endpoint is for inserting the books")
    @PostMapping("/insertBook")
    public String insertBook(@RequestBody Book book)
    {
        return bookService.insertBook(book);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
      return  bookService.getAllBooks();
    }
    @GetMapping("/getBookByID/{id}")
    public Book getBookByID(@PathVariable long id)
    {
        return bookService.getBookByID(id);
    }

}
