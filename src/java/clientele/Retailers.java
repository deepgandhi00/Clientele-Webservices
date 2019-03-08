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
@Table(name = "retailers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Retailers.findAll", query = "SELECT r FROM Retailers r"),
    @NamedQuery(name = "Retailers.findByRetailerId", query = "SELECT r FROM Retailers r WHERE r.retailerId = :retailerId"),
    @NamedQuery(name = "Retailers.findByRetailerName", query = "SELECT r FROM Retailers r WHERE r.retailerName = :retailerName"),
    @NamedQuery(name = "Retailers.findByAddId", query = "SELECT r FROM Retailers r WHERE r.addId = :addId"),
    @NamedQuery(name = "Retailers.findByRetailerTypeId", query = "SELECT r FROM Retailers r WHERE r.retailerTypeId = :retailerTypeId"),
    @NamedQuery(name = "Retailers.findByRetailerEmail", query = "SELECT r FROM Retailers r WHERE r.retailerEmail = :retailerEmail"),
    @NamedQuery(name = "Retailers.findByRetailerPwd", query = "SELECT r FROM Retailers r WHERE r.retailerPwd = :retailerPwd"),
    @NamedQuery(name = "Retailers.findByRetailerContact", query = "SELECT r FROM Retailers r WHERE r.retailerContact = :retailerContact"),
    @NamedQuery(name = "Retailers.findByRetailerPhoto", query = "SELECT r FROM Retailers r WHERE r.retailerPhoto = :retailerPhoto")})
public class Retailers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "retailer_id")
    private Integer retailerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "retailer_name")
    private String retailerName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "add_id")
    private int addId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "retailer_type_id")
    private int retailerTypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "retailer_email")
    private String retailerEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "retailer_pwd")
    private String retailerPwd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "retailer_contact")
    private String retailerContact;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "retailer_photo")
    private String retailerPhoto;

    public Retailers() {
    }

    public Retailers(Integer retailerId) {
        this.retailerId = retailerId;
    }

    public Retailers(Integer retailerId, String retailerName, int addId, int retailerTypeId, String retailerEmail, String retailerPwd, String retailerContact, String retailerPhoto) {
        this.retailerId = retailerId;
        this.retailerName = retailerName;
        this.addId = addId;
        this.retailerTypeId = retailerTypeId;
        this.retailerEmail = retailerEmail;
        this.retailerPwd = retailerPwd;
        this.retailerContact = retailerContact;
        this.retailerPhoto = retailerPhoto;
    }

    public Integer getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(Integer retailerId) {
        this.retailerId = retailerId;
    }

    public String getRetailerName() {
        return retailerName;
    }

    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public int getRetailerTypeId() {
        return retailerTypeId;
    }

    public void setRetailerTypeId(int retailerTypeId) {
        this.retailerTypeId = retailerTypeId;
    }

    public String getRetailerEmail() {
        return retailerEmail;
    }

    public void setRetailerEmail(String retailerEmail) {
        this.retailerEmail = retailerEmail;
    }

    public String getRetailerPwd() {
        return retailerPwd;
    }

    public void setRetailerPwd(String retailerPwd) {
        this.retailerPwd = retailerPwd;
    }

    public String getRetailerContact() {
        return retailerContact;
    }

    public void setRetailerContact(String retailerContact) {
        this.retailerContact = retailerContact;
    }

    public String getRetailerPhoto() {
        return retailerPhoto;
    }

    public void setRetailerPhoto(String retailerPhoto) {
        this.retailerPhoto = retailerPhoto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retailerId != null ? retailerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Retailers)) {
            return false;
        }
        Retailers other = (Retailers) object;
        if ((this.retailerId == null && other.retailerId != null) || (this.retailerId != null && !this.retailerId.equals(other.retailerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.Retailers[ retailerId=" + retailerId + " ]";
    }
    
}
