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
@Table(name = "product_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductDetails.findAll", query = "SELECT p FROM ProductDetails p"),
    @NamedQuery(name = "ProductDetails.findByProductDetailId", query = "SELECT p FROM ProductDetails p WHERE p.productDetailId = :productDetailId"),
    @NamedQuery(name = "ProductDetails.findByProductId", query = "SELECT p FROM ProductDetails p WHERE p.productId = :productId"),
    @NamedQuery(name = "ProductDetails.findByProductDetailQty", query = "SELECT p FROM ProductDetails p WHERE p.productDetailQty = :productDetailQty"),
    @NamedQuery(name = "ProductDetails.findByProductDetailWt", query = "SELECT p FROM ProductDetails p WHERE p.productDetailWt = :productDetailWt"),
    @NamedQuery(name = "ProductDetails.findByProductDetailCost", query = "SELECT p FROM ProductDetails p WHERE p.productDetailCost = :productDetailCost")})
public class ProductDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_detail_id")
    private Integer productDetailId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Size(max = 50)
    @Column(name = "product_detail_qty")
    private String productDetailQty;
    @Size(max = 50)
    @Column(name = "product_detail_wt")
    private String productDetailWt;
    @Size(max = 50)
    @Column(name = "product_detail_cost")
    private String productDetailCost;

    public ProductDetails() {
    }

    public ProductDetails(Integer productDetailId) {
        this.productDetailId = productDetailId;
    }

    public ProductDetails(Integer productDetailId, int productId) {
        this.productDetailId = productDetailId;
        this.productId = productId;
    }

    public Integer getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(Integer productDetailId) {
        this.productDetailId = productDetailId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductDetailQty() {
        return productDetailQty;
    }

    public void setProductDetailQty(String productDetailQty) {
        this.productDetailQty = productDetailQty;
    }

    public String getProductDetailWt() {
        return productDetailWt;
    }

    public void setProductDetailWt(String productDetailWt) {
        this.productDetailWt = productDetailWt;
    }

    public String getProductDetailCost() {
        return productDetailCost;
    }

    public void setProductDetailCost(String productDetailCost) {
        this.productDetailCost = productDetailCost;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productDetailId != null ? productDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductDetails)) {
            return false;
        }
        ProductDetails other = (ProductDetails) object;
        if ((this.productDetailId == null && other.productDetailId != null) || (this.productDetailId != null && !this.productDetailId.equals(other.productDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.ProductDetails[ productDetailId=" + productDetailId + " ]";
    }
    
}
