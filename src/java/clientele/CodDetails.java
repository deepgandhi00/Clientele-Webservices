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
@Table(name = "cod_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CodDetails.findAll", query = "SELECT c FROM CodDetails c"),
    @NamedQuery(name = "CodDetails.findByCodId", query = "SELECT c FROM CodDetails c WHERE c.codId = :codId"),
    @NamedQuery(name = "CodDetails.findByPaymentModeId", query = "SELECT c FROM CodDetails c WHERE c.paymentModeId = :paymentModeId"),
    @NamedQuery(name = "CodDetails.findByCodPincode", query = "SELECT c FROM CodDetails c WHERE c.codPincode = :codPincode")})
public class CodDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_id")
    private Integer codId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "payment_mode_id")
    private int paymentModeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_pincode")
    private int codPincode;

    public CodDetails() {
    }

    public CodDetails(Integer codId) {
        this.codId = codId;
    }

    public CodDetails(Integer codId, int paymentModeId, int codPincode) {
        this.codId = codId;
        this.paymentModeId = paymentModeId;
        this.codPincode = codPincode;
    }

    public Integer getCodId() {
        return codId;
    }

    public void setCodId(Integer codId) {
        this.codId = codId;
    }

    public int getPaymentModeId() {
        return paymentModeId;
    }

    public void setPaymentModeId(int paymentModeId) {
        this.paymentModeId = paymentModeId;
    }

    public int getCodPincode() {
        return codPincode;
    }

    public void setCodPincode(int codPincode) {
        this.codPincode = codPincode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codId != null ? codId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CodDetails)) {
            return false;
        }
        CodDetails other = (CodDetails) object;
        if ((this.codId == null && other.codId != null) || (this.codId != null && !this.codId.equals(other.codId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.CodDetails[ codId=" + codId + " ]";
    }
    
}
