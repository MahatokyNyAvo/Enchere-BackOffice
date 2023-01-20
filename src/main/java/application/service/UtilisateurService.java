package application.service;

import application.model.Utilisateur;
import application.model.Token;
import application.repository.TokenRepository;
import application.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;

@Service
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;
    private final TokenRepository tokenRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository, TokenRepository tokenRepository) {
        this.utilisateurRepository = utilisateurRepository;
        this.tokenRepository = tokenRepository;
    }

    public Utilisateur checkLogin(Utilisateur utilisateur) throws Exception {
        Utilisateur temp = utilisateurRepository.checkLogin(utilisateur.getEmail(), utilisateur.getMdp());
        if ( temp == null) {
            throw new Exception("Erreur d'authentification");
        }
        if (!temp.getTokens().isEmpty()){
            tokenRepository.deleteAll(temp.getTokens());
        }
        Token token = new Token();
        token.setToken(utilisateurRepository.generateToken(temp.getId()));
        token.setIdUtilisateur(temp);
        tokenRepository.save(token);
        return utilisateurRepository.getReferenceById(temp.getId());
    }
}
