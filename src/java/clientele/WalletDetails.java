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
@Table(name = "wallet_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WalletDetails.findAll", query = "SELECT w FROM WalletDetails w"),
    @NamedQuery(name = "WalletDetails.findByWalletId", query = "SELECT w FROM WalletDetails w WHERE w.walletId = :walletId"),
    @NamedQuery(name = "WalletDetails.findByPaymentModeId", query = "SELECT w FROM WalletDetails w WHERE w.paymentModeId = :paymentModeId"),
    @NamedQuery(name = "WalletDetails.findByWalletName", query = "SELECT w FROM WalletDetails w WHERE w.walletName = :walletName"),
    @NamedQuery(name = "WalletDetails.findByWalletLogo", query = "SELECT w FROM WalletDetails w WHERE w.walletLogo = :walletLogo")})
public class WalletDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "wallet_id")
    private Integer walletId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "payment_mode_id")
    private int paymentModeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "wallet_name")
    private String walletName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "wallet_logo")
    private String walletLogo;

    public WalletDetails() {
    }

    public WalletDetails(Integer walletId) {
        this.walletId = walletId;
    }

    public WalletDetails(Integer walletId, int paymentModeId, String walletName, String walletLogo) {
        this.walletId = walletId;
        this.paymentModeId = paymentModeId;
        this.walletName = walletName;
        this.walletLogo = walletLogo;
    }

    public Integer getWalletId() {
        return walletId;
    }

    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    public int getPaymentModeId() {
        return paymentModeId;
    }

    public void setPaymentModeId(int paymentModeId) {
        this.paymentModeId = paymentModeId;
    }

    public String getWalletName() {
        return walletName;
    }

    public void setWalletName(String walletName) {
        this.walletName = walletName;
    }

    public String getWalletLogo() {
        return walletLogo;
    }

    public void setWalletLogo(String walletLogo) {
        this.walletLogo = walletLogo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (walletId != null ? walletId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WalletDetails)) {
            return false;
        }
        WalletDetails other = (WalletDetails) object;
        if ((this.walletId == null && other.walletId != null) || (this.walletId != null && !this.walletId.equals(other.walletId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.WalletDetails[ walletId=" + walletId + " ]";
    }
    
}
