package core.masterdata.module.entities;

import javax.persistence.*;

@Entity
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;

    public Book(String name){
        this.name = name;
    }

    public Book() {
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
