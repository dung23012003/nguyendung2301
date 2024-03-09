package com.nguyenngocdung.ontap_jdbc.dao;

import java.util.List;

import com.nguyenngocdung.ontap_jdbc.entity.SALARY_GRADE;

public interface SALARY_GRADEDAO {
    List<SALARY_GRADE> getAll();
    SALARY_GRADE getSALARY_GRADEByid( Integer id);
    Boolean insertSALARY_GRADE(SALARY_GRADE salaryGrade);
    Boolean updateSALARY_GRADE(SALARY_GRADE salaryGrade);
    Boolean deleteSALARY_GRADEByid(Integer id );
}
