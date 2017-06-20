package com.ljm.dao;

import com.ljm.model.task10;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liujm on 2017/6/15.
 */
@Component
@Repository
public interface task10dao {
    //登陆方法
    task10 Login(@Param("stu_name")String stu_name, @Param("stu_pwd")String stu_pwd);
    //通过ID查找学生信息
//    public Student selectStudentById(@Param("id")int id);
    //查看所有学生信息
    List<task10> selectAllStudent();
    //添加学生
    int addStudent(task10 stu);
    //通过id删除学生
    void  deleteStudentById(@Param("id")int id);
    //修改学生信息
    void updateStudentById(@Param("Student")task10 stu);

}
