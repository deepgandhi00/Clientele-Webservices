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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Royal
 */
@Entity
@Table(name = "pincode")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pincode.findAll", query = "SELECT p FROM Pincode p"),
    @NamedQuery(name = "Pincode.findByPincodeId", query = "SELECT p FROM Pincode p WHERE p.pincodeId = :pincodeId"),
    @NamedQuery(name = "Pincode.findByPincode", query = "SELECT p FROM Pincode p WHERE p.pincode = :pincode"),
    @NamedQuery(name = "Pincode.findByCityId", query = "SELECT p FROM Pincode p WHERE p.cityId = :cityId")})
public class Pincode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pincode_id")
    private Integer pincodeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pincode")
    private int pincode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "city_id")
    private int cityId;

    public Pincode() {
    }

    public Pincode(Integer pincodeId) {
        this.pincodeId = pincodeId;
    }

    public Pincode(Integer pincodeId, int pincode, int cityId) {
        this.pincodeId = pincodeId;
        this.pincode = pincode;
        this.cityId = cityId;
    }

    public Integer getPincodeId() {
        return pincodeId;
    }

    public void setPincodeId(Integer pincodeId) {
        this.pincodeId = pincodeId;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pincodeId != null ? pincodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pincode)) {
            return false;
        }
        Pincode other = (Pincode) object;
        if ((this.pincodeId == null && other.pincodeId != null) || (this.pincodeId != null && !this.pincodeId.equals(other.pincodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.Pincode[ pincodeId=" + pincodeId + " ]";
    }
    
}
