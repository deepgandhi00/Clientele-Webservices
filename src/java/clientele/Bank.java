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
@Table(name = "bank")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bank.findAll", query = "SELECT b FROM Bank b"),
    @NamedQuery(name = "Bank.findByBankId", query = "SELECT b FROM Bank b WHERE b.bankId = :bankId"),
    @NamedQuery(name = "Bank.findByBankName", query = "SELECT b FROM Bank b WHERE b.bankName = :bankName"),
    @NamedQuery(name = "Bank.findByBankLogo", query = "SELECT b FROM Bank b WHERE b.bankLogo = :bankLogo"),
    @NamedQuery(name = "Bank.findByIsNetBanking", query = "SELECT b FROM Bank b WHERE b.isNetBanking = :isNetBanking"),
    @NamedQuery(name = "Bank.findByIsCreditCard", query = "SELECT b FROM Bank b WHERE b.isCreditCard = :isCreditCard"),
    @NamedQuery(name = "Bank.findByIsDebitCard", query = "SELECT b FROM Bank b WHERE b.isDebitCard = :isDebitCard")})
public class Bank implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bank_id")
    private Integer bankId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "bank_name")
    private String bankName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "bank_logo")
    private String bankLogo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_net_banking")
    private boolean isNetBanking;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_credit_card")
    private boolean isCreditCard;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_debit_card")
    private boolean isDebitCard;

    public Bank() {
    }

    public Bank(Integer bankId) {
        this.bankId = bankId;
    }

    public Bank(Integer bankId, String bankName, String bankLogo, boolean isNetBanking, boolean isCreditCard, boolean isDebitCard) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.bankLogo = bankLogo;
        this.isNetBanking = isNetBanking;
        this.isCreditCard = isCreditCard;
        this.isDebitCard = isDebitCard;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankLogo() {
        return bankLogo;
    }

    public void setBankLogo(String bankLogo) {
        this.bankLogo = bankLogo;
    }

    public boolean getIsNetBanking() {
        return isNetBanking;
    }

    public void setIsNetBanking(boolean isNetBanking) {
        this.isNetBanking = isNetBanking;
    }

    public boolean getIsCreditCard() {
        return isCreditCard;
    }

    public void setIsCreditCard(boolean isCreditCard) {
        this.isCreditCard = isCreditCard;
    }

    public boolean getIsDebitCard() {
        return isDebitCard;
    }

    public void setIsDebitCard(boolean isDebitCard) {
        this.isDebitCard = isDebitCard;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bankId != null ? bankId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bank)) {
            return false;
        }
        Bank other = (Bank) object;
        if ((this.bankId == null && other.bankId != null) || (this.bankId != null && !this.bankId.equals(other.bankId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.Bank[ bankId=" + bankId + " ]";
    }
    
}
