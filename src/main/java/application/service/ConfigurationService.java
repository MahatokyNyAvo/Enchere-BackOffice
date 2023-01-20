package application.service;

import application.model.Configuration;
import application.repository.CommissionConfigurationRepository;
import application.repository.DureeConfigurationRepository;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {
    private final CommissionConfigurationRepository commissionConfigurationRepository;
    private final DureeConfigurationRepository dureeConfigurationRepository;

    public ConfigurationService(CommissionConfigurationRepository commissionConfigurationRepository, DureeConfigurationRepository dureeConfigurationRepository) {
        this.commissionConfigurationRepository = commissionConfigurationRepository;
        this.dureeConfigurationRepository = dureeConfigurationRepository;
    }

    public Configuration getActualConfiguration () {
        Configuration cf = new Configuration();
        cf.setCommissionConfiguration(commissionConfigurationRepository.getActualConfiguration());
        cf.setDureeConfiguration(dureeConfigurationRepository.getActualConfiguration());
        return cf;
    }
}
