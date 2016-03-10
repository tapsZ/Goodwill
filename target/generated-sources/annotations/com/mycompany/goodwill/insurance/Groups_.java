package com.mycompany.goodwill.insurance;

import com.mycompany.goodwill.insurance.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-10T12:41:50")
@StaticMetamodel(Groups.class)
public class Groups_ { 

    public static volatile SingularAttribute<Groups, Integer> id;
    public static volatile SingularAttribute<Groups, String> description;
    public static volatile SingularAttribute<Groups, String> name;
    public static volatile CollectionAttribute<Groups, Person> personCollection;

}