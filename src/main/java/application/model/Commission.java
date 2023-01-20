package application.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "commission")
public class Commission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commission", nullable = false)
    private Integer id;

    @Column(name = "montant", nullable = false)
    private Double montant;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_mise", nullable = false)
    private Mise idMise;

    @Column(name = "date_com", nullable = false)
    private LocalDate dateCom;

    public LocalDate getDateCom() {
        return dateCom;
    }

    public void setDateCom(LocalDate dateCom) {
        this.dateCom = dateCom;
    }

    public Mise getIdMise() {
        return idMise;
    }

    public void setIdMise(Mise idMise) {
        this.idMise = idMise;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}