package application.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "statistique")
public class Statistique {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "utilisateurs")
    private Long utilisateurs;

    @Column(name = "lots")
    private Long lots;

    @Column(name = "commissions")
    private BigDecimal commissions;

    public BigDecimal getCommissions() {
        return commissions;
    }

    public Long getLots() {
        return lots;
    }

    public Long getUtilisateurs() {
        return utilisateurs;
    }

    public Integer getId() {
        return id;
    }

    protected Statistique() {
    }
}