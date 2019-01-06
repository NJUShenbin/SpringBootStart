package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;


public class BookQueryVo {

    List<BookEntity> results;

    @JsonFormat(pattern = "yyyy:MM:dd HH:mm:ss")
    Date queryDate;

    String serverVersion;
}
