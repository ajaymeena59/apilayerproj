package com.apis.apilayerproj.models;

public class FlightInfo {

	private String number;
	private String iata;
	private String icao;
	private Codeshared codeshared;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getIcao() {
		return icao;
	}
	public void setIcao(String icao) {
		this.icao = icao;
	}
	public Codeshared getCodeshared() {
		return codeshared;
	}
	public void setCodeshared(Codeshared codeshared) {
		this.codeshared = codeshared;
	}
	@Override
	public String toString() {
		return "FlightInfo [number=" + number + ", iata=" + iata + ", icao=" + icao + ", codeshared=" + codeshared
				+ "]";
	}

	
}
