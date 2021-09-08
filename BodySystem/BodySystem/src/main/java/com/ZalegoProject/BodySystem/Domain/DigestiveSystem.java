package com.ZalegoProject.BodySystem.Domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class DigestiveSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private  int numberofPart;


    @OneToOne(mappedBy = "DigestiveSystem")
    public Set<Body> getBody() {
        return body;
    }

    public void setBody(Set<Body> body) {
        this.body = body;
    }

    private Set<Body> body = new HashSet<>();
    public DigestiveSystem() {
    }

    public DigestiveSystem(int numberofPart) {
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
        DigestiveSystem that = (DigestiveSystem) o;
        return numberofPart == that.numberofPart &&
                Objects.equals(Id, that.Id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Id, numberofPart);
    }

    @Override
    public String toString() {
        return "DigestiveSystem{" +
                "Id=" + Id +
                ", numberofPart=" + numberofPart +
                '}';
    }
}

