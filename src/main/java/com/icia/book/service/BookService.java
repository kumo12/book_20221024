package com.icia.book.service;

import com.icia.book.dto.BookDTO;
import com.icia.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public boolean save(BookDTO bookDTO) {
        int result = bookRepository.save(bookDTO);
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }
}
