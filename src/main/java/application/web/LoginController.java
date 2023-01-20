package application.web;

import application.model.Utilisateur;
import application.service.UtilisateurService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    private final UtilisateurService utilisateurService;

    public LoginController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @PostMapping("/login")
    public Object login(Utilisateur user, Model model, HttpSession httpSession) {
        try {
            httpSession.setAttribute("admin", utilisateurService.checkLogin(user).getToken().getToken());
            return new RedirectView("/categories");
        }catch (Exception e ){
            e.printStackTrace();
            model.addAttribute("error", e.getMessage());
            return "index";
        }
    }
}
