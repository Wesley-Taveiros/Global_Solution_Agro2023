package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.DTO;

import org.springframework.web.multipart.MultipartFile;


public abstract class ImageRequestUpdate {
		
	protected Long IdImage;
	protected String urlImage;
	protected MultipartFile file;
	
	
	
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public Long getIdImage() {
		return IdImage;
	}
	
	public void setIdImage(Long idImage) {
		IdImage = idImage;
	}
	
	public String getUrlImage() {
		return urlImage;
	}
	
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	
}
