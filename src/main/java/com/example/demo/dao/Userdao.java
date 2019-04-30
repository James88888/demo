package com.example.demo.dao;

import com.example.demo.databean.POStudent;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
public class Userdao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<POStudent> queryList(){
        StringBuffer str = new StringBuffer();
        str.append("select");
        str.append(" *");
        str.append(" from");
        str.append(" Test_student");
        Query nativeQuery = entityManager.createNativeQuery(str.toString());
        List resultList = nativeQuery.getResultList();
        return resultList;


    }



}
