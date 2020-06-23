package com.revision.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
 * @author: Sundar Gautam
 * @create date: 6/23/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomErrorResponse {
    private String errorMessage;
    private String errorDescription;
    private Date date;


}
