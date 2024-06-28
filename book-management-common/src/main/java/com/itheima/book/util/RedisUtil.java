package com.itheima.book.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {

    final
    RedisTemplate redisTemplate;

    public RedisUtil(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 删除 Redis 中的 books 库
     */
    public  void deleteBooks() {
        redisTemplate.delete("book_list");
    }

    /**
     * 删除 Redis 中的所有数据
     */
    public  void flushAll() {
        redisTemplate.getConnectionFactory().getConnection().flushAll();
    }
}
