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
@Table(name = "credit_card_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CreditCardDetails.findAll", query = "SELECT c FROM CreditCardDetails c"),
    @NamedQuery(name = "CreditCardDetails.findByCreditCardId", query = "SELECT c FROM CreditCardDetails c WHERE c.creditCardId = :creditCardId"),
    @NamedQuery(name = "CreditCardDetails.findByPaymentModeId", query = "SELECT c FROM CreditCardDetails c WHERE c.paymentModeId = :paymentModeId"),
    @NamedQuery(name = "CreditCardDetails.findByCreditCardType", query = "SELECT c FROM CreditCardDetails c WHERE c.creditCardType = :creditCardType"),
    @NamedQuery(name = "CreditCardDetails.findByBankId", query = "SELECT c FROM CreditCardDetails c WHERE c.bankId = :bankId"),
    @NamedQuery(name = "CreditCardDetails.findByCreditLogo", query = "SELECT c FROM CreditCardDetails c WHERE c.creditLogo = :creditLogo")})
public class CreditCardDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "credit_card_id")
    private Integer creditCardId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "payment_mode_id")
    private int paymentModeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "credit_card_type")
    private String creditCardType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bank_id")
    private int bankId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "credit_logo")
    private String creditLogo;

    public CreditCardDetails() {
    }

    public CreditCardDetails(Integer creditCardId) {
        this.creditCardId = creditCardId;
    }

    public CreditCardDetails(Integer creditCardId, int paymentModeId, String creditCardType, int bankId, String creditLogo) {
        this.creditCardId = creditCardId;
        this.paymentModeId = paymentModeId;
        this.creditCardType = creditCardType;
        this.bankId = bankId;
        this.creditLogo = creditLogo;
    }

    public Integer getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(Integer creditCardId) {
        this.creditCardId = creditCardId;
    }

    public int getPaymentModeId() {
        return paymentModeId;
    }

    public void setPaymentModeId(int paymentModeId) {
        this.paymentModeId = paymentModeId;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getCreditLogo() {
        return creditLogo;
    }

    public void setCreditLogo(String creditLogo) {
        this.creditLogo = creditLogo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (creditCardId != null ? creditCardId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditCardDetails)) {
            return false;
        }
        CreditCardDetails other = (CreditCardDetails) object;
        if ((this.creditCardId == null && other.creditCardId != null) || (this.creditCardId != null && !this.creditCardId.equals(other.creditCardId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.CreditCardDetails[ creditCardId=" + creditCardId + " ]";
    }
    
}
