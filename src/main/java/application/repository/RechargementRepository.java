package application.repository;

import application.model.Rechargement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface RechargementRepository extends JpaRepository<Rechargement, Integer> {
    @Query(value = "SELECT * FROM rechargement WHERE etat = 0", nativeQuery = true)
    ArrayList<Rechargement> getNewDeposition ();

    @Modifying
    @Query(value = "UPDATE rechargement SET etat = 2 WHERE id_rechargement = :id_rechargement ", nativeQuery = true)
    void validateDeposit(@Param("id_rechargement") int idRechargement);

    @Modifying
    @Query(value = "UPDATE rechargement SET etat = 1 WHERE id_rechargement = :id_rechargement ", nativeQuery = true)
    void refuseDeposit(@Param("id_rechargement") int idRechargement);

}