package com.mycompany.goodwill.insurance;

import com.mycompany.goodwill.insurance.OrderDetail;
import com.mycompany.goodwill.insurance.OrderStatus;
import com.mycompany.goodwill.insurance.Person;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-10T12:41:50")
@StaticMetamodel(CustomerOrder.class)
public class CustomerOrder_ { 

    public static volatile SingularAttribute<CustomerOrder, Integer> id;
    public static volatile SingularAttribute<CustomerOrder, Double> amount;
    public static volatile SingularAttribute<CustomerOrder, OrderStatus> statusId;
    public static volatile SingularAttribute<CustomerOrder, Person> customerId;
    public static volatile CollectionAttribute<CustomerOrder, OrderDetail> orderDetailCollection;
    public static volatile SingularAttribute<CustomerOrder, Date> dateCreated;

}