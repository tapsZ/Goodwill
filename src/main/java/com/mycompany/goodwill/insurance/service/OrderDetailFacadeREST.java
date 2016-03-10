/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.goodwill.insurance.service;

import com.mycompany.goodwill.insurance.OrderDetail;
import com.mycompany.goodwill.insurance.OrderDetailPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author user1
 */
@Stateless
@Path("com.mycompany.goodwill.insurance.orderdetail")
public class OrderDetailFacadeREST extends AbstractFacade<OrderDetail> {
    @PersistenceContext(unitName = "com.mycompany_Goodwill-Insurance_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private OrderDetailPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;orderId=orderIdValue;productId=productIdValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.mycompany.goodwill.insurance.OrderDetailPK key = new com.mycompany.goodwill.insurance.OrderDetailPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> orderId = map.get("orderId");
        if (orderId != null && !orderId.isEmpty()) {
            key.setOrderId(new java.lang.Integer(orderId.get(0)));
        }
        java.util.List<String> productId = map.get("productId");
        if (productId != null && !productId.isEmpty()) {
            key.setProductId(new java.lang.Integer(productId.get(0)));
        }
        return key;
    }

    public OrderDetailFacadeREST() {
        super(OrderDetail.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(OrderDetail entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, OrderDetail entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.mycompany.goodwill.insurance.OrderDetailPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public OrderDetail find(@PathParam("id") PathSegment id) {
        com.mycompany.goodwill.insurance.OrderDetailPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<OrderDetail> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<OrderDetail> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
