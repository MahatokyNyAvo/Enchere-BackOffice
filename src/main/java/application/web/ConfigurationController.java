package application.web;

import application.service.ConfigurationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/configurations")
public class ConfigurationController {
    public final ConfigurationService configurationService;

    public ConfigurationController(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    @GetMapping
    public String list (Model model) {
        model.addAttribute("configuration", configurationService.getActualConfiguration());
        return "configuration_page";
    }
}
