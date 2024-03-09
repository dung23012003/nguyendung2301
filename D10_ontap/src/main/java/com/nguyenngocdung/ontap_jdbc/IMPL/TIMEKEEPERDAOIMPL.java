package com.nguyenngocdung.ontap_jdbc.IMPL;

import java.util.List;

import org.hibernate.Session;

import com.nguyenngocdung.ontap_jdbc.dao.TIMKEEPERDAO;
import com.nguyenngocdung.ontap_jdbc.entity.TIMEKEEPEREntity;
import com.nguyenngocdung.ontap_jdbc.dao.DEPARTMENTDAO;
import com.nguyenngocdung.ontap_jdbc.entity.DEPARTMENT;
import com.public class DEPARTMENTDAOIMPL implements DEPARTMENTDAO {
    @Override
    public List<DEPARTMENT> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from DEPARTMENT", DEPARTMENT.class).list();
        }
    }

    @Override
    public List<DEPARTMENT> getDEPARTMENTByDEPT_NAME(String DEPT_NAME) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            List<DEPARTMENT> department =  session.createQuery("from DEPARTMENT where DEPT_NAME = :DEPT_NAME").setParameter("DEPT_NAME", DEPT_NAME).list();
            session.getTransaction().commit();
            session.close();
            return department;
        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return null;
    }

    @Override
    public DEPARTMENT getDEPARTMENTByid(Integer DEPT_ID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            DEPARTMENT department = (DEPARTMENT) session.createQuery("from DEPARTMENT where DEPT_ID = :DEPT_ID").setParameter("DEPT_ID",DEPT_ID ).uniqueResult();
            session.getTransaction().commit();
            session.close();
            return department;
        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return null;
    }

    @Override
    public Boolean insertDEPARTMENT(DEPARTMENT department) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();
            session.close();
            return true;

        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return false;
    }

    @Override
    public Boolean updateDEPARTMENT(DEPARTMENT department) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.update(department);
            session.getTransaction().commit();
            session.close();
            return true;

        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return false;
    }

    @Override
    public Boolean deleteDEPARTMENTByid(Integer DEPT_ID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            int res = session.createQuery("delete  from DEPARTMENT where DEPT_ID = :DEPT_ID").setParameter("DEPT_ID", DEPT_ID).executeUpdate();
            session.getTransaction().commit();
            session.close();
            if (res>0)
                return true;
        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return false;
    }

}
ontap_jdbc.util.HibernateUtil;

public class TIMKEEPERDAOIMPL implements TIMKEEPERDAO {
    @Override
    public List<TIMEKEEPEREntity> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            List<TIMEKEEPEREntity> list = session.createQuery("from TIMEKEEPEREntity ").list();
            session.getTransaction();
            session.close();
            return list;
        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return null;
    }
    @Override
    public TIMEKEEPEREntity getTIMEKEEPERByid(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            TIMEKEEPEREntity employee = (TIMEKEEPEREntity) session.createQuery("from TIMEKEEPEREntity where Timekeeper_Id = :Timekeeper_Id").setParameter("Timekeeper_Id", id).uniqueResult();
            session.getTransaction();
            session.close();
            return employee;
        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return null;
    }

    @Override
    public Boolean insertTIMEKEEPER(TIMEKEEPEREntity timekeeper) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(timekeeper);
            session.getTransaction().commit();
            session.close();
            return true;

        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return false;
    }

    @Override
    public Boolean updateTIMEKEEPER(TIMEKEEPEREntity timekeeper) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.update(timekeeper);
            session.getTransaction().commit();
            session.close();
            return true;

        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return false;
    }

    @Override
    public Boolean deleteTIMEKEEPERByid(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            int res = session.createQuery("delete  from TIMEKEEPEREntity where Timekeeper_Id = :Timekeeper_Id").setParameter("Timekeeper_Id", id).executeUpdate();
            session.getTransaction().commit();
            session.close();
            if (res>0)
                return true;
        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return false;
    }
}
