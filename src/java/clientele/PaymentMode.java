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
@Table(name = "payment_mode")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaymentMode.findAll", query = "SELECT p FROM PaymentMode p"),
    @NamedQuery(name = "PaymentMode.findByPaymentModeId", query = "SELECT p FROM PaymentMode p WHERE p.paymentModeId = :paymentModeId"),
    @NamedQuery(name = "PaymentMode.findByMode", query = "SELECT p FROM PaymentMode p WHERE p.mode = :mode")})
public class PaymentMode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "payment_mode_id")
    private Integer paymentModeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "mode")
    private String mode;

    public PaymentMode() {
    }

    public PaymentMode(Integer paymentModeId) {
        this.paymentModeId = paymentModeId;
    }

    public PaymentMode(Integer paymentModeId, String mode) {
        this.paymentModeId = paymentModeId;
        this.mode = mode;
    }

    public Integer getPaymentModeId() {
        return paymentModeId;
    }

    public void setPaymentModeId(Integer paymentModeId) {
        this.paymentModeId = paymentModeId;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentModeId != null ? paymentModeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentMode)) {
            return false;
        }
        PaymentMode other = (PaymentMode) object;
        if ((this.paymentModeId == null && other.paymentModeId != null) || (this.paymentModeId != null && !this.paymentModeId.equals(other.paymentModeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.PaymentMode[ paymentModeId=" + paymentModeId + " ]";
    }
    
}
