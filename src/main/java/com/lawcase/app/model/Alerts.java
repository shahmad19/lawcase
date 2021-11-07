package com.lawcase.app.model;

import javax.persistence.*;

@Entity
@Table(name = "alert")
public class Alerts {
    private Integer id;
    private int value;
    private String name;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name = "value")
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Alerts tribunals = (Alerts) o;

        if (id != tribunals.id) return false;
        if (value != tribunals.value) return false;
        if (name != null ? !name.equals(tribunals.name) : tribunals.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Integer result = id;
        result = 31 * result + value;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
