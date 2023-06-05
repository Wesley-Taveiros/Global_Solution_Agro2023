package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.DTO;

import java.time.LocalDateTime;

public class TelemetriaRequestCreate extends ImageRequestUpdate {
	
	
	private String Location;
	private LocalDateTime datehours;
	private String UrlImage;
	
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
