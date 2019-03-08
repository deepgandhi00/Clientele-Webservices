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
@Table(name = "order_payment_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderPaymentInfo.findAll", query = "SELECT o FROM OrderPaymentInfo o"),
    @NamedQuery(name = "OrderPaymentInfo.findByOrdrerPaymentInfoId", query = "SELECT o FROM OrderPaymentInfo o WHERE o.ordrerPaymentInfoId = :ordrerPaymentInfoId"),
    @NamedQuery(name = "OrderPaymentInfo.findByOrderId", query = "SELECT o FROM OrderPaymentInfo o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OrderPaymentInfo.findByOrderCod", query = "SELECT o FROM OrderPaymentInfo o WHERE o.orderCod = :orderCod"),
    @NamedQuery(name = "OrderPaymentInfo.findByDebitCardId", query = "SELECT o FROM OrderPaymentInfo o WHERE o.debitCardId = :debitCardId"),
    @NamedQuery(name = "OrderPaymentInfo.findByCreditCardId", query = "SELECT o FROM OrderPaymentInfo o WHERE o.creditCardId = :creditCardId"),
    @NamedQuery(name = "OrderPaymentInfo.findByNetBankId", query = "SELECT o FROM OrderPaymentInfo o WHERE o.netBankId = :netBankId"),
    @NamedQuery(name = "OrderPaymentInfo.findByWalletId", query = "SELECT o FROM OrderPaymentInfo o WHERE o.walletId = :walletId")})
public class OrderPaymentInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ordrer_payment_info_id")
    private Integer ordrerPaymentInfoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "order_cod")
    private Boolean orderCod;
    @Column(name = "debit_card_id")
    private Integer debitCardId;
    @Column(name = "credit_card_id")
    private Integer creditCardId;
    @Column(name = "net_bank_id")
    private Integer netBankId;
    @Column(name = "wallet_id")
    private Integer walletId;

    public OrderPaymentInfo() {
    }

    public OrderPaymentInfo(Integer ordrerPaymentInfoId) {
        this.ordrerPaymentInfoId = ordrerPaymentInfoId;
    }

    public OrderPaymentInfo(Integer ordrerPaymentInfoId, int orderId) {
        this.ordrerPaymentInfoId = ordrerPaymentInfoId;
        this.orderId = orderId;
    }

    public Integer getOrdrerPaymentInfoId() {
        return ordrerPaymentInfoId;
    }

    public void setOrdrerPaymentInfoId(Integer ordrerPaymentInfoId) {
        this.ordrerPaymentInfoId = ordrerPaymentInfoId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Boolean getOrderCod() {
        return orderCod;
    }

    public void setOrderCod(Boolean orderCod) {
        this.orderCod = orderCod;
    }

    public Integer getDebitCardId() {
        return debitCardId;
    }

    public void setDebitCardId(Integer debitCardId) {
        this.debitCardId = debitCardId;
    }

    public Integer getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(Integer creditCardId) {
        this.creditCardId = creditCardId;
    }

    public Integer getNetBankId() {
        return netBankId;
    }

    public void setNetBankId(Integer netBankId) {
        this.netBankId = netBankId;
    }

    public Integer getWalletId() {
        return walletId;
    }

    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordrerPaymentInfoId != null ? ordrerPaymentInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderPaymentInfo)) {
            return false;
        }
        OrderPaymentInfo other = (OrderPaymentInfo) object;
        if ((this.ordrerPaymentInfoId == null && other.ordrerPaymentInfoId != null) || (this.ordrerPaymentInfoId != null && !this.ordrerPaymentInfoId.equals(other.ordrerPaymentInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.OrderPaymentInfo[ ordrerPaymentInfoId=" + ordrerPaymentInfoId + " ]";
    }
    
}
