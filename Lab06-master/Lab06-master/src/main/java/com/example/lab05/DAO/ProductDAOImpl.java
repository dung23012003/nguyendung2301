package com.example.lab05.DAO;

import com.example.lab05.model.ProductEntity;
import com.example.lab05.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class ProductDAOImpl implements ProductDAO{

    @Override
    public List<ProductEntity> getAllProduct() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            List<ProductEntity> list = session.createQuery("from ProductEntity ").list();
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
    public ProductEntity getProductById(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            ProductEntity product = (ProductEntity) session.createQuery("from ProductEntity where maSP = :maSP").setParameter("maSP", maSP).uniqueResult();
            session.getTransaction();
            session.close();
            return product;
        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return null;
    }

    @Override
    public boolean insertProduct(ProductEntity product) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(product);
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
    public boolean updateProduct(ProductEntity product) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.update(product);
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
    public boolean deleteProduct(String maSP) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            int res = session.createQuery("delete from ProductEntity where maSp = :maSP").setParameter("maSP", maSP).executeUpdate();
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
