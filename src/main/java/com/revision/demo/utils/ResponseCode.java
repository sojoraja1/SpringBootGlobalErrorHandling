package com.revision.demo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @author: Sundar Gautam
 * @create date: 6/23/2020
 */
@NoArgsConstructor
@AllArgsConstructor
public enum ResponseCode {

    NOT_FOUND("bsc-e11"),
    FOUND("found");


    private String responseMessage;

    public String getResponseMessage(){
        return responseMessage;
    }



}
