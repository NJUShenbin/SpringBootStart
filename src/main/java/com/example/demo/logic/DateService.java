package com.example.demo.logic;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DateService {

    public String getDate(){
        return new Date().toString();
    }

}
