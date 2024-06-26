package com.itheima.book.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author san qian
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookVo {
    private long id;
    private String name;
    private String author;
    private String publisher;
    private LocalDate publicationDate;
}
