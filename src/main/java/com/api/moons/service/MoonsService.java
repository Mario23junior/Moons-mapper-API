package com.api.moons.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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

}
