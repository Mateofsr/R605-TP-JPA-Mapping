package fr.adriencaubel.jpa;

import jakarta.persistence.*;

@Entity
@Table(name="Cours")
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    private Promotion promotion;

    @Column(name = "nom")
    private String nom;

    @Column(name = "duree")
    private int duree;

    @Column(name = "description")
    private String description;

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public String getNom() {
        return nom;
    }
}
