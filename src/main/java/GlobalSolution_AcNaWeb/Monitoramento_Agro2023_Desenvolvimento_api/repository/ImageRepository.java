package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model.Imagem;

@Repository
public interface ImageRepository extends JpaRepository<Imagem, Long> {

	Imagem saveAll(Imagem imagem);

	Imagem save(MultipartFile file);

	boolean existsById(MultipartFile dto);
	
}
