package com.api.moons.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Moons {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String planetaMae;
	private String semieixoMaior;
	private String pressaoAtmosferica;
	private Integer massa;
	private String periodoDeRotacao;
	private String periodoOrbital;
	private String inclinacao;
	private Double velocidadeOrbitalMedia;

	public Moons() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlanetaMae() {
		return planetaMae;
	}

	public void setPlanetaMae(String planetaMae) {
		this.planetaMae = planetaMae;
	}

	public String getSemieixoMaior() {
		return semieixoMaior;
	}

	public void setSemieixoMaior(String semieixoMaior) {
		this.semieixoMaior = semieixoMaior;
	}

	public String getPressaoAtmosferica() {
		return pressaoAtmosferica;
	}

	public void setPressaoAtmosferica(String pressaoAtmosferica) {
		this.pressaoAtmosferica = pressaoAtmosferica;
	}

	public Integer getMassa() {
		return massa;
	}

	public void setMassa(Integer massa) {
		this.massa = massa;
	}

	public String getPeriodoDeRotacao() {
		return periodoDeRotacao;
	}

	public void setPeriodoDeRotacao(String periodoDeRotacao) {
		this.periodoDeRotacao = periodoDeRotacao;
	}

	public String getPeriodoOrbital() {
		return periodoOrbital;
	}

	public void setPeriodoOrbital(String periodoOrbital) {
		this.periodoOrbital = periodoOrbital;
	}

	public String getInclinacao() {
		return inclinacao;
	}

	public void setInclinacao(String inclinacao) {
		this.inclinacao = inclinacao;
	}

	public Double getVelocidadeOrbitalMedia() {
		return velocidadeOrbitalMedia;
	}

	public void setVelocidadeOrbitalMedia(Double velocidadeOrbitalMedia) {
		this.velocidadeOrbitalMedia = velocidadeOrbitalMedia;
	}

}
