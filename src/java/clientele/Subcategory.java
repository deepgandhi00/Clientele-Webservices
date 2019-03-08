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
@Table(name = "subcategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subcategory.findAll", query = "SELECT s FROM Subcategory s"),
    @NamedQuery(name = "Subcategory.findBySubcategoryId", query = "SELECT s FROM Subcategory s WHERE s.subcategoryId = :subcategoryId"),
    @NamedQuery(name = "Subcategory.findBySubcategoryName", query = "SELECT s FROM Subcategory s WHERE s.subcategoryName = :subcategoryName"),
    @NamedQuery(name = "Subcategory.findByCategoryId", query = "SELECT s FROM Subcategory s WHERE s.categoryId = :categoryId"),
    @NamedQuery(name = "Subcategory.findBySubcategoryImage", query = "SELECT s FROM Subcategory s WHERE s.subcategoryImage = :subcategoryImage"),
    @NamedQuery(name = "Subcategory.findBySubcategoryDesc", query = "SELECT s FROM Subcategory s WHERE s.subcategoryDesc = :subcategoryDesc")})
public class Subcategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "subcategory_id")
    private Integer subcategoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "subcategory_name")
    private String subcategoryName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "category_id")
    private int categoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "subcategory_image")
    private String subcategoryImage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "subcategory_desc")
    private String subcategoryDesc;

    public Subcategory() {
    }

    public Subcategory(Integer subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public Subcategory(Integer subcategoryId, String subcategoryName, int categoryId, String subcategoryImage, String subcategoryDesc) {
        this.subcategoryId = subcategoryId;
        this.subcategoryName = subcategoryName;
        this.categoryId = categoryId;
        this.subcategoryImage = subcategoryImage;
        this.subcategoryDesc = subcategoryDesc;
    }

    public Integer getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Integer subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getSubcategoryName() {
        return subcategoryName;
    }

    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getSubcategoryImage() {
        return subcategoryImage;
    }

    public void setSubcategoryImage(String subcategoryImage) {
        this.subcategoryImage = subcategoryImage;
    }

    public String getSubcategoryDesc() {
        return subcategoryDesc;
    }

    public void setSubcategoryDesc(String subcategoryDesc) {
        this.subcategoryDesc = subcategoryDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subcategoryId != null ? subcategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subcategory)) {
            return false;
        }
        Subcategory other = (Subcategory) object;
        if ((this.subcategoryId == null && other.subcategoryId != null) || (this.subcategoryId != null && !this.subcategoryId.equals(other.subcategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.Subcategory[ subcategoryId=" + subcategoryId + " ]";
    }
    
}
