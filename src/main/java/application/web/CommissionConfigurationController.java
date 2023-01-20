package application.web;

import application.model.CommissionConfiguration;
import application.repository.CommissionConfigurationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.time.LocalDate;

@Controller
@RequestMapping("/commissionsConfiguration")
public class CommissionConfigurationController {
    private final CommissionConfigurationRepository commissionConfigurationRepository;

    public CommissionConfigurationController(CommissionConfigurationRepository commissionConfigurationRepository) {
        this.commissionConfigurationRepository = commissionConfigurationRepository;
    }

    @PostMapping()
    public RedirectView save (CommissionConfiguration cf) {
        cf.setDateApplication(LocalDate.now());
        commissionConfigurationRepository.save(cf);
        return new RedirectView("/configurations");
    }
}
