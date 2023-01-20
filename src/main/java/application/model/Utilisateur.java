package application.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur", nullable = false)
    private Integer id;

    @Column(name = "nom", nullable = false, length = 100)
    private String nom;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "mdp", nullable = false, length = 100)
    private String mdp;

    @Column(name = "administrateur", nullable = false)
    private Boolean administrateur = false;

    @Column(name = "solde", nullable = false)
    private Double solde;

    @OneToMany(mappedBy = "idUtilisateur")
    private Set<Token> tokens = new LinkedHashSet<>();

    public Set<Token> getTokens() {
        return tokens;
    }

    public Token getToken() {
        return (Token) (tokens.toArray())[0];
    }

    public void setTokens(Set<Token> tokens) {
        this.tokens = tokens;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Boolean getAdministrateur() {
        return administrateur;
    }

    public void setAdministrateur(Boolean administrateur) {
        this.administrateur = administrateur;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}