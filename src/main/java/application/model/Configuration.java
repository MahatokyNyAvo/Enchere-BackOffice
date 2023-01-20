package application.model;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Configuration {
    private CommissionConfiguration commissionConfiguration;
    private DureeConfiguration dureeConfiguration;
}
