package com.revision.demo.exception;

import com.revision.demo.utils.ResponseCode;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @author: Sundar Gautam
 * @create date: 6/23/2020
 */
@Data
@NoArgsConstructor
public class MyException extends RuntimeException{
    private ResponseCode responseCode;
    public MyException(String message, ResponseCode responseCode){
        super(message);
        this.responseCode = responseCode;


    }

}
