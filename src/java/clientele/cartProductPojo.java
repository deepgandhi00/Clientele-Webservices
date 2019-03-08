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
public class cartProductPojo {
    private int ProductId;
    private String ProductImage;
    private String ProductName;
    private String ProductWt;
    private String ProductQty;
    private String ProductCost;
    
    public cartProductPojo(){
        
    }
    public cartProductPojo(int ProductId,String ProductImage,String ProductName,String ProductWt,String ProductQty,String ProductCost){
        this.ProductId=ProductId;
        this.ProductImage=ProductImage;
        this.ProductName=ProductName;
        this.ProductWt=ProductWt;
        this.ProductQty=ProductQty;
        this.ProductCost=ProductCost;
    }

    /**
     * @return the ProductImage
     */
    public String getProductImage() {
        return ProductImage;
    }
    

    /**
     * @param ProductImage the ProductImage to set
     */
    public void setProductImage(String ProductImage) {
        this.ProductImage = ProductImage;
    }

    /**
     * @return the ProductName
     */
    public String getProductName() {
        return ProductName;
    }

    /**
     * @param ProductName the ProductName to set
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * @return the ProductWt
     */
    public String getProductWt() {
        return ProductWt;
    }

    /**
     * @param ProductWt the ProductWt to set
     */
    public void setProductWt(String ProductWt) {
        this.ProductWt = ProductWt;
    }

    /**
     * @return the ProductQty
     */
    public String getProductQty() {
        return ProductQty;
    }

    /**
     * @param ProductQty the ProductQty to set
     */
    public void setProductQty(String ProductQty) {
        this.ProductQty = ProductQty;
    }

    /**
     * @return the ProductCost
     */
    public String getProductCost() {
        return ProductCost;
    }

    /**
     * @param ProductCost the ProductCost to set
     */
    public void setProductCost(String ProductCost) {
        this.ProductCost = ProductCost;
    }

    /**
     * @return the ProductId
     */
    public int getProductId() {
        return ProductId;
    }

    /**
     * @param ProductId the ProductId to set
     */
    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }
    
    
    
    
}
