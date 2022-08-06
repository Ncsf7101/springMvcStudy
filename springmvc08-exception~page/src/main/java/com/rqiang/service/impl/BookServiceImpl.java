package com.rqiang.service.impl;

import com.rqiang.controller.Code;
import com.rqiang.dao.BookDao;
import com.rqiang.domain.Book;
import com.rqiang.exception.BusinessException;
import com.rqiang.exception.SystemException;
import com.rqiang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    @Override
    public Book getById(Integer id) {
//        if(id == 1){
//            throw new BusinessException(Code.BUSINESS_ERR, "请不要使用你的技术挑战耐心。");
//        }
        //int i = 1/0;
//        try{
//            int i = 1/0;
//        }catch (Exception e){
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "服务器访问超时，请重试！", e);
//        }
        return bookDao.getById(id);

    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
