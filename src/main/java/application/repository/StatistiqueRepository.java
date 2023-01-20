package application.repository;

import application.model.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatistiqueRepository extends JpaRepository<Statistique, Integer> {
}