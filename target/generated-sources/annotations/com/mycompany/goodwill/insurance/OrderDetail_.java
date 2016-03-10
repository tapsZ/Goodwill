package com.mycompany.goodwill.insurance;

import com.mycompany.goodwill.insurance.CustomerOrder;
import com.mycompany.goodwill.insurance.OrderDetailPK;
import com.mycompany.goodwill.insurance.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-10T12:41:50")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ { 

    public static volatile SingularAttribute<OrderDetail, Product> product;
    public static volatile SingularAttribute<OrderDetail, CustomerOrder> customerOrder;
    public static volatile SingularAttribute<OrderDetail, Integer> qty;
    public static volatile SingularAttribute<OrderDetail, OrderDetailPK> orderDetailPK;

}