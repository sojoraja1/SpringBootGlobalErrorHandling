package com.revision.demo.controller;

import com.revision.demo.entity.Book;
import com.revision.demo.exception.MyException;
import com.revision.demo.utils.ResponseCode;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@Validated
public class HomeController{

    @GetMapping("/hello/{id}")
    public Book showBook(@PathVariable @Min(2) int id) {
        return new Book("");
    }
    @PostMapping("/hello")
    public Book showBook(@RequestBody @Valid Book book) throws Exception {
     throw new Exception();

    }



}