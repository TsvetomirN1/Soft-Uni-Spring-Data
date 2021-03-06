package softuni.exam.models.entities;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity {

    private BigDecimal price;
    private String description;
    private Boolean hasGoldStatus;
    private LocalDateTime addedOn;

   private Car car;
   private Seller seller;
   private List<Picture> pictures;

    public Offer() {
    }


    @Column(name = "price")
    @DecimalMin(value = "0")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column(name = "description",columnDefinition = "TEXT")
    @Length(min = 5)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "has_gold_status")
    public Boolean getHasGoldStatus() {
        return hasGoldStatus;
    }

    public void setHasGoldStatus(Boolean hasGoldStatus) {
        this.hasGoldStatus = hasGoldStatus;
    }

    @Column(name = "added_on")
    public LocalDateTime getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(LocalDateTime addedOn) {
        this.addedOn = addedOn;
    }

    @ManyToMany
    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    @ManyToOne
    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @ManyToOne
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
