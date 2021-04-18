package com.api.arbolb.apirestarbolb.arbolDB.beans;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Clave {
	
	Integer valorClave;
	String entidad;
	Nodo nodoIzquierda;
	Nodo nodoDerecha;
	
	public Clave(Integer valorClave, String objetoAAlmacenar) {
		this.valorClave = valorClave;
		this.entidad = objetoAAlmacenar;
		this.nodoIzquierda = new Nodo();
		this.nodoDerecha = new Nodo();
	}
}