package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model.Drones;

@Repository
public interface RepositoryDrone extends JpaRepository<Drones, Long>{
	
	
	
}
