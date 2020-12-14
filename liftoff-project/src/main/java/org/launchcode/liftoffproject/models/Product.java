package org.launchcode.liftoffproject.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Product extends AbstractEntity {



    @Size(max = 500, message = "Product description must not exceed 500 characters.")
    private String description;
    private String photo;
    private boolean organic;

    @ManyToOne
    private Vendor vendor;

    public Product(String description, boolean organic, String photo) {
        super();

        this.description = description;
        this.photo = photo;
        if (organic) this.organic = true;
        else {
            this.organic = false;
        }
    }

    public Product() {}


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }

    public Vendor getVendor() {
        return vendor;
    }

}
