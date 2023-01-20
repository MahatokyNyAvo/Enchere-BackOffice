package application.service;

import application.model.Rechargement;
import application.repository.RechargementRepository;
import application.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
public class RechargementService {
    private final RechargementRepository rechargementRepository;
    private final UtilisateurRepository utilisateurRepository;
    public RechargementService(RechargementRepository rechargementRepository, UtilisateurRepository utilisateurRepository) {
        this.rechargementRepository = rechargementRepository;
        this.utilisateurRepository = utilisateurRepository;
    }

    public ArrayList<Rechargement> getNewDeposition() {
        return rechargementRepository.getNewDeposition();
    }

    @Transactional
    public void validateDeposition(boolean isValidate , int idUtilisateur , int idRechargement) {
        if(isValidate) {
            rechargementRepository.validateDeposit(idRechargement);
            double montant = utilisateurRepository.getReferenceById(idUtilisateur).getSolde() + rechargementRepository.getReferenceById(idRechargement).getMontant();
            utilisateurRepository.updateSolde(montant, idUtilisateur);
        }else {
            rechargementRepository.refuseDeposit(idRechargement);
        }
        return;
    }
}
