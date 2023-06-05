package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.DTO;

import java.time.LocalDateTime;

public class TelemetriaRequestUpdate extends ImageRequestUpdate{

	private Long id;
	private String Location;
	private LocalDateTime datehours;
	private String UrlImage;
	
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
	
	public LocalDateTime getDatehours() {
		return datehours;
	}
	
	public void setDatehours(LocalDateTime datehours) {
		this.datehours = datehours;
	}

	public String getUrlImage() {
		return UrlImage;
	}

	public void setUrlImage(String urlImage) {
		UrlImage = urlImage;
	}
	
}
