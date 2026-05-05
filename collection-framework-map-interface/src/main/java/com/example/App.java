package com.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
	
    public static void main(String[] args) {
   
    	/* ¿Que es un Map interface? o un mapa simplemente 
    	 * 
    	 * Es una coleccion, aunque no hereda de la interfaz Collection, pero se puede
    	 * tratar como tal utilizando las Collections Views (Vista de Colecciones).
    	 * 
    	 * Concretamente un Mapa, es una coleccion , tambien denominado un objeto 
    	 * que relaciona claves con valores, lo que antiguamente se llamaba una estructura 
    	 * hash clave(key) y value, donde las claves no pueden repetirse.
    	 * 
    	 *  Los metodos de ordenamiento y busqueda que son aplicables a las interfaces que 
    	 *  heredan de Collection no son aplicables a la interface Map, por ejemplo 
    	 *  el metodo sort no se le puede aplicar a una mapa.
    	 *  
    	 *  En resumen una Interface Map, mapea(relaciona) claves con valor en un contenedor,
    	 *  que se puede crear de varias formas y recorrer de varias formas tambien. */
    	
    	
    	/* A modo de ejemplo, vamos a crear una coleccion (Map Interface) que almacene
    	 * frecuencia de repeticion/ocurrencia de un array de palabras que se reciben como
    	 *  parametro en el metodo main, cuando se lanza la aplicacion */
    	
    	// Primero: Comprobar si estamos recibiendo el array de nombres en la variable args
    	// cuando se lanza la aplicacion
    	
    	
    	List<String> listadoDeArgumentos = Arrays.asList(args);
    	
    	listadoDeArgumentos.forEach(System.out::println);
    	
    	// Creacion del mapa a partir del listado de argumentos Clave(sera nombre),Valor (veces repite)
    	
    	Map<String,Integer> m = new HashMap<>();
    	
    	//Para agregar entradas al mapa m, recorreremos la lista listadoDeArgumentos 
    	//utilizando una sentencia for mejorada
    	
    	//lo busco por clave y luego miro el valor  (Rodrigo,1), (Javi,1) ... (Rodrigo,2) -->
    	//actualizo el valor , pero la clave no se introduce, la clave no puede estar duplicada
    	
    	Integer frecuenciaOcurrencia =null;
    	
    	for(String nombre: listadoDeArgumentos) {
    		 //comprobar si el nombre, clave ya se encuentra en el mapa m
    		//la primera vez tendra un 1, las siguientes sera +1
    		frecuenciaOcurrencia=m.get(nombre);
    		m.put(nombre, frecuenciaOcurrencia == null ? 1: ++frecuenciaOcurrencia);
    	}
    	
    	System.out.println("Mapa resultante:  "+ m);
    	
    	
    	
    }
}
