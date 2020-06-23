package com.revision.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/*
 * @author: Sundar Gautam
 * @create date: 6/23/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @NotEmpty(message = "cannot be empty")
    private String name;

}
