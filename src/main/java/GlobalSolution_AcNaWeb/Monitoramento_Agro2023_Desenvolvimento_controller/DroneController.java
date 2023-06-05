package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.DTO.*;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model.Drones;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.repository.RepositoryDrone;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.service.DroneService;

@RestController
@RequestMapping("/drones")
public class DroneController {

	@Autowired
	private DroneService droneService;
		
	@Autowired
	private RepositoryDrone repositoryDrone;
	
	@GetMapping
	public List<DroneSearched> listAll(){
		List<DroneSearched> result =
				droneService.list().stream().map(DroneSearched::toDto).collect(Collectors.toList());
		
		return result;
	}
	
	@PostMapping
	public Drones create(@RequestBody DroneRequestCreate dto) {
		
		Drones drone = new Drones();
		
		drone.setNameDrone(dto.getNameDrone());
		
		Drones result = droneService.save(drone);
		return result;
	}
	
	@PutMapping
	public Drones update(@RequestBody DroneRequestUpdate dto) {
		boolean exist = repositoryDrone.existsById(dto.getId());
		
		if(!exist) {
			throw new RuntimeException("id não encontrado "+ dto.getId());
		}
		Drones drone = new Drones();
		
		drone.setId(dto.getId());
		drone.setNameDrone(dto.getNameDrone());
		
		Drones result = droneService.save(drone);
		
		return result;
	}
	
	@DeleteMapping(value="{id}")
	public void delete(@PathVariable Long id) {
		repositoryDrone.deleteById(id);
		
	}
}
