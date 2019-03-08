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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Royal
 */
@Entity
@Table(name = "address_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AddressDetail.findAll", query = "SELECT a FROM AddressDetail a"),
    @NamedQuery(name = "AddressDetail.findByAddId", query = "SELECT a FROM AddressDetail a WHERE a.addId = :addId"),
    @NamedQuery(name = "AddressDetail.findByShopNameOrHouseName", query = "SELECT a FROM AddressDetail a WHERE a.shopNameOrHouseName = :shopNameOrHouseName"),
    @NamedQuery(name = "AddressDetail.findByShopNoOrHouseNo", query = "SELECT a FROM AddressDetail a WHERE a.shopNoOrHouseNo = :shopNoOrHouseNo"),
    @NamedQuery(name = "AddressDetail.findByComplex", query = "SELECT a FROM AddressDetail a WHERE a.complex = :complex"),
    @NamedQuery(name = "AddressDetail.findByStreetName", query = "SELECT a FROM AddressDetail a WHERE a.streetName = :streetName"),
    @NamedQuery(name = "AddressDetail.findBySocietyName", query = "SELECT a FROM AddressDetail a WHERE a.societyName = :societyName"),
    @NamedQuery(name = "AddressDetail.findByRoad", query = "SELECT a FROM AddressDetail a WHERE a.road = :road"),
    @NamedQuery(name = "AddressDetail.findByLandmark", query = "SELECT a FROM AddressDetail a WHERE a.landmark = :landmark"),
    @NamedQuery(name = "AddressDetail.findByMallName", query = "SELECT a FROM AddressDetail a WHERE a.mallName = :mallName"),
    @NamedQuery(name = "AddressDetail.findByStreetNo", query = "SELECT a FROM AddressDetail a WHERE a.streetNo = :streetNo"),
    @NamedQuery(name = "AddressDetail.findBySocietyNo", query = "SELECT a FROM AddressDetail a WHERE a.societyNo = :societyNo")})
public class AddressDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "add_id")
    private Integer addId;
    @Size(max = 50)
    @Column(name = "shop_name_or_house_name")
    private String shopNameOrHouseName;
    @Column(name = "shop_no_or_house_no")
    private Integer shopNoOrHouseNo;
    @Size(max = 50)
    @Column(name = "complex")
    private String complex;
    @Size(max = 50)
    @Column(name = "street_name")
    private String streetName;
    @Size(max = 50)
    @Column(name = "society_name")
    private String societyName;
    @Size(max = 50)
    @Column(name = "road")
    private String road;
    @Size(max = 50)
    @Column(name = "landmark")
    private String landmark;
    @Size(max = 50)
    @Column(name = "mall_name")
    private String mallName;
    @Column(name = "street_no")
    private Integer streetNo;
    @Column(name = "society_no")
    private Integer societyNo;

    public AddressDetail() {
    }

    public AddressDetail(Integer addId) {
        this.addId = addId;
    }

    public Integer getAddId() {
        return addId;
    }

    public void setAddId(Integer addId) {
        this.addId = addId;
    }

    public String getShopNameOrHouseName() {
        return shopNameOrHouseName;
    }

    public void setShopNameOrHouseName(String shopNameOrHouseName) {
        this.shopNameOrHouseName = shopNameOrHouseName;
    }

    public Integer getShopNoOrHouseNo() {
        return shopNoOrHouseNo;
    }

    public void setShopNoOrHouseNo(Integer shopNoOrHouseNo) {
        this.shopNoOrHouseNo = shopNoOrHouseNo;
    }

    public String getComplex() {
        return complex;
    }

    public void setComplex(String complex) {
        this.complex = complex;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public Integer getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(Integer streetNo) {
        this.streetNo = streetNo;
    }

    public Integer getSocietyNo() {
        return societyNo;
    }

    public void setSocietyNo(Integer societyNo) {
        this.societyNo = societyNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addId != null ? addId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AddressDetail)) {
            return false;
        }
        AddressDetail other = (AddressDetail) object;
        if ((this.addId == null && other.addId != null) || (this.addId != null && !this.addId.equals(other.addId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.AddressDetail[ addId=" + addId + " ]";
    }
    
}
