package application.repository;

import application.model.CommissionConfiguration;
import application.model.DureeConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CommissionConfigurationRepository extends JpaRepository<CommissionConfiguration, Integer> {
    @Query(value = "SELECT * FROM commission_configuration ORDER BY date_application DESC LIMIT 1" , nativeQuery = true)
    CommissionConfiguration getActualConfiguration();
}