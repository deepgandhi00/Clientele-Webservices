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


public class ProductDetailpojo {
    private int product_Id;
    private String subcategory_Name;
    private String product_Name;
    private String product_Image;
    private String category_Name;
//    
    public ProductDetailpojo(int product_Id,String subcategory_Name,String product_Name,String product_Image,String category_Name){
        this.product_Id=product_Id;
        this.subcategory_Name=subcategory_Name;
        this.product_Name=product_Name;
        this.product_Image=product_Image;
        this.category_Name=category_Name;
    }
    public ProductDetailpojo(){
        
    }

    /**
     * @return the product_Id
     */
    public int getProduct_Id() {
        return product_Id;
    }

    /**
     * @param product_Id the product_Id to set
     */
    public void setProduct_Id(int product_Id) {
        this.product_Id = product_Id;
    }

    /**
     * @return the subcategory_Name
     */
    public String getSubcategory_Name() {
        return subcategory_Name;
    }

    /**
     * @param subcategory_Name the subcategory_Name to set
     */
    public void setSubcategory_Name(String subcategory_Name) {
        this.subcategory_Name = subcategory_Name;
    }

    /**
     * @return the product_Name
     */
    public String getProduct_Name() {
        return product_Name;
    }

    /**
     * @param product_Name the product_Name to set
     */
    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    /**
     * @return the product_Image
     */
    public String getProduct_Image() {
        return product_Image;
    }

    /**
     * @param product_Image the product_Image to set
     */
    public void setProduct_Image(String product_Image) {
        this.product_Image = product_Image;
    }

    /**
     * @return the category_Name
     */
    public String getCategory_Name() {
        return category_Name;
    }

    /**
     * @param category_Name the category_Name to set
     */
    public void setCategory_Name(String category_Name) {
        this.category_Name = category_Name;
    }
    
    
    
}
