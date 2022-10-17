package com.example.springboot_ssm2.dao;

import com.example.springboot_ssm2.domain.Book;

import org.apache.ibatis.annotations.*;

import java.util.List;

//todo
@Mapper
public interface BookDao {
    @Insert("insert into tbl_book(type,name,description) values(#{type},#{name},#{description})")
    public  int save(Book book);
    @Update("Update tbl_book set type=#{type},name=#{name},description=#{description} where id =#{id}")
    public  int update(Book book);
    @Delete("delete from tbl_book where id=#{id}")
    public  int delete(Integer id);
    @Select("select * from tbl_book where id=#{id}")
    public  Book getById(Integer id);
    @Select("select * from tbl_book")
    public List<Book> getAll();
}
