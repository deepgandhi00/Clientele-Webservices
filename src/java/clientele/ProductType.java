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
@Table(name = "product_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductType.findAll", query = "SELECT p FROM ProductType p"),
    @NamedQuery(name = "ProductType.findByProductTypeId", query = "SELECT p FROM ProductType p WHERE p.productTypeId = :productTypeId"),
    @NamedQuery(name = "ProductType.findByType", query = "SELECT p FROM ProductType p WHERE p.type = :type")})
public class ProductType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_type_id")
    private Integer productTypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "type")
    private String type;

    public ProductType() {
    }

    public ProductType(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public ProductType(Integer productTypeId, String type) {
        this.productTypeId = productTypeId;
        this.type = type;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productTypeId != null ? productTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductType)) {
            return false;
        }
        ProductType other = (ProductType) object;
        if ((this.productTypeId == null && other.productTypeId != null) || (this.productTypeId != null && !this.productTypeId.equals(other.productTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.ProductType[ productTypeId=" + productTypeId + " ]";
    }
    
}
