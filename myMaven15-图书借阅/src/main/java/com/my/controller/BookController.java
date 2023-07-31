package com.my.controller;
import com.my.service.BookService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
图书信息Controller
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //注入BookService对象
    @Autowired
    private BookService bookService;

    /**
     * 查询最新上架的图书
     */
    @RequestMapping("/selectNewbooks")
    public ModelAndView selectNewbooks() {
        //查询最新上架的5个的图书信息
        int pageNum = 1;
        int pageSize = 10;
        PageResult pageResult = bookService.selectNewBooks(pageNum, pageSize);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("books_new");
        modelAndView.addObject("pageResult", pageResult);
        return modelAndView;
    }
}