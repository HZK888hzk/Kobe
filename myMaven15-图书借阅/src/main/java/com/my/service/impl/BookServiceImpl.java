package com.my.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.my.domain.Book;
import com.my.mapper.BookMapper;
import com.my.service.BookService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    //注入BookMapper对象
    @Autowired
    private BookMapper bookMapper;

    /**
     * 根据当前页码和每页需要展示的数据条数，查询最新上架的图书信息
     * @param pageNum 当前页码
     * @param pageSize 每页显示数量
     */
    @Override
    public PageResult selectNewBooks(Integer pageNum, Integer pageSize) {
        // 设置分页查询的参数，开始分页
        PageHelper.startPage(pageNum, pageSize);
        Page<Book> page=bookMapper.selectNewBooks();
        return new PageResult(page.getTotal(),page.getResult());
    }
}
