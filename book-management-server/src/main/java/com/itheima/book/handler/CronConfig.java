package com.itheima.book.handler;

import com.itheima.book.mapper.BorrowRecordMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author san qian
 **/
@Component
public class CronConfig {
    final
    BorrowRecordMapper borrowRecordMapper;

    public CronConfig(BorrowRecordMapper borrowRecordMapper) {
        this.borrowRecordMapper = borrowRecordMapper;
    }

    @Scheduled(cron = "0 * * 1W 1/1 ?  ")
    public void clear(){
        borrowRecordMapper.deleteBytimer();
    }
}
