package com.itheima.book.service.impl;

import com.itheima.book.dto.BookUpdatedto;
import com.itheima.book.dto.Bookdto;
import com.itheima.book.entity.Author;
import com.itheima.book.entity.Book;
import com.itheima.book.enums.CodeEnum;
import com.itheima.book.exception.Exceptions;
import com.itheima.book.mapper.AuthorMapper;
import com.itheima.book.mapper.BookMapper;
import com.itheima.book.service.BookService;
import com.itheima.book.util.RedisUtil;
import com.itheima.book.util.StringUtil;
import com.itheima.book.vo.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * @author san qian
 **/
@Service
public class BookServiceImpl implements BookService {
    final
    BookMapper bookMapper;
    final
    AuthorMapper authorMapper;
    final
    RedisUtil redisUtil;

    public BookServiceImpl(BookMapper bookMapper, AuthorMapper authorMapper, RedisUtil redisUtil) {
        this.bookMapper = bookMapper;
        this.authorMapper = authorMapper;
        this.redisUtil = redisUtil;
    }

    @Override
    public List<BookVo> selectBookBynameorAuthor(String name, String author) {
        //查询
        List<Book> list=bookMapper.selectByName(name);
        List<Author> list1=authorMapper.selectByAuthor(author);
        List<BookVo> list2 = list.stream().map((book) -> {
            for (Author author1 : list1) {
                if (author1.getId().equals(book.getAuthorId())) {
                    return new BookVo(book.getId(), book.getName(), author1.getName(), book.getPublisher(), book.getPublicationDate());
                }
            }
            return null;
        }).toList();
        return list2;
    }
    @Transactional
    @Override
    public void addBook(Bookdto dto) {
        redisUtil.deleteBooks();
        if (ObjectUtils.isEmpty(dto)||StringUtil.isNullOrEmpty(dto.getName())||StringUtil.isNullOrEmpty(dto.getAuthor())) {
            Exceptions.cast(CodeEnum.DATA_ERROR);
        }

        Author author=new Author();
        author.setName(dto.getAuthor());
        authorMapper.insert(author);
        Book.BookBuilder book = Book.builder()
                .name(dto.getName())
                .authorId(author.getId())
                .publisher(dto.getPublisher())
                .publicationDate(dto.getPublicationDate());
        bookMapper.insert(book.build());
    }

    @Override
    public void deleteBook(Long id) {
        redisUtil.deleteBooks();

        bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void UpdateBook(BookUpdatedto dto) {
        redisUtil.deleteBooks();

        if (ObjectUtils.isEmpty(dto)||StringUtil.isNullOrEmpty(dto.getName())) {
            Exceptions.cast(CodeEnum.DATA_ERROR);
        }
        Book book1 = bookMapper.selectByPrimaryKey(dto.getId());
        Book.BookBuilder book = Book.builder()
                .id(dto.getId())
                .authorId(book1.getAuthorId())
                .name(dto.getName())
                .publisher(dto.getPublisher())
                .publicationDate(dto.getPublicationDate());
        bookMapper.updateByPrimaryKeySelective(book.build());
    }
}
