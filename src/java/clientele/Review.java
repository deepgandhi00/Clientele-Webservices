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
@Table(name = "review")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Review.findAll", query = "SELECT r FROM Review r"),
    @NamedQuery(name = "Review.findByRetailerId", query = "SELECT r FROM Review r WHERE r.retailerId = :retailerId"),
    @NamedQuery(name = "Review.findByProductId", query = "SELECT r FROM Review r WHERE r.productId = :productId"),
    @NamedQuery(name = "Review.findByReview", query = "SELECT r FROM Review r WHERE r.review = :review"),
    @NamedQuery(name = "Review.findByRating", query = "SELECT r FROM Review r WHERE r.rating = :rating")})
public class Review implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "retailer_id")
    private Integer retailerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "review")
    private String review;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rating")
    private int rating;

    public Review() {
    }

    public Review(Integer retailerId) {
        this.retailerId = retailerId;
    }

    public Review(Integer retailerId, int productId, String review, int rating) {
        this.retailerId = retailerId;
        this.productId = productId;
        this.review = review;
        this.rating = rating;
    }

    public Integer getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(Integer retailerId) {
        this.retailerId = retailerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retailerId != null ? retailerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Review)) {
            return false;
        }
        Review other = (Review) object;
        if ((this.retailerId == null && other.retailerId != null) || (this.retailerId != null && !this.retailerId.equals(other.retailerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientele.Review[ retailerId=" + retailerId + " ]";
    }
    
}
