package com.api.arbolb.apirestarbolb.arbolDB.beans;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Nodo {
	
	List<Clave> listaClave = new ArrayList<>();
	int tamanoActual;
	boolean tipoNodoClave;
	
	public Nodo(Integer valor, String entidadAlmacenar) {
		tipoNodoClave = true;
		tamanoActual = 1;
		listaClave.add(new Clave(valor, entidadAlmacenar));
	}
	
	public Nodo(Clave clave) {
		super();
		listaClave.add(clave);
		this.tamanoActual = 1;
	}
}
