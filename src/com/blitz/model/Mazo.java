package com.blitz.model;

public class Mazo {
	
	private int A;
	private int dos;
	private int tres;
	private int cuatro;
	private int cinco;
	private int seis;
	private int siete;
	private int ocho;
	private int nueve;
	private int diez;
	private int once;
	private int doce;
	private int trece;
	
	
	public Mazo() {
		
	}
	
	public Mazo(int a, int dos, int tres, int cuatro, int cinco, int seis, int siete, int ocho, int nueve, int diez,
			int once, int doce, int trece) {
		super();
		A = a;
		this.dos = dos;
		this.tres = tres;
		this.cuatro = cuatro;
		this.cinco = cinco;
		this.seis = seis;
		this.siete = siete;
		this.ocho = ocho;
		this.nueve = nueve;
		this.diez = diez;
		this.once = once;
		this.doce = doce;
		this.trece = trece;
	}
	
	public int getA() {
		return A;
	}
	public void setA(int a) {
		A = a;
	}
	public int getDos() {
		return dos;
	}
	public void setDos(int dos) {
		this.dos = dos;
	}
	public int getTres() {
		return tres;
	}
	public void setTres(int tres) {
		this.tres = tres;
	}
	public int getCuatro() {
		return cuatro;
	}
	public void setCuatro(int cuatro) {
		this.cuatro = cuatro;
	}
	public int getCinco() {
		return cinco;
	}
	public void setCinco(int cinco) {
		this.cinco = cinco;
	}
	public int getSeis() {
		return seis;
	}
	public void setSeis(int seis) {
		this.seis = seis;
	}
	public int getSiete() {
		return siete;
	}
	public void setSiete(int siete) {
		this.siete = siete;
	}
	public int getOcho() {
		return ocho;
	}
	public void setOcho(int ocho) {
		this.ocho = ocho;
	}
	public int getNueve() {
		return nueve;
	}
	public void setNueve(int nueve) {
		this.nueve = nueve;
	}
	public int getDiez() {
		return diez;
	}
	public void setDiez(int diez) {
		this.diez = diez;
	}
	public int getOnce() {
		return once;
	}
	public void setOnce(int once) {
		this.once = once;
	}
	public int getDoce() {
		return doce;
	}
	public void setDoce(int doce) {
		this.doce = doce;
	}
	public int getTrece() {
		return trece;
	}
	public void setTrece(int trece) {
		this.trece = trece;
	}

	@Override
	public String toString() {
		return "Mazo [A=" + A + ", dos=" + dos + ", tres=" + tres + ", cuatro=" + cuatro + ", cinco=" + cinco
				+ ", seis=" + seis + ", siete=" + siete + ", ocho=" + ocho + ", nueve=" + nueve + ", diez=" + diez
				+ ", once=" + once + ", doce=" + doce + ", trece=" + trece + "]";
	}
	
	
	
	

}
