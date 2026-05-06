package com.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
    	
    	
    	// Creacion del mapa a partir del listado de argumentos
    	//Es de tipo Long , porque Collectors.counting() devuelve Long
    	//stream().collect ->_ devuelve una lista de colecciones
    	
    	// Variante #1 de creacion del mapa a partir de recorrer el listado de argumentos
    	// utilizando Operaciones de Agregado (Tuberia, metodos de la clase Stream, lambdas,
        //metodos por referencia, en fin. Programacion Funcional)    	 
    	
    	//Map<String,Long> m = listadoDeArgumentos.stream().
    	//		collect(Collectors.groupingBy(nombre -> nombre,Collectors.counting()));
    	
    	//System.out.println("Mapa resultante: "+ m);
    	
    	//Function.identity() --> lo que va entrando lo dejo igual: en este caso nombre
    	Map<String,Long> m = null;
    	
    	m=listadoDeArgumentos.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    	System.out.println("Mapa resultante:  "+m);
    	
    	
    	Map<String,Long> m2 = listadoDeArgumentos.stream().
    			collect(Collectors.groupingBy(nombre -> nombre,Collectors.counting()));
    	
    	System.out.println("Mapa resultante:  "+m2);
    }
}
