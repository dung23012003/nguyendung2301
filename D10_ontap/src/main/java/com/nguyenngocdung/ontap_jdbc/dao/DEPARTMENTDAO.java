package com.nguyenngocdung.ontap_jdbc.dao;

import java.util.List;

import com.nguyenngocdung.ontap_jdbc.entity.DEPARTMENT;

public interface DEPARTMENTDAO {
    List<DEPARTMENT> getAll();
    List<DEPARTMENT> getDEPARTMENTByDEPT_NAME(String DEPT_NAME);
    DEPARTMENT getDEPARTMENTByid(Integer DEPT_ID);
    Boolean insertDEPARTMENT(DEPARTMENT department);
    Boolean updateDEPARTMENT(DEPARTMENT department);
    Boolean deleteDEPARTMENTByid(Integer DEPT_ID );
}