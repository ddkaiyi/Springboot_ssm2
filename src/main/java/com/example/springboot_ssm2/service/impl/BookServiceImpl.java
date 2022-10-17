package com.example.springboot_ssm2.service.impl;

import com.example.springboot_ssm2.controller.Code;
import com.example.springboot_ssm2.dao.BookDao;
import com.example.springboot_ssm2.domain.Book;
import com.example.springboot_ssm2.exception.SystemException;
import com.example.springboot_ssm2.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;


    @Override
    public boolean save(Book book) {
       return  bookDao.save(book)>0;

    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book)>0;

    }

    @Override
    public boolean delete(Integer id) {
       return  bookDao.delete(id)>0;

    }

    @Override
    public Book getById(Integer id) {

        try{
            int i=1/0;
        }catch (ArithmeticException e){
            throw  new SystemException(Code.SYSTEM_ERR,"服务器访问异常",e);
        }
        return  bookDao.getById(id);

    }

    @Override
    public List<Book> getAll() {
        return  bookDao.getAll();
    }
}
