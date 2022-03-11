package com.springboot.basics.springbootexample;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
@GetMapping("/books")
public List<Book> getallBooks(){
	return Arrays.asList(new Book(11,"Harry potter","JK.Rowling"));
}
}
