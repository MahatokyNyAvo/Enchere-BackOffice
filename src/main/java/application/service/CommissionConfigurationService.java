package application.service;

import application.model.CommissionConfiguration;
import application.repository.CommissionConfigurationRepository;
import org.springframework.stereotype.Service;

@Service
public class CommissionConfigurationService {
    private final CommissionConfigurationRepository commissionConfigurationRepository;

    public CommissionConfigurationService(CommissionConfigurationRepository commissionConfigurationRepository) {
        this.commissionConfigurationRepository = commissionConfigurationRepository;
    }

    public void save(CommissionConfiguration commissionConfiguration) {
        this.commissionConfigurationRepository.save(commissionConfiguration);
    }

}
