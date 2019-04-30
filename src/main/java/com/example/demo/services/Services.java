package com.example.demo.services;

import com.example.demo.databean.POStudent;
import com.example.demo.dao.Sqlsql;
import com.example.demo.dao.Userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {
    @Autowired
    private Sqlsql sqlsql;
    @Autowired
    private Userdao userdao;

    public POStudent add(POStudent student){
        POStudent save = sqlsql.save(student);
        return  save;
    }

    public List<POStudent> query(){
        return userdao.queryList();


    }







}
