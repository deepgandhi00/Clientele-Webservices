/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientele;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Royal
 */
@Entity
@Table(name = "saved_card_payment_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SavedCardPaymentDetails.findAll", query = "SELECT s FROM SavedCardPaymentDetails s"),
    @NamedQuery(name = "SavedCardPaymentDetails.findBySavedCardPaymentDetailsId", query = "SELECT s FROM SavedCardPaymentDetails s WHERE s.savedCardPaymentDetailsId = :savedCardPaymentDetailsId"),
    @NamedQuery(name = "SavedCardPaymentDetails.findByBankHolderName", query = "SELECT s FROM SavedCardPaymentDetails s WHERE s.bankHolderName = :bankHolderName"),
    @NamedQuery(name = "SavedCardPaymentDetails.findByBankNumber", query = "SELECT s FROM SavedCardPaymentDetails s WHERE s.bankNumber = :bankNumber"),
    @NamedQuery(name = "SavedCardPaymentDetails.findByExpiryYear", query = "SELECT s FROM SavedCardPaymentDetails s WHERE s.expiryYear = :expiryYear"),
    @NamedQuery(name = "SavedCardPaymentDetails.findByExpiryMonth", query = "SELECT s FROM SavedCardPaymentDetails s WHERE s.expiryMonth = :expiryMonth"),
    @NamedQuery(name = "SavedCardPaymentDetails.findByBankId", query = "SELECT s FROM SavedCardPaymentDetails s WHERE s.bankId = :bankId")})
public class SavedCardPaymentDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "saved_card_payment_details_id")
    private Integer savedCardPaymentDetailsId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "bank_holder_name")
    private String bankHolderName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "bank_number")
    private String bankNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "expiry_year")
    @Temporal(TemporalType.DATE)
    private Date expiryYear;
    @Basic(optional = false)
    @NotNull
    @Column(name = "expiry_month")
    @Temporal(TemporalType.DATE)
    private Date expiryMonth;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bank_id")
    private int bankId;

    public SavedCardPaymentDetails() {
    }

    public SavedCardPaymentDetails(Integer savedCardPaymentDetailsId) {
        this.savedCardPaymentDetailsId = savedCardPaymentDetailsId;
    }

    public SavedCardPaymentDetails(Integer savedCardPaymentDetailsId, String bankHolderName, String bankNumber, Date expiryYear, Date expiryMonth, int bankId) {
        this.savedCardPaymentDetailsId = savedCardPaymentDetailsId;
        this.bankHolderName = bankHolderName;
        this.bankNumber = bankNumber;
        this.expiryYear = expiryYear;
        this.expiryMonth = expiryMonth;
        this.bankId = bankId;
    }

    public Integer getSavedCardPaymentDetailsId() {
        return savedCardPaymentDetailsId;
    }

    public void setSavedCardPaymentDetailsId(Integer savedCardPaymentDetailsId) {
        this.savedCardPaymentDetailsId = savedCardPaymentDetailsId;
    }

    public String getBankHolderName() {
        return bankHolderName;
    }

    public void setBankHolderName(String bankHolderName) {
        this.bankHolderName = bankHolderName;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public Date getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(Date expiryYear) {
        this.expiryYear = expiryYear;
    }

    public Date getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(Date expiryMonth) {
        this.expiryMonth = expiryMonth;
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
        hash += (savedCardPaymentDetailsId != null ? savedCardPaymentDetailsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SavedCardPaymentDetails)) {
            return false;
        }
        SavedCardPaymentDetails other = (SavedCardPaymentDetails) object;
        if ((this.savedCardPaymentDetailsId == null && other.savedCardPaymentDetailsId != null) || (this.savedCardPaymentDetailsId != null && !this.savedCardPaymentDetailsId.equals(other.savedCardPaymentDetailsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.SavedCardPaymentDetails[ savedCardPaymentDetailsId=" + savedCardPaymentDetailsId + " ]";
    }
    
}
