package com.ZalegoProject.BodySystem.Domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class SupportSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private  int numberofPart;

@ManyToMany(mappedBy = "SupportSystem")
    private Set<Body> body = new HashSet<>();

    public Set<Body> getBody() {
        return body;
    }

    public void setBody(Set<Body> body) {
        this.body = body;
    }

    public SupportSystem() {
    }

    public SupportSystem(int numberofPart) {
        this.numberofPart = numberofPart;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getNumberofPart() {
        return numberofPart;
    }

    public void setNumberofPart(int numberofPart) {
        this.numberofPart = numberofPart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupportSystem that = (SupportSystem) o;
        return numberofPart == that.numberofPart &&
                Objects.equals(Id, that.Id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Id, numberofPart);
    }

    @Override
    public String toString() {
        return "SupportSystem{" +
                "Id=" + Id +
                ", numberofPart=" + numberofPart +
                '}';
    }
}
