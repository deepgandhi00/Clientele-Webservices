/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientele.service;

import clientele.AddressDetail;
import clientele.AddressDetail_;
import clientele.cartProductPojo;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
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
@Path("clientele.addressdetail")
public class AddressDetailFacadeREST extends AbstractFacade<AddressDetail> {
    @PersistenceContext(unitName = "clientele_webservicesPU")
    private EntityManager em;

    public AddressDetailFacadeREST() {
        super(AddressDetail.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(AddressDetail entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") String id, AddressDetail entity) {
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
    public AddressDetail find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<AddressDetail> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<AddressDetail> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
    
    
    /*******************************custom method************************************/
    @GET
    @Path("getaddresses/{ids}")
    @Produces({"application/json"})
    public List<AddressDetail> findinids(@PathParam("ids") String ids){
        EntityManager em=getEntityManager();
        List<AddressDetail> lst=new ArrayList<>();
        CriteriaBuilder cb=em.getCriteriaBuilder();
            CriteriaQuery cq=cb.createQuery(AddressDetail.class);
            Root<AddressDetail> root=cq.from(AddressDetail.class);
            
//            cb.in(root.get(AddressDetail_.addId).in(ids));
           String[] a=ids.split(",");
           
            cq.where(root.get(AddressDetail_.addId).in(a));
            return em.createQuery(cq).getResultList();
    }
}
