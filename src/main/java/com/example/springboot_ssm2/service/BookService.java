package com.example.springboot_ssm2.service;

import com.example.springboot_ssm2.domain.Book;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService{
    /**
     * 保存
     * @param book
     * @return
     */
    public  boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public  boolean update(Book book);

    /**
     * 删除
     * @param id
     * @return
     */
    public  boolean delete(Integer id);

    /**
     * 选择
     * @param id
     * @return
     */
     public  Book getById(Integer id);

    /**
     * 选择全部

     * @return
     */
    public List<Book> getAll();
}
