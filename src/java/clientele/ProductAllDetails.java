/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientele;

/**
 *
 * @author Royal
 */
public class ProductAllDetails {
    private int ProductDetailId;
    private String ProductDetailWt;
    private String ProductDetailQty;
    private String ProductDetailCost;
    
    public ProductAllDetails(){
        
    }
    public ProductAllDetails(int productDetailId,String ProductDetailWt,String ProductDetailQty,String ProductDetailCost){
        this.ProductDetailId=productDetailId;
        this.ProductDetailWt=ProductDetailWt;
        this.ProductDetailQty=ProductDetailQty;
        this.ProductDetailCost=ProductDetailCost;
    }

    /**
     * @return the ProductDetailId
     */
    public int getProductDetailId() {
        return ProductDetailId;
    }

    /**
     * @param ProductDetailId the ProductDetailId to set
     */
    public void setProductDetailId(int ProductDetailId) {
        this.ProductDetailId = ProductDetailId;
    }

    /**
     * @return the ProductDetailWt
     */
    public String getProductDetailWt() {
        return ProductDetailWt;
    }

    /**
     * @param ProductDetailWt the ProductDetailWt to set
     */
    public void setProductDetailWt(String ProductDetailWt) {
        this.ProductDetailWt = ProductDetailWt;
    }

    /**
     * @return the ProductDetailQty
     */
    public String getProductDetailQty() {
        return ProductDetailQty;
    }

    /**
     * @param ProductDetailQty the ProductDetailQty to set
     */
    public void setProductDetailQty(String ProductDetailQty) {
        this.ProductDetailQty = ProductDetailQty;
    }

    /**
     * @return the ProductDetailCost
     */
    public String getProductDetailCost() {
        return ProductDetailCost;
    }

    /**
     * @param ProductDetailCost the ProductDetailCost to set
     */
    public void setProductDetailCost(String ProductDetailCost) {
        this.ProductDetailCost = ProductDetailCost;
    }
    
    
    
}
