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
@Table(name = "admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a"),
    @NamedQuery(name = "Admin.findByAdminId", query = "SELECT a FROM Admin a WHERE a.adminId = :adminId"),
    @NamedQuery(name = "Admin.findByAdminName", query = "SELECT a FROM Admin a WHERE a.adminName = :adminName"),
    @NamedQuery(name = "Admin.findByAdminPwd", query = "SELECT a FROM Admin a WHERE a.adminPwd = :adminPwd"),
    @NamedQuery(name = "Admin.findByAdminEmail", query = "SELECT a FROM Admin a WHERE a.adminEmail = :adminEmail"),
    @NamedQuery(name = "Admin.findByAdminContact", query = "SELECT a FROM Admin a WHERE a.adminContact = :adminContact"),
    @NamedQuery(name = "Admin.findByAddId", query = "SELECT a FROM Admin a WHERE a.addId = :addId"),
    @NamedQuery(name = "Admin.findByAdminPhoto", query = "SELECT a FROM Admin a WHERE a.adminPhoto = :adminPhoto"),
    @NamedQuery(name = "Admin.findByToken", query = "SELECT a FROM Admin a WHERE a.token = :token"),
    @NamedQuery(name = "Admin.findByActivated", query = "SELECT a FROM Admin a WHERE a.activated = :activated")})
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "admin_id")
    private Integer adminId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "admin_name")
    private String adminName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "admin_pwd")
    private String adminPwd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "admin_email")
    private String adminEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "admin_contact")
    private int adminContact;
    @Column(name = "add_id")
    private Integer addId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "admin_photo")
    private String adminPhoto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "token")
    private String token;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activated")
    private int activated;

    public Admin() {
    }

    public Admin(Integer adminId) {
        this.adminId = adminId;
    }

    public Admin(Integer adminId, String adminName, String adminPwd, String adminEmail, int adminContact, String adminPhoto, String token, int activated) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPwd = adminPwd;
        this.adminEmail = adminEmail;
        this.adminContact = adminContact;
        this.adminPhoto = adminPhoto;
        this.token = token;
        this.activated = activated;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public int getAdminContact() {
        return adminContact;
    }

    public void setAdminContact(int adminContact) {
        this.adminContact = adminContact;
    }

    public Integer getAddId() {
        return addId;
    }

    public void setAddId(Integer addId) {
        this.addId = addId;
    }

    public String getAdminPhoto() {
        return adminPhoto;
    }

    public void setAdminPhoto(String adminPhoto) {
        this.adminPhoto = adminPhoto;
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
        hash += (adminId != null ? adminId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.adminId == null && other.adminId != null) || (this.adminId != null && !this.adminId.equals(other.adminId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.Admin[ adminId=" + adminId + " ]";
    }
    
}
