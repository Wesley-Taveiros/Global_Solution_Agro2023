package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.DTO;

import org.springframework.web.multipart.MultipartFile;

import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model.Imagem;

public  class ImageSearched {

	private Long IdImage;
	private String urlImage;
	private MultipartFile file;
	
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
	
	public MultipartFile getFile() {
		return file;
	}
	
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	
	public static ImageSearched toDto(Imagem imagem) {
		ImageSearched dto = new ImageSearched();
		dto.setIdImage(imagem.getIdImage());
		dto.setUrlImage(imagem.getUrlImage());
		dto.setFile(imagem.getFile());
		
		return dto;
	}
	
	
}
