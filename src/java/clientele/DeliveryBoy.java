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
@Table(name = "delivery_boy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DeliveryBoy.findAll", query = "SELECT d FROM DeliveryBoy d"),
    @NamedQuery(name = "DeliveryBoy.findByDeliveryBoyId", query = "SELECT d FROM DeliveryBoy d WHERE d.deliveryBoyId = :deliveryBoyId"),
    @NamedQuery(name = "DeliveryBoy.findByDeliveryBoyName", query = "SELECT d FROM DeliveryBoy d WHERE d.deliveryBoyName = :deliveryBoyName"),
    @NamedQuery(name = "DeliveryBoy.findByAddId", query = "SELECT d FROM DeliveryBoy d WHERE d.addId = :addId"),
    @NamedQuery(name = "DeliveryBoy.findByDeliveryBoyContact", query = "SELECT d FROM DeliveryBoy d WHERE d.deliveryBoyContact = :deliveryBoyContact"),
    @NamedQuery(name = "DeliveryBoy.findByDeliveryBoyEmail", query = "SELECT d FROM DeliveryBoy d WHERE d.deliveryBoyEmail = :deliveryBoyEmail"),
    @NamedQuery(name = "DeliveryBoy.findByDeliveryBoyPwd", query = "SELECT d FROM DeliveryBoy d WHERE d.deliveryBoyPwd = :deliveryBoyPwd"),
    @NamedQuery(name = "DeliveryBoy.findByDeliveryBoyPhoto", query = "SELECT d FROM DeliveryBoy d WHERE d.deliveryBoyPhoto = :deliveryBoyPhoto"),
    @NamedQuery(name = "DeliveryBoy.findByToken", query = "SELECT d FROM DeliveryBoy d WHERE d.token = :token"),
    @NamedQuery(name = "DeliveryBoy.findByActivated", query = "SELECT d FROM DeliveryBoy d WHERE d.activated = :activated")})
public class DeliveryBoy implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "delivery_boy_id")
    private Integer deliveryBoyId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "delivery_boy_name")
    private String deliveryBoyName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "add_id")
    private int addId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "delivery_boy_contact")
    private int deliveryBoyContact;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "delivery_boy_email")
    private String deliveryBoyEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "delivery_boy_pwd")
    private String deliveryBoyPwd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "delivery_boy_photo")
    private String deliveryBoyPhoto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "token")
    private String token;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activated")
    private int activated;

    public DeliveryBoy() {
    }

    public DeliveryBoy(Integer deliveryBoyId) {
        this.deliveryBoyId = deliveryBoyId;
    }

    public DeliveryBoy(Integer deliveryBoyId, String deliveryBoyName, int addId, int deliveryBoyContact, String deliveryBoyEmail, String deliveryBoyPwd, String deliveryBoyPhoto, String token, int activated) {
        this.deliveryBoyId = deliveryBoyId;
        this.deliveryBoyName = deliveryBoyName;
        this.addId = addId;
        this.deliveryBoyContact = deliveryBoyContact;
        this.deliveryBoyEmail = deliveryBoyEmail;
        this.deliveryBoyPwd = deliveryBoyPwd;
        this.deliveryBoyPhoto = deliveryBoyPhoto;
        this.token = token;
        this.activated = activated;
    }

    public Integer getDeliveryBoyId() {
        return deliveryBoyId;
    }

    public void setDeliveryBoyId(Integer deliveryBoyId) {
        this.deliveryBoyId = deliveryBoyId;
    }

    public String getDeliveryBoyName() {
        return deliveryBoyName;
    }

    public void setDeliveryBoyName(String deliveryBoyName) {
        this.deliveryBoyName = deliveryBoyName;
    }

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public int getDeliveryBoyContact() {
        return deliveryBoyContact;
    }

    public void setDeliveryBoyContact(int deliveryBoyContact) {
        this.deliveryBoyContact = deliveryBoyContact;
    }

    public String getDeliveryBoyEmail() {
        return deliveryBoyEmail;
    }

    public void setDeliveryBoyEmail(String deliveryBoyEmail) {
        this.deliveryBoyEmail = deliveryBoyEmail;
    }

    public String getDeliveryBoyPwd() {
        return deliveryBoyPwd;
    }

    public void setDeliveryBoyPwd(String deliveryBoyPwd) {
        this.deliveryBoyPwd = deliveryBoyPwd;
    }

    public String getDeliveryBoyPhoto() {
        return deliveryBoyPhoto;
    }

    public void setDeliveryBoyPhoto(String deliveryBoyPhoto) {
        this.deliveryBoyPhoto = deliveryBoyPhoto;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getActivated() {
        return activated;
    }

    public void setActivated(int activated) {
        this.activated = activated;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deliveryBoyId != null ? deliveryBoyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeliveryBoy)) {
            return false;
        }
        DeliveryBoy other = (DeliveryBoy) object;
        if ((this.deliveryBoyId == null && other.deliveryBoyId != null) || (this.deliveryBoyId != null && !this.deliveryBoyId.equals(other.deliveryBoyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.DeliveryBoy[ deliveryBoyId=" + deliveryBoyId + " ]";
    }
    
}
