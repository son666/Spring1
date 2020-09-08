package com.geekbrains.services;

import com.geekbrains.entities.Book;
import com.geekbrains.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    private BooksRepository BooksRepository;

    @Autowired
    public void setBooksRepository(BooksRepository BooksRepository) {
        this.BooksRepository = BooksRepository;
    }

    public BooksService() {
    }

    public List<Book> getAllBooksList() {
        return (List<Book>)BooksRepository.findAll();
    }

    public void addBook(Book book) {
        BooksRepository.save(book);
    }

    public void removeById(Long id) {
        BooksRepository.deleteById(id);
    }
}
