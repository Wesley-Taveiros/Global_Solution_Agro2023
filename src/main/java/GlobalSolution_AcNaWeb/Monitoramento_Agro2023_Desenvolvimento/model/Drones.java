package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="drones")
public class Drones {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	@Column(name="identificacao_drone")
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
	
}
