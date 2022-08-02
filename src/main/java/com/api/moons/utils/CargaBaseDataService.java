package com.api.moons.utils;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.api.moons.dto.MoonsDTO;
import com.api.moons.model.Moons;
import com.api.moons.repository.MoonsRepository;

@Service
public class CargaBaseDataService {

	private MoonsRepository repository;
	private ModelMapper mapper;

	public CargaBaseDataService(MoonsRepository repository, ModelMapper mapper) {
		this.mapper = mapper;
		this.repository = repository;
	}

	public void bdInstance() {

//		Moons(Long id, String name, String planetaMae, String semieixoMaior, String pressaoAtmosferica, Integer massa, String periodoDeRotacao, String periodoOrbital, String inclinacao, Double velocidadeOrbitalMedia

		Moons moons1 = new Moons(1L, "Ariel", "Urano", "190.900", "Inexistente", (int) 1.35301201021, "2,520d", "60h","0.260", 5.52);
		Moons moons2 = new Moons(2L, "Fobos", "Marte", "9.376", "Inexistente", (int) 1.081016, "7h 38min", "7h 39m 12s","1.093", 2.138);
		Moons moons3 = new Moons(3L, "Deimos", "Marte", "23.460", "Inexistente", (int) 1.41015, "30,312", "30h", "0,93",1.36);
		Moons moons4 = new Moons(4L, "Inexistente", "Venus", "00.0000", "Inexistente", (int) 0.000, "00,0000", "00h","0.00", 0.00);
		Moons moons5 = new Moons(5L, "Lua", "Terra", "384.399", "1 µPa", (int) 7.3491022, "27d 7h 43m", "27,321582","5,145", 1.022);
		Moons moons6 = new Moons(6L, "Inexistente", "Mercurio", "00.0000", "Inexistente", (int) 0.000, "00,0000", "00h","0.00", 0.00);
		
		Moons moons7 = new Moons(7L, "Náiade", "Netuno", "48.227", "23.91", (int) 1.91019, "Inexistente", "0.294396", "4,691", 11.9);


		MoonsDTO moonsDto1 = mapper.map(moons1, MoonsDTO.class);
		MoonsDTO moonsDto2 = mapper.map(moons2, MoonsDTO.class);

		repository.saveAll(Arrays.asList(mapper.map(moonsDto1, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto2, Moons.class)));

	}
}
