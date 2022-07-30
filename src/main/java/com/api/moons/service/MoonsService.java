package com.api.moons.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.api.moons.dto.MoonsDTO;
import com.api.moons.exceptions.ReturnObjectFailedExceptionsMessage;
import com.api.moons.model.Moons;
import com.api.moons.repository.MoonsRepository;

@Service
public class MoonsService {
	
	private MoonsRepository repository;
	private ModelMapper mapper;

	public MoonsService(MoonsRepository repository, ModelMapper mapper) {
		this.mapper = mapper;
		this.repository = repository;
	}

	public List<MoonsDTO> listAllData() {
		List<Moons> list = repository.findAll();
		try {
			return list
					.stream()
					.map(listDto -> mapper.map(listDto, MoonsDTO.class))
					.collect(Collectors.toList());
		} catch (ReturnObjectFailedExceptionsMessage e) {
			throw new ReturnObjectFailedExceptionsMessage("Erro ao listar todos as luas ");
		}
 	}
	
	
 	public ResponseEntity<MoonsDTO> saveAllData(MoonsDTO moonsDto) {
	  valueOfDuplicate(moonsDto);
	  Moons body = saveAllPart(mapper.map(moonsDto, Moons.class));
 		  return ResponseEntity
				  .status(HttpStatus.CREATED)
				  .body(mapper.map(body, MoonsDTO.class));
	}
	
	public Moons saveAllPart(Moons moons) {
		return repository.save(moons);
	}
	
	
	private void valueOfDuplicate(MoonsDTO moonsDto) {
		Moons moonsOne = mapper.map(moonsDto, Moons.class);
		Moons buscarName = repository.findByName(moonsOne.getName());
		if(buscarName !=  null && buscarName.getName() != moonsDto.getName()) {
			throw new ReturnObjectFailedExceptionsMessage("O Satelite natural "+ moonsDto.getName()+" Já está cadastrado em nosso banco");
		}
	}

}