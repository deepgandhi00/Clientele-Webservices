/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientele.service;

import clientele.Subcategory;
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
@Path("clientele.subcategory")
public class SubcategoryFacadeREST extends AbstractFacade<Subcategory> {
    @PersistenceContext(unitName = "clientele_webservicesPU")
    private EntityManager em;

    public SubcategoryFacadeREST() {
        super(Subcategory.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Subcategory entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") String id, Subcategory entity) {
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
    public Subcategory find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Subcategory> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Subcategory> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
    /**********************************custom methods**************************************/
    @GET
    @Path("getsubcategories/{id}")
    @Produces("application/json")
    public List<Subcategory> findsubcategorytoid(@PathParam("id") Integer id){
        EntityManager em=getEntityManager();
        Query q=em.createQuery("SELECT a FROM Subcategory a WHERE a.categoryId= :id");
        q.setParameter("id", id);
        List<Subcategory> lst=q.getResultList();
        return lst;
    } 
}
