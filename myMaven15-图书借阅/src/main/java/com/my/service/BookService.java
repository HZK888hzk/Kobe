package com.my.service;
import entity.PageResult;
/**
 * 图书接口
 */
public interface BookService {
    //查询最新上架的图书
    PageResult selectNewBooks(Integer pageNum, Integer pageSize);

}
