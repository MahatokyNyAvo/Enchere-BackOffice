package application.service;

import application.model.Categorie;
import application.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategorieService {
    @Autowired
    private final CategorieRepository categorieRepository;

    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public Categorie creer(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    public ArrayList<Categorie> lire() {
        return (ArrayList<Categorie>) categorieRepository.findAll();
    }

    public Categorie modifier(int id, Categorie categorie) {
        return categorieRepository.findById(id).map(m -> {
            m.setIntitule(categorie.getIntitule());
            return categorieRepository.save(m);
        }).orElseThrow(() -> new RuntimeException("Categorie non trouve"));
    }
}
