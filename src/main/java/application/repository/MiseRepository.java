package application.repository;

import application.model.Mise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MiseRepository extends JpaRepository<Mise, Integer> {
}