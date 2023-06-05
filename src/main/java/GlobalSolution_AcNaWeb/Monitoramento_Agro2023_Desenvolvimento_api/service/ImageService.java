package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model.Imagem;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.repository.ImageRepository;

@Service
public class ImageService {
	
	@Autowired
	private ImageRepository imageRepository;
	
	public List<Imagem> list(){
		return imageRepository.findAll();
	}
	public Imagem saveFile(MultipartFile file) {
		return imageRepository.save(file);
	}
	
	public Imagem saveImage(Imagem imagem) {
		return imageRepository.save(imagem);
	}
	
}
