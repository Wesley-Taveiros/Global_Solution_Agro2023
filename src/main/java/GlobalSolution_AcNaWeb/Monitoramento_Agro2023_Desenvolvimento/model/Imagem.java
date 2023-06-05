package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;



public class Imagem {

	private Long IdImage;
	@Column(name="UrlImagem")
	private String urlImage;
	
	private MultipartFile file;

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
