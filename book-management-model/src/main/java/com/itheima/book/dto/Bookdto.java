package com.itheima.book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author san qian
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bookdto implements Serializable {
    private String name;
    private String author;
    private String publisher;
    private LocalDate publicationDate;
}
