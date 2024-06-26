package com.itheima.book.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author san qian
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecordDto implements Serializable {
    private Integer[] bookId;
    private Integer userId;
    private LocalDate borrowDate;
    private LocalDate returnDate;
}
