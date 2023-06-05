package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.DTO.ImageRequestUpdate;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.DTO.ImageSearched;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model.Imagem;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.repository.ImageRepository;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.service.ImageService;

@RestController
@RequestMapping("/imagens")
public class ImageController {

		@Autowired
		private ImageService imagemservice;
		
		@Autowired
		private ImageRepository imagemRepository;
	
	    @PostMapping("/upload")
	    public Imagem createImage(@RequestParam("file") MultipartFile file) {
	    	
	    	if (!file.getContentType().startsWith("image/")) {
	    		System.out.println("Arquivo inválido. Por favor, envie uma imagem.");
	            return null;
	        }
	    	
	    	try {
	            String filename = file.getOriginalFilename();
	            
	            file.transferTo(new File("/imagens/upload/save/" + filename));
	   
	            Imagem result = imagemservice.saveFile(file);
	            
	            return result;
	        } catch (IOException e) {
	        	System.out.println("Erro para subir o arquivo");
	            return null;
	        }
	    }
	    
	    @PutMapping
	    public Imagem update(@RequestParam("file") MultipartFile file, ImageRequestUpdate dto) throws IOException {
	        boolean exist = imagemRepository.existsById(dto.getIdImage()); 
	        if (!exist) {
	            throw new RuntimeException("ID da imagem não encontrado: " + dto.getIdImage());
	        }
	        
	        String filename = file.getOriginalFilename();
	        String savePath = "/imagens/upload/save/" + filename;
	        File saveFile = new File(savePath);
	        file.transferTo(saveFile);
	        
	        Imagem imagem = new Imagem();
	        
	        imagem.setFile(dto.getFile());
	        imagem.setIdImage(dto.getIdImage());
	        imagem.setUrlImage(dto.getUrlImage());
	        
	        Imagem result = imagemservice.saveImage(imagem);
	        
	        return result;
	    }
	    
	    public List<ImageSearched> listAll(){
	    	
	    	List<ImageSearched> result =
	    			imagemservice.list().stream().map(ImageSearched::toDto).
	    				collect(Collectors.toList());
	    	return result;
	    }
}
