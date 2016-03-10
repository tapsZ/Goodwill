package com.mycompany.goodwill.insurance;

import com.mycompany.goodwill.insurance.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-10T12:41:50")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, Integer> id;
    public static volatile SingularAttribute<Category, String> tags;
    public static volatile SingularAttribute<Category, String> name;
    public static volatile CollectionAttribute<Category, Product> productCollection;

}