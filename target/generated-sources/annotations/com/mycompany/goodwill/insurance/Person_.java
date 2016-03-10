package com.mycompany.goodwill.insurance;

import com.mycompany.goodwill.insurance.CustomerOrder;
import com.mycompany.goodwill.insurance.Groups;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-10T12:41:50")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, Integer> id;
    public static volatile CollectionAttribute<Person, CustomerOrder> customerOrderCollection;
    public static volatile SingularAttribute<Person, String> email;
    public static volatile SingularAttribute<Person, String> address;
    public static volatile CollectionAttribute<Person, Groups> groupsCollection;
    public static volatile SingularAttribute<Person, String> dtype;
    public static volatile SingularAttribute<Person, String> lastname;
    public static volatile SingularAttribute<Person, String> firstname;
    public static volatile SingularAttribute<Person, String> password;
    public static volatile SingularAttribute<Person, String> city;

}