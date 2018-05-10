package camt.se234.project;


import camt.se234.project.dao.ProductDao;
import camt.se234.project.entity.Product;
import camt.se234.project.service.ProductServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductServiceImplTest {
    ProductServiceImpl productService;
    ProductDao productDao;

    @Before
    public void setup(){
        productDao = mock(ProductDao.class);
        productService = new ProductServiceImpl();
        productService.setProductDao(productDao);
    }

    @Test
    public void testGetProducts(){
        List<Product> mockProducts = new ArrayList<>();
        mockProducts.add(new Product("Eat01","Stake","Eat","image/",2500));
        when(productDao.getProducts()).thenReturn(mockProducts);
        assertThat(productService.getAllProducts(), hasItem(new Product("Eat01","Stake","Eat","image/",2500)));
    }

    @Test(expected = AssertionError.class)
    public void testGetProductsWithException(){
        assertThat(productService.getAllProducts(), nullValue());
    }

    @Test
    public void testGetAvailableProducts(){
        List<Product> mockProducts = new ArrayList<>();
        mockProducts.add(new Product("Eat01","Stake","Eat","image/",2500));
        when(productDao.getProducts()).thenReturn(mockProducts);
        assertThat(productService.getAvailableProducts(), hasItem(new Product("Eat01","Stake","Eat","image/",2500)));
    }



    @Test
    public void testGetUnavailableProductSize(){
        List<Product> mockProducts = new ArrayList<>();
        mockProducts.add(new Product("Eat01","Stake","Eat","image/",2500));
        mockProducts.add(new Product("Eat01","Stake","Eat","image/",-2500));
        when(productDao.getProducts()).thenReturn(mockProducts);
        assertThat(productService.getUnavailableProductSize(),is(1));
        mockProducts.add(new Product("Eat01","KFC","Eat","image2/",1500));
        mockProducts.add(new Product("Eat01","KFC","Eat","image2/",-1500));
        assertThat(productService.getUnavailableProductSize(),is(2));
    }

}
