package com.nguyenngocdung.ontap_jdbc.dao;

import java.util.List;

import com.nguyenngocdung.ontap_jdbc.entity.SALARY_GRADE;

public interface TIMKEEPERDAO {
    List<TIMEKEEPEREntity> getAll();
    TIMEKEEPEREntity getTIMEKEEPERByid( String id);
    Boolean insertTIMEKEEPER(TIMEKEEPEREntity timekeeper);
    Boolean updateTIMEKEEPER(TIMEKEEPEREntity timekeeper);
    Boolean deleteTIMEKEEPERByid(String id );
}
