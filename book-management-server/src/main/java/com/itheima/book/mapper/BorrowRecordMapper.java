package com.itheima.book.mapper;

import com.itheima.book.entity.BorrowRecord;

/**
* @author san qian
* @description 针对表【borrow_record(借阅记录表)】的数据库操作Mapper
* @createDate 2024-06-26 08:32:16
* @Entity com.itheima.book.entity.BorrowRecord
*/
public interface BorrowRecordMapper {

    int deleteByPrimaryKey(Long id);

    int insert(BorrowRecord record);

    int insertSelective(BorrowRecord record);

    BorrowRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BorrowRecord record);

    int updateByPrimaryKey(BorrowRecord record);

}
