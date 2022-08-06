package com.rqiang.dao;

import com.rqiang.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserDao {

    @Insert("insert into tb_user(name, age) values(#{name}, #{age})")
    public void save(User user);
}
