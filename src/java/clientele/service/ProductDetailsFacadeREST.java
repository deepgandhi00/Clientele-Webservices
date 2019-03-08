/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientele.service;

import clientele.*;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
@Path("clientele.productdetails")
public class ProductDetailsFacadeREST extends AbstractFacade<ProductDetails> {
    @PersistenceContext(unitName = "clientele_webservicesPU")
    private EntityManager em;

    public ProductDetailsFacadeREST() {
        super(ProductDetails.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(ProductDetails entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, ProductDetails entity) {
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
    public ProductDetails find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<ProductDetails> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<ProductDetails> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
    
    /*******************************************custom methods********************************************/
    
    @GET
    @Path("getproduct/{id}")
    @Produces({"application/json"})
    public List<ProductDetailpojo> getinfo(@PathParam("id") Integer id)
    {
//        try
//        {
        
     EntityManager em=getEntityManager();
     CriteriaBuilder cb=em.getCriteriaBuilder();
     CriteriaQuery cq=cb.createQuery(ProductDetailpojo.class);
     
     Root<Product> root_product=cq.from(Product.class);
      Root<Category> root_category=cq.from(Category.class);
       Root<Subcategory> root_subcategory=cq.from(Subcategory.class);
     cq.select(cb.construct(ProductDetailpojo.class, 
             root_product.get(Product_.productId),
             root_subcategory.get(Subcategory_.subcategoryName),
             root_product.get(Product_.productName),
                 root_product.get(Product_.productImage),
                 root_category.get(Category_.categoryName)
             ));
     
     Expression e1=cb.equal(root_product.get(Product_.subcategoryId), root_subcategory.get(Subcategory_.subcategoryId));
     
     Expression e2=cb.equal(root_category.get(Category_.categoryId), root_subcategory.get(Subcategory_.categoryId));
     
     Expression e3=cb.equal(root_product.get(Product_.subcategoryId), id);
     
       
     cq.where(cb.and(cb.and(e1,e2),e3));
    return em.createQuery(cq).getResultList();
    
    }
//        catch(Exception e)
//        {
//            return e+"";
//        }
       
      
    
    
    @GET
    @Path("getProdetails/{pid}")
    @Produces({"application/json"})
    public List<ProductDetails> getlsit(@PathParam("pid") Integer id){
        EntityManager em=getEntityManager();
        Query q=em.createQuery("SELECT a FROM ProductDetails a WHERE a.productId= :pid");
        q.setParameter("pid", id);
        List<ProductDetails> lst=q.getResultList();
        if(lst.size()>0){
            return lst;
        }
        else{
            return null;
        }
    }
    
    /*************************get cart *****************************************/
    @GET
    @Path("getCartProducts/{productIds}")
    @Produces({"application/json"})
    public List<cartProductPojo> getCartProducts(@PathParam("productIds") String ids){
        String[] id=ids.split(",");
        List<cartProductPojo> lst=new ArrayList<>();
        EntityManager em=getEntityManager();
            CriteriaBuilder cb=em.getCriteriaBuilder();
            CriteriaQuery cq=cb.createQuery(cartProductPojo.class);
//        for(int i=0;i<id.length;i++){
//            int product_id=Integer.parseInt(id[i]);
     
            Root<Product> root_product=cq.from(Product.class);
            Root<ProductDetails> productDetail=cq.from(ProductDetails.class);
            cq.select(cb.construct(cartProductPojo.class, 
                root_product.get(Product_.productId),
                root_product.get(Product_.productImage),
                root_product.get(Product_.productName),
                 productDetail.get(ProductDetails_.productDetailWt),
                 productDetail.get(ProductDetails_.productDetailQty),
                 productDetail.get(ProductDetails_.productDetailCost)
             ));
             Expression e1=cb.equal(productDetail.get(ProductDetails_.productId), root_product.get(Product_.productId));
             Expression e2=cb.equal(productDetail.get(ProductDetails_.productDetailId), id[0]);
     for(int i=1;i<id.length;i++){
            int product_id=Integer.parseInt(id[i]);
       
        Expression e3=cb.equal(productDetail.get(ProductDetails_.productDetailId), product_id);
        e2=cb.or(e3,e2);
     }
//     cb.and(e1,cb)
        cq.where(cb.and(e1,e2));
//        }
       return em.createQuery(cq).getResultList();
    }
}
