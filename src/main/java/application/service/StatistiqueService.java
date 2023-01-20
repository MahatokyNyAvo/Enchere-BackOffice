package application.service;

import application.model.Statistique;
import application.repository.StatistiqueRepository;
import org.springframework.stereotype.Service;

@Service
public class StatistiqueService {
    private final StatistiqueRepository statistiqueRepository;

    public StatistiqueService(StatistiqueRepository statistiqueRepository) {
        this.statistiqueRepository = statistiqueRepository;
    }

    public Statistique getStat(){
        return statistiqueRepository.getReferenceById(1);
    }
}
