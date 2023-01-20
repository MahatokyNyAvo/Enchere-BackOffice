package application.web;

import application.model.DureeConfiguration;
import application.repository.DureeConfigurationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.time.LocalDate;

@Controller
@RequestMapping("/dureeConfiguration")
public class DureeConfigurationController {
    private final DureeConfigurationRepository dureeConfigurationRepository;

    public DureeConfigurationController(DureeConfigurationRepository dureeConfigurationRepository) {
        this.dureeConfigurationRepository = dureeConfigurationRepository;
    }

    @PostMapping()
    public RedirectView save(DureeConfiguration cf) {
        cf.setDateApplication(LocalDate.now());
        dureeConfigurationRepository.save(cf);
        return new RedirectView("/configurations");
    }
}
