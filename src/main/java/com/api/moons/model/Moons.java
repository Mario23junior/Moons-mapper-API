package com.api.moons.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Moons {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 30, nullable = false)
	private String name;

	@Column(length = 30, nullable = false)
	private String planetaMae;

	@Column(length = 40, nullable = false)
	private String semieixoMaior;

	@Column(length = 200, nullable = false)
	private String pressaoAtmosferica;

	private Integer massa;

	@Column(length = 40, nullable = false)
	private String periodoDeRotacao;

	@Column(length = 200, nullable = false)
	private String periodoOrbital;

	@Column(length = 200, nullable = false)
	private String inclinacao;

	private Double velocidadeOrbitalMedia;

	public Moons() {
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
