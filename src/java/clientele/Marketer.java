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
@Table(name = "marketer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marketer.findAll", query = "SELECT m FROM Marketer m"),
    @NamedQuery(name = "Marketer.findByMarketorId", query = "SELECT m FROM Marketer m WHERE m.marketorId = :marketorId"),
    @NamedQuery(name = "Marketer.findByMarketorName", query = "SELECT m FROM Marketer m WHERE m.marketorName = :marketorName"),
    @NamedQuery(name = "Marketer.findByMarketorEmail", query = "SELECT m FROM Marketer m WHERE m.marketorEmail = :marketorEmail"),
    @NamedQuery(name = "Marketer.findByMarketorPwd", query = "SELECT m FROM Marketer m WHERE m.marketorPwd = :marketorPwd"),
    @NamedQuery(name = "Marketer.findByMarketorContact", query = "SELECT m FROM Marketer m WHERE m.marketorContact = :marketorContact"),
    @NamedQuery(name = "Marketer.findByAddId", query = "SELECT m FROM Marketer m WHERE m.addId = :addId"),
    @NamedQuery(name = "Marketer.findByMarketorImage", query = "SELECT m FROM Marketer m WHERE m.marketorImage = :marketorImage"),
    @NamedQuery(name = "Marketer.findByToken", query = "SELECT m FROM Marketer m WHERE m.token = :token"),
    @NamedQuery(name = "Marketer.findByActivateed", query = "SELECT m FROM Marketer m WHERE m.activateed = :activateed")})
public class Marketer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "marketor_id")
    private Integer marketorId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "marketor_name")
    private String marketorName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "marketor_email")
    private String marketorEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "marketor_pwd")
    private String marketorPwd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "marketor_contact")
    private int marketorContact;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "add_id")
    private String addId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "marketor_image")
    private String marketorImage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "token")
    private String token;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activateed")
    private int activateed;

    public Marketer() {
    }

    public Marketer(Integer marketorId) {
        this.marketorId = marketorId;
    }

    public Marketer(Integer marketorId, String marketorName, String marketorEmail, String marketorPwd, int marketorContact, String addId, String marketorImage, String token, int activateed) {
        this.marketorId = marketorId;
        this.marketorName = marketorName;
        this.marketorEmail = marketorEmail;
        this.marketorPwd = marketorPwd;
        this.marketorContact = marketorContact;
        this.addId = addId;
        this.marketorImage = marketorImage;
        this.token = token;
        this.activateed = activateed;
    }

    public Integer getMarketorId() {
        return marketorId;
    }

    public void setMarketorId(Integer marketorId) {
        this.marketorId = marketorId;
    }

    public String getMarketorName() {
        return marketorName;
    }

    public void setMarketorName(String marketorName) {
        this.marketorName = marketorName;
    }

    public String getMarketorEmail() {
        return marketorEmail;
    }

    public void setMarketorEmail(String marketorEmail) {
        this.marketorEmail = marketorEmail;
    }

    public String getMarketorPwd() {
        return marketorPwd;
    }

    public void setMarketorPwd(String marketorPwd) {
        this.marketorPwd = marketorPwd;
    }

    public int getMarketorContact() {
        return marketorContact;
    }

    public void setMarketorContact(int marketorContact) {
        this.marketorContact = marketorContact;
    }

    public String getAddId() {
        return addId;
    }

    public void setAddId(String addId) {
        this.addId = addId;
    }

    public String getMarketorImage() {
        return marketorImage;
    }

    public void setMarketorImage(String marketorImage) {
        this.marketorImage = marketorImage;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getActivateed() {
        return activateed;
    }

    public void setActivateed(int activateed) {
        this.activateed = activateed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marketorId != null ? marketorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marketer)) {
            return false;
        }
        Marketer other = (Marketer) object;
        if ((this.marketorId == null && other.marketorId != null) || (this.marketorId != null && !this.marketorId.equals(other.marketorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.Marketer[ marketorId=" + marketorId + " ]";
    }
    
}
