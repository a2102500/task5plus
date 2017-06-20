package com.ljm.service;

import com.ljm.dao.task10dao;
import com.ljm.model.task10;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liujm on 2017/6/15.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class taskserviceimpl implements taskservice{
    @Resource
    private task10dao stuDao;


    public task10 Login(String name, String password) {
        return  stuDao.Login(name,password);
    }

    @Override
    public List<task10> getAllStudent() {
        return stuDao.selectAllStudent();
    }

    @Override
    public int addStudent(task10 task10) {
        return stuDao.addStudent(task10);
    }

    @Override
    public void deleteStudentById(int id) {
        stuDao.deleteStudentById(id);
    }

    @Override
    public void updateStudentById(task10 task10) {
        stuDao.updateStudentById(task10);
    }
}
