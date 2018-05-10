package camt.se234.project;


import camt.se234.project.dao.OrderDao;
import camt.se234.project.entity.Product;
import camt.se234.project.entity.SaleOrder;
import camt.se234.project.entity.SaleTransaction;
import camt.se234.project.service.SaleOrderServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.Is.is;  
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SaleOrderServiceImplTest {
    SaleOrderServiceImpl saleOrderService;
    OrderDao orderDao;

    @Before
    public void setup(){
        orderDao = mock(OrderDao.class);
        saleOrderService = new SaleOrderServiceImpl();
        saleOrderService.setOrderDao(orderDao);
    }

    @Test
    public void testGetSaleOrdersTest(){
        List<SaleOrder> mockSaleOrders = new ArrayList<>();
        List<SaleTransaction> transactions = new ArrayList<>();
        mockSaleOrders.add(new SaleOrder("Sale01",transactions));
        mockSaleOrders.add(new SaleOrder("Sale02",transactions));
        when(orderDao.getOrders()).thenReturn(mockSaleOrders);
        assertThat(saleOrderService.getSaleOrders(),hasItem(new SaleOrder("Sale01",transactions)));
        assertThat(saleOrderService.getSaleOrders(),hasItems(new SaleOrder("Sale01",transactions),
                new SaleOrder("Sale02",transactions)));
    }



    @Test
    public void testGetAverageSaleOrderPrice(){
        List<SaleOrder> mockSaleOrders = new ArrayList<>();
        List<SaleTransaction> transactions = new ArrayList<>();
        List<SaleTransaction> transactions2 = new ArrayList<>();
        transactions.add(new SaleTransaction("Tran01",new SaleOrder("Sale01",transactions),
                new Product("Eat01","Stake","Eat","image/",2500),12));
        mockSaleOrders.add(new SaleOrder("Sale01",transactions));
        when(orderDao.getOrders()).thenReturn(mockSaleOrders);
        assertThat(saleOrderService.getAverageSaleOrderPrice(),is(closeTo(30000,0.01)));
        transactions.add(new SaleTransaction("Tran02",new SaleOrder("Sale01",transactions),
                new Product("Eat02","Stake","Eat","image/",1500),2));
        assertThat(saleOrderService.getAverageSaleOrderPrice(),is(closeTo(33000,0.01)));
        transactions2.add(new SaleTransaction("Tran02",new SaleOrder("Sale02",transactions),
                new Product("Eat02","Stake","Eat","image/",1500),20));
        mockSaleOrders.add(new SaleOrder("Sale01",transactions2));
        assertThat(saleOrderService.getAverageSaleOrderPrice(),is(closeTo(31500,0.01)));
    }


}
