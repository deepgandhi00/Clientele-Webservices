/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientele.service;

import clientele.ProductOrder;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Royal
 */
@Stateless
@Path("clientele.productorder")
public class ProductOrderFacadeREST extends AbstractFacade<ProductOrder> {
    @PersistenceContext(unitName = "clientele_webservicesPU")
    private EntityManager em;

    public ProductOrderFacadeREST() {
        super(ProductOrder.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(ProductOrder entity) {
        super.create(entity);
    }
    
    @GET
    @Path("placeorder/{id}/{pmid}") 
    @Produces({"text/plain"})
    public String placeorder(@PathParam("id") Integer id,@PathParam("pmid") Integer pmid) {
        ProductOrder po=new ProductOrder();
        po.setDate(new Date());
        po.setTime(new Date());
        po.setDeliveryBoyId(0);
        po.setPaymentModeId(pmid);
        po.setRetailerId(id);
        po.setStatus("ordered");
        
        super.create(po);
        
        EntityManager em=getEntityManager();
        Query q=em.createQuery("SELECT max(p.orderId) from ProductOrder p");
        Object o=q.getSingleResult();
        return o+"";
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") String id, ProductOrder entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public ProductOrder find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<ProductOrder> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<ProductOrder> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
