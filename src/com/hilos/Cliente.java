package com.hilos;

public class Cliente {

	private String nombre;
	private int[] carroCompra;
	
	public Cliente(String strNombre, int[] is) {
		nombre = strNombre;
		carroCompra = is;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getCarroCompra() {
		return carroCompra;
	}

	public void setCarroCompra(int[] carroCompra) {
		this.carroCompra = carroCompra;
	}
}
