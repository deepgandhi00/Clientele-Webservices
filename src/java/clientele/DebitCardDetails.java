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
@Table(name = "debit_card_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DebitCardDetails.findAll", query = "SELECT d FROM DebitCardDetails d"),
    @NamedQuery(name = "DebitCardDetails.findByDebitCardId", query = "SELECT d FROM DebitCardDetails d WHERE d.debitCardId = :debitCardId"),
    @NamedQuery(name = "DebitCardDetails.findByCardType", query = "SELECT d FROM DebitCardDetails d WHERE d.cardType = :cardType"),
    @NamedQuery(name = "DebitCardDetails.findByBankId", query = "SELECT d FROM DebitCardDetails d WHERE d.bankId = :bankId")})
public class DebitCardDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "debit_card_id")
    private Integer debitCardId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "card_type")
    private String cardType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bank_id")
    private int bankId;

    public DebitCardDetails() {
    }

    public DebitCardDetails(Integer debitCardId) {
        this.debitCardId = debitCardId;
    }

    public DebitCardDetails(Integer debitCardId, String cardType, int bankId) {
        this.debitCardId = debitCardId;
        this.cardType = cardType;
        this.bankId = bankId;
    }

    public Integer getDebitCardId() {
        return debitCardId;
    }

    public void setDebitCardId(Integer debitCardId) {
        this.debitCardId = debitCardId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (debitCardId != null ? debitCardId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DebitCardDetails)) {
            return false;
        }
        DebitCardDetails other = (DebitCardDetails) object;
        if ((this.debitCardId == null && other.debitCardId != null) || (this.debitCardId != null && !this.debitCardId.equals(other.debitCardId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.DebitCardDetails[ debitCardId=" + debitCardId + " ]";
    }
    
}
