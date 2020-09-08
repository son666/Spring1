package com.geekbrains.controllers;

import com.geekbrains.entities.Book;
import com.geekbrains.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {
    private BooksService BooksService;

    @Autowired
    public void setBooksService(BooksService BooksService) {
        this.BooksService = BooksService;
    }

    @RequestMapping("/list")
    public String showBooksList(Model model) {
        List<Book> allBooks = BooksService.getAllBooksList();
        model.addAttribute("BooksList", allBooks);
        return "shop-page";
    }

    @RequestMapping(path="/add", method=RequestMethod.GET)
    public String showAddForm(Model model) {
        Book book = new Book();
        book.setTitle("");
        book.setDescription_text("");
        book.setYear_manufacture(0);
        model.addAttribute("book", book);
        return "add-book-form";
    }

    @RequestMapping(path="/add", method=RequestMethod.POST)
    public String showAddForm(Book Book) {
        BooksService.addBook(Book);
        return "redirect:/books/list";
    }

}
