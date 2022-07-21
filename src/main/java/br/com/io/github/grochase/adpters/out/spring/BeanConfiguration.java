package br.com.io.github.grochase.adpters.out.spring;

import br.com.io.github.grochase.application.generator.GeneratorParcel;
import br.com.io.github.grochase.application.usecase.InstallmentSimulatorUseCaseImpl;
import br.com.io.github.grochase.ports.out.SimulatorRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    InstallmentSimulatorUseCaseImpl invoiceUseCaseImpl(GeneratorParcel generatorInvoice, SimulatorRepositoryPort simulatorRepositoryPort) {
        return new InstallmentSimulatorUseCaseImpl(generatorInvoice, simulatorRepositoryPort);
    }
}
