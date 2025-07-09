package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductRepo {
    Product product;

    // list for storing products
    List<Product> productList = new ArrayList<>();

    // retrieve a single product
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    // retrieve all products
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProductToList(Product product, List<Product> productList) {
        setProductList(productList);
        setProduct(product);
        productList.add(product);
    }

    public void removeProductFromList(Product product, List<Product> productList) {
        setProductList(productList);
        setProduct(product);
        productList.remove(product);
    }

//    @Override
//    public String toString() {
//        return "ProductRepo{" +
//                "product=" + product +
//                ", productList=" + productList +
//                '}';
//    }

    //    public void addProductsToList(Product[] products, List<Product> productList) {
//        productList.addAll(Arrays.asList(products));
//    } boolean add = productList.add(products);
}
