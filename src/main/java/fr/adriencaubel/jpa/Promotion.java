package fr.adriencaubel.jpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Promotion")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(mappedBy = "promotion", cascade = CascadeType.ALL)
    @Column(name = "listeCours")
    private List<Cours> cours = new ArrayList<>();

    @Column(name = "libelle")
    private String libelle;

    public String getLibelle() {
        return libelle;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public List<Cours> getCours() {
        return cours;
    }
}
