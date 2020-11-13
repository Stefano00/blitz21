package com.blitz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.blitz.model.Mazo;

public class Service {
	
	public static int ingresoCarta() {
		Scanner sc = new Scanner(System.in);
		int nuevaCarta = sc.nextInt();
		return nuevaCarta;
	}
	
	public static Mazo inicioMazo() {
			Mazo mazo = new Mazo(4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4);
			int cont = mazo.getA()+mazo.getDos()+mazo.getTres()+mazo.getCuatro()+mazo.getCinco()+mazo.getSeis()+mazo.getSiete()+mazo.getOcho()+mazo.getNueve()+mazo.getDiez()+mazo.getOnce()+mazo.getDoce()+mazo.getTrece();
			System.out.println(cont);
		
		return mazo;
	}
	
	public static void juego() {
		Mazo mazo = new Mazo();
		mazo= inicioMazo();
		int carta=-1;
		while(carta!=0) {
			System.out.println("Ingrese carta ");
			carta = ingresoCarta();
			System.out.println("Carta ingresada "+ carta);
			switch (carta) {
			case 1:
				mazo.setA(mazo.getA()-1);
				break;
			case 2:
				mazo.setDos(mazo.getDos()-1);
				break;
			case 3:
				mazo.setTres(mazo.getTres()-1);
				break;
			case 4:
				mazo.setCuatro(mazo.getCuatro()-1);
				break;
			case 5:
				mazo.setCinco(mazo.getCinco()-1);
				break;
			case 6:
				mazo.setSeis(mazo.getSeis()-1);
				break;
			case 7:
				mazo.setSiete(mazo.getSiete()-1);
				break;
			case 8:
				mazo.setOcho(mazo.getOcho()-1);
				break;
			case 9:
				mazo.setNueve(mazo.getNueve()-1);
				break;
			case 10:
				mazo.setDiez(mazo.getDiez()-1);
				break;
			case 11:
				mazo.setOnce(mazo.getOnce()-1);
				break;
			case 12:
				mazo.setDoce(mazo.getDoce()-1);
				break;
			case 13:
				mazo.setTrece(mazo.getTrece()-1);
				break;

			default:
				break;
			}
			
			System.out.println(mazo.toString());
			
		}
		
		
	}

	public static void mesa() {
		List<Integer> lista1 = new ArrayList<Integer>();
		List<Integer> lista2 = new ArrayList<Integer>();
		List<Integer> lista3 = new ArrayList<Integer>();
		List<Integer> lista4 = new ArrayList<Integer>();
		
		
		
	}
	
}
