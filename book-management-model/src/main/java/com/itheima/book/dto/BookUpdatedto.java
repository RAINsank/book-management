package com.itheima.book.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
public class BookUpdatedto implements Serializable {
    private String name;
    private Integer id;
    private String publisher;
    private LocalDate publicationDate;
}
