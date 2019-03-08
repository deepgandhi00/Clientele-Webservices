/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientele.service;

import clientele.OrderDetail;
import clientele.Retailers;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
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
@Path("clientele.retailers")
public class RetailersFacadeREST extends AbstractFacade<Retailers> {
    @PersistenceContext(unitName = "clientele_webservicesPU")
    private EntityManager em;

    public RetailersFacadeREST() {
        super(Retailers.class);
    }

    @POST
    @Override
    @Consumes({"application/json"})
    public void create(Retailers entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Retailers entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Retailers find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Retailers> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Retailers> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
    
    
    /*****************************custom methods ***********************************************/
    
    @GET
    @Path("getRetailers/{email}")
    @Produces({"application/json"})
    public List<Retailers> findRetailer(@PathParam("email") String email){
        EntityManager em=getEntityManager();
        Query q=em.createQuery("SELECT r FROM Retailers r WHERE r.retailerEmail = :em");
        q.setParameter("em", email);
        List<Retailers> lst=(List<Retailers>)q.getResultList();
        if(lst.size()!=0){
            return lst;
        }
        else{
            return null;
        }
    }
   
    
    @POST
     @Path("addRetailer")
    @Produces({"text/plain"})
    @Consumes({"application/json"})
    public String createRetailer(Retailers entity) {
        
        super.create(entity);
        EntityManager em=getEntityManager();
        Query q=em.createQuery("SELECT MAX(p.retailerId) from Retailers p");
        Object r=q.getSingleResult();
//    
        
        return r+"";
    }
}
