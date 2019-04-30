package com.example.demo;

import com.example.demo.databean.POStudent;
import com.example.demo.services.Services;
import com.example.demo.dao.Sqlsql;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private Sqlsql sql;
    @Autowired
    private Services services;

    @Before
    public void action(){
        System.out.println("测试开始");

    }



    @Test
    public void add(){
        POStudent poStudent = new POStudent();
        poStudent.setId(2);
        poStudent.setAge("100");
        poStudent.setName("张飞");
        services.add(poStudent);
    }







    @After
    public void out(){
        System.out.println("测试结束");
    }
}
