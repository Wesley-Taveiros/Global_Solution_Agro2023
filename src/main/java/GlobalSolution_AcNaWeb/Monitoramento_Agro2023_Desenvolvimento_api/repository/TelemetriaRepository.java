package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model.Telemetria;

public interface TelemetriaRepository extends JpaRepository<Telemetria, Long>{
	
}
