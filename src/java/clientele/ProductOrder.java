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
@Table(name = "product_order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductOrder.findAll", query = "SELECT p FROM ProductOrder p"),
    @NamedQuery(name = "ProductOrder.findByOrderId", query = "SELECT p FROM ProductOrder p WHERE p.orderId = :orderId"),
    @NamedQuery(name = "ProductOrder.findByRetailerId", query = "SELECT p FROM ProductOrder p WHERE p.retailerId = :retailerId"),
    @NamedQuery(name = "ProductOrder.findByDate", query = "SELECT p FROM ProductOrder p WHERE p.date = :date"),
    @NamedQuery(name = "ProductOrder.findByTime", query = "SELECT p FROM ProductOrder p WHERE p.time = :time"),
    @NamedQuery(name = "ProductOrder.findByStatus", query = "SELECT p FROM ProductOrder p WHERE p.status = :status"),
    @NamedQuery(name = "ProductOrder.findByPaymentModeId", query = "SELECT p FROM ProductOrder p WHERE p.paymentModeId = :paymentModeId"),
    @NamedQuery(name = "ProductOrder.findByDeliveryBoyId", query = "SELECT p FROM ProductOrder p WHERE p.deliveryBoyId = :deliveryBoyId")})
public class ProductOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_id")
    private Integer orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "retailer_id")
    private int retailerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "time")
    @Temporal(TemporalType.TIME)
    private Date time;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "payment_mode_id")
    private int paymentModeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "delivery_boy_id")
    private int deliveryBoyId;

    public ProductOrder() {
    }

    public ProductOrder(Integer orderId) {
        this.orderId = orderId;
    }

    public ProductOrder(Integer orderId, int retailerId, Date date, Date time, String status, int paymentModeId, int deliveryBoyId) {
        this.orderId = orderId;
        this.retailerId = retailerId;
        this.date = date;
        this.time = time;
        this.status = status;
        this.paymentModeId = paymentModeId;
        this.deliveryBoyId = deliveryBoyId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public int getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(int retailerId) {
        this.retailerId = retailerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPaymentModeId() {
        return paymentModeId;
    }

    public void setPaymentModeId(int paymentModeId) {
        this.paymentModeId = paymentModeId;
    }

    public int getDeliveryBoyId() {
        return deliveryBoyId;
    }

    public void setDeliveryBoyId(int deliveryBoyId) {
        this.deliveryBoyId = deliveryBoyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOrder)) {
            return false;
        }
        ProductOrder other = (ProductOrder) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.ProductOrder[ orderId=" + orderId + " ]";
    }
    
}
