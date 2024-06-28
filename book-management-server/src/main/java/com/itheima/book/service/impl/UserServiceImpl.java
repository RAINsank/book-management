package com.itheima.book.service.impl;

import com.itheima.book.dto.RecordDto;
import com.itheima.book.entity.Book;
import com.itheima.book.entity.BorrowRecord;
import com.itheima.book.enums.CodeEnum;
import com.itheima.book.exception.Exceptions;
import com.itheima.book.mapper.BookMapper;
import com.itheima.book.mapper.BorrowRecordMapper;
import com.itheima.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.time.LocalDate;
import java.util.List;

/**
 * @author san qian
 **/
@Service
public class UserServiceImpl implements UserService {
    final
    BorrowRecordMapper borrowRecordMapper;
    final
    BookMapper bookMapper;

    public UserServiceImpl(BorrowRecordMapper borrowRecordMapper, BookMapper bookMapper) {
        this.borrowRecordMapper = borrowRecordMapper;
        this.bookMapper = bookMapper;
    }

    @Override
    public void borrowBooks(Integer[] ids) {
        if(ObjectUtils.isEmpty(ids)){
            Exceptions.cast(CodeEnum.DATA_ERROR);
        }
        RecordDto dto=new RecordDto();
        //todo 从TOKEN中获取用户ID
        dto.setUserId(1);
        dto.setBookId(ids);
        dto.setBorrowDate(LocalDate.now());
        borrowRecordMapper.borrowBooks(dto);
    }

    @Override
    public void returnBook(Integer id) {

        BorrowRecord record=new BorrowRecord();
        record.setId(id);
        record.setReturnDate(LocalDate.now());
        borrowRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Book> getBook() {
        List<Book> list= bookMapper.selectAll();
        return list;
    }

}
