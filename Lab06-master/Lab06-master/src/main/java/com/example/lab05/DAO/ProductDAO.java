package com.example.lab05.DAO;

import com.example.lab05.model.ProductEntity;

import java.util.List;

public interface ProductDAO {
    public List<ProductEntity> getAllProduct();
    public ProductEntity getProductById(String maSP);
    public boolean insertProduct(ProductEntity product);
    public boolean updateProduct(ProductEntity product);
    public boolean deleteProduct(String maSP);
}
