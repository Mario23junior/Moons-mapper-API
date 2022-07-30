package com.api.moons.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.moons.dto.MoonsDTO;
import com.api.moons.service.MoonsService;

@RestController
@RequestMapping("/api/moons")
public class MoonsController {
   
	private MoonsService service;
	
	public MoonsController(MoonsService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<MoonsDTO> listAll() {
		return service.listAllData();
	}
	
	@PostMapping
	public ResponseEntity<MoonsDTO> saveAll(@RequestBody MoonsDTO moonsDto){
		return service.saveAllData(moonsDto);
	}
}
