package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Telemetria {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String Location;
	private String UrlImage;
	private LocalDateTime datehours;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getLocation() {
		return Location;
	}
	
	public void setLocation(String location) {
		Location = location;
	}
	
	public String getUrlImage() {
		return UrlImage;
	}

	public void setUrlImage(String urlImage) {
		UrlImage = urlImage;
	}
	
	public LocalDateTime getDatehours() {
		return datehours;
	}
	
	public void setDatehours(LocalDateTime datehours) {
		this.datehours = datehours;
	}
	
}
