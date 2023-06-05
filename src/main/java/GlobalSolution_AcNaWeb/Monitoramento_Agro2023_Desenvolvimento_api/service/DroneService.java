package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model.Drones;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.repository.RepositoryDrone;

@Service
public class DroneService {
	
	@Autowired
	private RepositoryDrone droneRepository;
	
	public List<Drones> list(){
		return droneRepository.findAll();
	}
	
	public Drones save(Drones drones) {
		return droneRepository.save(drones);
	}
	
}
