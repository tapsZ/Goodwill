/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.goodwill.insurance.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author user1
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.mycompany.goodwill.insurance.service.CategoryFacadeREST.class);
        resources.add(com.mycompany.goodwill.insurance.service.CustomerOrderFacadeREST.class);
        resources.add(com.mycompany.goodwill.insurance.service.GroupsFacadeREST.class);
        resources.add(com.mycompany.goodwill.insurance.service.OrderDetailFacadeREST.class);
        resources.add(com.mycompany.goodwill.insurance.service.OrderStatusFacadeREST.class);
        resources.add(com.mycompany.goodwill.insurance.service.PersonFacadeREST.class);
        resources.add(com.mycompany.goodwill.insurance.service.ProductFacadeREST.class);
    }
    
}
