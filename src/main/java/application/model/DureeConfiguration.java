package application.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "duree_configuration")
public class DureeConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_duree_configuration", nullable = false)
    private Integer id;

    @Column(name = "duree_minimum", nullable = false)
    private Double dureeMinimum;

    @Column(name = "duree_maximum", nullable = false )
    private Double dureeMaximum;

    @GeneratedValue
    @Column(name = "date_application", nullable = false, columnDefinition = "date default CURRENT_DATE")
    private LocalDate dateApplication;

    public LocalDate getDateApplication() {
        return dateApplication;
    }

    public void setDateApplication(LocalDate dateApplication) {
        this.dateApplication = dateApplication;
    }

    public Double getDureeMaximum() {
        return dureeMaximum;
    }

    public void setDureeMaximum(Double dureeMaximum) {
        this.dureeMaximum = dureeMaximum;
    }

    public Double getDureeMinimum() {
        return dureeMinimum;
    }

    public void setDureeMinimum(Double dureeMinimum) {
        this.dureeMinimum = dureeMinimum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}