package application.service;

import application.model.DureeConfiguration;
import application.repository.DureeConfigurationRepository;
import org.springframework.stereotype.Service;

@Service
public class DureeConfigurationService {
    private final DureeConfigurationRepository dureeConfigurationRepository;

    public DureeConfigurationService(DureeConfigurationRepository dureeConfigurationRepository) {
        this.dureeConfigurationRepository = dureeConfigurationRepository;
    }

    public void save (DureeConfiguration dureeConfiguration) {
        this.dureeConfigurationRepository.save(dureeConfiguration);
    }
}
