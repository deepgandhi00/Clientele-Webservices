/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientele;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Royal
 */
@Entity
@Table(name = "product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findByProductId", query = "SELECT p FROM Product p WHERE p.productId = :productId"),
    @NamedQuery(name = "Product.findBySubcategoryId", query = "SELECT p FROM Product p WHERE p.subcategoryId = :subcategoryId"),
    @NamedQuery(name = "Product.findByProductName", query = "SELECT p FROM Product p WHERE p.productName = :productName"),
    @NamedQuery(name = "Product.findByProductIngredients", query = "SELECT p FROM Product p WHERE p.productIngredients = :productIngredients"),
    @NamedQuery(name = "Product.findByProductTypeId", query = "SELECT p FROM Product p WHERE p.productTypeId = :productTypeId"),
    @NamedQuery(name = "Product.findByProductDesc", query = "SELECT p FROM Product p WHERE p.productDesc = :productDesc"),
    @NamedQuery(name = "Product.findByProductHowToUse", query = "SELECT p FROM Product p WHERE p.productHowToUse = :productHowToUse"),
    @NamedQuery(name = "Product.findByProductImage", query = "SELECT p FROM Product p WHERE p.productImage = :productImage")})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_id")
    private Integer productId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subcategory_id")
    private int subcategoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "product_name")
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "product_ingredients")
    private String productIngredients;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_type_id")
    private int productTypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "product_desc")
    private String productDesc;
    @Size(max = 1000)
    @Column(name = "product_how_to_use")
    private String productHowToUse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "product_image")
    private String productImage;

    public Product() {
    }

    public Product(Integer productId) {
        this.productId = productId;
    }

    public Product(Integer productId, int subcategoryId, String productName, String productIngredients, int productTypeId, String productDesc, String productImage) {
        this.productId = productId;
        this.subcategoryId = subcategoryId;
        this.productName = productName;
        this.productIngredients = productIngredients;
        this.productTypeId = productTypeId;
        this.productDesc = productDesc;
        this.productImage = productImage;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public int getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(int subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductIngredients() {
        return productIngredients;
    }

    public void setProductIngredients(String productIngredients) {
        this.productIngredients = productIngredients;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductHowToUse() {
        return productHowToUse;
    }

    public void setProductHowToUse(String productHowToUse) {
        this.productHowToUse = productHowToUse;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.Product[ productId=" + productId + " ]";
    }
    
}
