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

		Moons moons1 = new Moons(1L, "Ariel", "Urano", "190.900", "Inexistente", 135301201021L, "2,520d", "60h","0.260", 5.52);
		Moons moons2 = new Moons(2L, "Fobos", "Marte", "9.376", "Inexistente",  1081016L, "7h 38min", "7h 39m 12s","1.093", 2.138);
		Moons moons3 = new Moons(3L, "Deimos", "Marte", "23.460", "Inexistente", 141015L, "30,312", "30h", "0,93",1.36);
		Moons moons4 = new Moons(4L, "Inexistente", "Venus", "00.0000", "Inexistente", 0000L , "00,0000", "00h","0.00", 0.00);
		Moons moons5 = new Moons(5L, "Lua", "Terra", "384.399", "1 µPa", 73491022L, "27d 7h 43m", "27,321582","5,145", 1.022);
		Moons moons6 = new Moons(6L, "Inexistente", "Mercurio", "00.0000", "Inexistente", 0000L, "00,0000", "00h","0.00", 0.00);
		Moons moons7 = new Moons(7L, "Náiade", "Neturno", "48.227", "23.91", 191019L, "Inexistente", "0.294396", "4,691", 11.9);
		Moons moons8 = new Moons(8L, "Talassa", "Neturno", "50.0751", "Inexistente", 351017L, "0.311485", "0,31148444.0.00000006", "0,210.02", 11.68);
		Moons moons9 = new Moons(9L, "Despina", "Neturno", "00.0000", "Inexistente", 0000L, "00,0000", "00h","0.00", 0.00);
		Moons moons10 = new Moons(10L, "Galateia", "Neturno", "00.0000", "Inexistente", 0000L, "00,0000", "00h","0.00", 0.00);
		Moons moons11 = new Moons(11L, "Larissa", "Neturno", "00.0000", "Inexistente", 0000L, "00,0000", "00h","0.00", 0.00);
		Moons moons12 = new Moons(12L, "Hipocampo", "Neturno", "105.284", "Inexistente",51016L, "0,950103d", "00h","0,082 0,056", 0.00);
		Moons moons13 = new Moons(13L, "Proteu", "Neturno", "117.647±1", "Inexistente", 441019L, "26h 54m", "1.12231d", "0,524", 7.623);
		Moons moons14 = new Moons(14L, "Lua", "Terra", "384.399", "1 µPa", 73491022L, "27d 7h 43m", "27,321582","5,145", 1.022);
		Moons moons15 = new Moons(15L, "Tritão", "Neturno", "354.759", "1,4 - 1,9Pa", 2141022L, "5d, 21h, 2min 53s", "9,553", "0.348.54", 4.39);
		Moons moons16 = new Moons(16L, "Sao", "Neturno", "00.0000", "Inexistente", 0000L, "00,0000", "00h","0.00", 0.00);
		Moons moons17 = new Moons(17L, "Laomedeia", "Neturno", "00.0000", "Inexistente", 0000L, "00,0000", "00h","0.00", 0.00);
		Moons moons18 = new Moons(18L, "Psámata", "Neturno", "00.0000", "Inexistente",0000L, "00,0000", "00h","0.00", 0.00);
		Moons moons19 = new Moons(19L, "Néso", "Neturno", "00.0000", "Inexistente",0000L, "00,0000", "00h","0.00", 0.00);
		Moons moons20 = new Moons(20L, "Métis", "Jupiter", "128.000", "17.5", 361016L, "Inexistente", "7h","0,06", 31.501);

		MoonsDTO moonsDto1 = mapper.map(moons1, MoonsDTO.class);
		MoonsDTO moonsDto2 = mapper.map(moons2, MoonsDTO.class);
		MoonsDTO moonsDto3 = mapper.map(moons3, MoonsDTO.class);
		MoonsDTO moonsDto4 = mapper.map(moons4, MoonsDTO.class);
		MoonsDTO moonsDto5 = mapper.map(moons5, MoonsDTO.class);
		MoonsDTO moonsDto6 = mapper.map(moons6, MoonsDTO.class);
		MoonsDTO moonsDto7 = mapper.map(moons7, MoonsDTO.class);
		MoonsDTO moonsDto8 = mapper.map(moons8, MoonsDTO.class);
		MoonsDTO moonsDto9 = mapper.map(moons9, MoonsDTO.class);
		MoonsDTO moonsDto10 = mapper.map(moons10, MoonsDTO.class);
		MoonsDTO moonsDto11 = mapper.map(moons11, MoonsDTO.class);
		MoonsDTO moonsDto12 = mapper.map(moons12, MoonsDTO.class);
		MoonsDTO moonsDto13 = mapper.map(moons13, MoonsDTO.class);
		MoonsDTO moonsDto14 = mapper.map(moons14, MoonsDTO.class);
		MoonsDTO moonsDto15 = mapper.map(moons15, MoonsDTO.class);
		MoonsDTO moonsDto16 = mapper.map(moons16, MoonsDTO.class);
		MoonsDTO moonsDto17 = mapper.map(moons17, MoonsDTO.class);
		MoonsDTO moonsDto18 = mapper.map(moons18, MoonsDTO.class);
		MoonsDTO moonsDto19 = mapper.map(moons19, MoonsDTO.class);
		MoonsDTO moonsDto20 = mapper.map(moons20, MoonsDTO.class);

 

		repository.saveAll(Arrays.asList(mapper.map(moonsDto1, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto2, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto3, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto4, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto5, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto6, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto7, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto8, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto9, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto10, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto11, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto12, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto13, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto14, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto15, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto16, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto17, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto18, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto19, Moons.class)));
		repository.saveAll(Arrays.asList(mapper.map(moonsDto20, Moons.class)));

	}
}
