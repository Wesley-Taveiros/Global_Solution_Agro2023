package GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento.model.Telemetria;
import GlobalSolution_AcNaWeb.Monitoramento_Agro2023_Desenvolvimento_api.repository.TelemetriaRepository;

@Service

public class TelemetriaService {
	
	@Autowired
	private TelemetriaRepository telemetriaRepository;
	
	public List<Telemetria> list(){
		return telemetriaRepository.findAll();
	}
	public Telemetria save(Telemetria telemetria) {
		return telemetriaRepository.save(telemetria);
	}	
}
