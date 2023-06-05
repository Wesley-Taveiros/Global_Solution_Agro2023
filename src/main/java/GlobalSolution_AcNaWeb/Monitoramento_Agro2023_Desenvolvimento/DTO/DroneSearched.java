package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.DTO;

import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model.Drones;

public class DroneSearched {
	
	private Long id;
	private String NameDrone;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNameDrone() {
		return NameDrone;
	}
	
	public void setNameDrone(String nameDrone) {
		NameDrone = nameDrone;
	}
	
	public static DroneSearched toDto(Drones drone) {
		DroneSearched dto = new DroneSearched();
		dto.setId(drone.getId());
		dto.setNameDrone(drone.getNameDrone());
		
		return dto;
	}
}
