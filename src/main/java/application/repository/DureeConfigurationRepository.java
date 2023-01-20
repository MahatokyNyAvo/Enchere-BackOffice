package application.repository;

import application.model.DureeConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DureeConfigurationRepository extends JpaRepository<DureeConfiguration, Integer> {
    @Query(value = "SELECT * FROM duree_configuration ORDER BY date_application DESC LIMIT 1" , nativeQuery = true)
    DureeConfiguration getActualConfiguration();
}