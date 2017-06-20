package com.ljm.service;

import com.ljm.model.task10;

import java.util.List;

/**
 * Created by liujm on 2017/6/15.
 */
public interface taskservice {

    task10 Login(String name,String password);

    List<task10> getAllStudent();

    int addStudent(task10 t10);

    void deleteStudentById(int id);

    void updateStudentById(task10 t10);
}
