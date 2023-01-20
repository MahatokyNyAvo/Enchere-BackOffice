package application.repository;

import application.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    @Query(value = "SELECT * FROM utilisateur WHERE email = :email AND mdp = md5(:mdp) AND administrateur is true" , nativeQuery = true)
    Utilisateur checkLogin(@Param("email") String email , @Param("mdp") String mdp);

    @Query(value = "SELECT MD5(cast(now() AS TEXT) || (SELECT email FROM utilisateur WHERE id_utilisateur = :id_utilisateur))", nativeQuery = true)
    String generateToken(@Param("id_utilisateur") int id);

    @Modifying
    @Query(value = "UPDATE utilisateur SET solde = :montant WHERE id_utilisateur = :id_utilisateur",nativeQuery = true)
    void updateSolde(@Param("montant") double montant , @Param("id_utilisateur") int idUtilisateur);
}