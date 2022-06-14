package core.masterdata.module.entities;

import javax.persistence.*;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;

    public Person(String name){
        this.name = name;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
