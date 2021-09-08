package com.ZalegoProject.BodySystem.Domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Body {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO
    )
    private Long BId;
    private int NoOfSystems;
    private String NameOfSystems;


    @OneToMany(mappedBy = "Body")
    public Set<System> getSystem() {
        return system;
    }

    public void setSystem(Set<System> system) {
        this.system = system;
    }

    private Set<System> system = new HashSet<>();

    public Body() {
    }

    public Body(int noOfSystems, String nameOfSystems) {
        NoOfSystems = noOfSystems;
        NameOfSystems = nameOfSystems;
    }

    public Long getBId() {
        return BId;
    }

    public void setBId(Long BId) {
        this.BId = BId;
    }

    public int getNoOfSystems() {
        return NoOfSystems;
    }

    public void setNoOfSystems(int noOfSystems) {
        NoOfSystems = noOfSystems;
    }

    public String getNameOfSystems() {
        return NameOfSystems;
    }

    public void setNameOfSystems(String nameOfSystems) {
        NameOfSystems = nameOfSystems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Body body = (Body) o;
        return NoOfSystems == body.NoOfSystems &&
                Objects.equals(BId, body.BId) &&
                Objects.equals(NameOfSystems, body.NameOfSystems);
    }

    @Override
    public int hashCode() {

        return Objects.hash(BId, NoOfSystems, NameOfSystems);
    }

    @Override
    public String toString() {
        return "Body{" +
                "BId=" + BId +
                ", NoOfSystems=" + NoOfSystems +
                ", NameOfSystems='" + NameOfSystems + '\'' +
                '}';
    }
}
