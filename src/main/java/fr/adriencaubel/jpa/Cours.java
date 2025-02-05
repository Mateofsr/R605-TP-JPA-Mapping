package fr.adriencaubel.jpa;

import jakarta.persistence.*;

@Entity
@Table(name="Cours")
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "duree")
    private int duree;

    @Column(name = "description")
    private String description;

    public void setName(String name) {
        this.nom = name;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuree() {
        return duree;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return nom;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
