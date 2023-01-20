package application.web;

import application.model.Categorie;
import application.service.CategorieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categories")
public class CategorieController {
    public final CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping()
    public String list(Model model) throws Exception {
        try {
            model.addAttribute("categories", categorieService.lire());
            return "categorie_list";
        }catch (Exception e) {
            throw e;
        }
    }

    @PostMapping()
    public String save(Categorie categorie, Model model) throws Exception {
        categorieService.creer(categorie);
        return list(model);
    }
}
