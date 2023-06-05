package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.DTO.TelemetriaRequestCreate;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.DTO.TelemetriaRequestUpdate;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.DTO.TelemetriaSearched;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model.Telemetria;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.repository.TelemetriaRepository;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.service.TelemetriaService;

@RestController
@RequestMapping("/telemetria")
public class TelemetriaController {
	
	@Autowired
	private TelemetriaService service;
	
	@Autowired
	private TelemetriaRepository repository;
	
	
	@GetMapping
	public List<TelemetriaSearched> listAll(){
		List<TelemetriaSearched> result =
				service.list().stream().map(TelemetriaSearched::toDto).collect(Collectors.toList());
		
		return result;
	}
	
	@PostMapping
	public Telemetria create(@RequestBody TelemetriaRequestCreate dto) {
		
		Telemetria telemetria = new Telemetria();
		
		telemetria.setDatehours(dto.getDatehours());
		telemetria.setLocation(dto.getLocation());
		telemetria.setUrlImage(dto.getUrlImage());
		
		Telemetria result = service.save(telemetria);
		
		return result;
	}
	
	@PutMapping
	public Telemetria update(@RequestBody TelemetriaRequestUpdate dto) {
		
		boolean exist = repository.existsById(dto.getId());
		
		if(!exist) {
			throw new RuntimeException("id não encontrado "+ dto.getId());
		}
		
		Telemetria telemetria = new Telemetria();
		
		telemetria.setId(dto.getId());
		telemetria.setDatehours(dto.getDatehours());
		telemetria.setLocation(dto.getLocation());
		telemetria.setUrlImage(dto.getUrlImage());
		
		Telemetria result = repository.save(telemetria);
		
		return result;
		
	}
}
