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
@Table(name = "retailer_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RetailerType.findAll", query = "SELECT r FROM RetailerType r"),
    @NamedQuery(name = "RetailerType.findByRetailerTypeId", query = "SELECT r FROM RetailerType r WHERE r.retailerTypeId = :retailerTypeId"),
    @NamedQuery(name = "RetailerType.findByType", query = "SELECT r FROM RetailerType r WHERE r.type = :type")})
public class RetailerType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "retailer_type_id")
    private Integer retailerTypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "type")
    private String type;

    public RetailerType() {
    }

    public RetailerType(Integer retailerTypeId) {
        this.retailerTypeId = retailerTypeId;
    }

    public RetailerType(Integer retailerTypeId, String type) {
        this.retailerTypeId = retailerTypeId;
        this.type = type;
    }

    public Integer getRetailerTypeId() {
        return retailerTypeId;
    }

    public void setRetailerTypeId(Integer retailerTypeId) {
        this.retailerTypeId = retailerTypeId;
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
        hash += (retailerTypeId != null ? retailerTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetailerType)) {
            return false;
        }
        RetailerType other = (RetailerType) object;
        if ((this.retailerTypeId == null && other.retailerTypeId != null) || (this.retailerTypeId != null && !this.retailerTypeId.equals(other.retailerTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.RetailerType[ retailerTypeId=" + retailerTypeId + " ]";
    }
    
}
