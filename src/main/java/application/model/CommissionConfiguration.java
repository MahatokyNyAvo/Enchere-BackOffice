package application.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "commission_configuration")
public class CommissionConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commission_configuration", nullable = false)
    private Integer id;

    @Column(name = "pourcentage", nullable = false)
    private double pourcentage;

    @GeneratedValue
    @Column(name = "date_application", nullable = false, columnDefinition = "date default CURRENT_DATE")
    private LocalDate dateApplication;

    public LocalDate getDateApplication() {
        return dateApplication;
    }

    public void setDateApplication(LocalDate dateApplication) {
        this.dateApplication = dateApplication;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}