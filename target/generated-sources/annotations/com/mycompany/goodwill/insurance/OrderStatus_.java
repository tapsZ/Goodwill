package com.mycompany.goodwill.insurance;

import com.mycompany.goodwill.insurance.CustomerOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-10T12:41:50")
@StaticMetamodel(OrderStatus.class)
public class OrderStatus_ { 

    public static volatile SingularAttribute<OrderStatus, Integer> id;
    public static volatile CollectionAttribute<OrderStatus, CustomerOrder> customerOrderCollection;
    public static volatile SingularAttribute<OrderStatus, String> status;
    public static volatile SingularAttribute<OrderStatus, String> description;

}