package com.lawcase.app.model;

import javax.persistence.*;

@Entity
@Table(name = "plan")
public class Plans {

    private Integer id;
    private String planName;
    private String price;
    private String services;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "plan_name")
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Column(name = "service")
    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }
}
