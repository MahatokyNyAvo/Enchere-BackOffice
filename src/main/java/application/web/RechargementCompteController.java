package application.web;

import application.service.RechargementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rechargements")
public class RechargementCompteController {
    private final RechargementService rechargementService;

    public RechargementCompteController(RechargementService rechargementService) {
        this.rechargementService = rechargementService;
    }

    @GetMapping()
    public String list(Model model) {
        model.addAttribute("rechargements" , rechargementService.getNewDeposition());
        return "rechargement_page";
    }

    @GetMapping("/{idRechargement}/{idUtilisateur}/{isValidate}")
    public String validationProcess(@PathVariable int idRechargement, @PathVariable int idUtilisateur , @PathVariable int isValidate, Model model){
        if (isValidate == 1) rechargementService.validateDeposition(true,idUtilisateur,idRechargement);
        else if (isValidate == 0) rechargementService.validateDeposition(false,idUtilisateur,idRechargement);
        return list(model);
    }
}
