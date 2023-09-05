package com.josevabo.javaoop;

import java.util.ArrayList;
import java.util.List;

import com.josevabo.javaoop.model.Bebida;

public class BebidaTeste {

	public static void main(String[] args) {

		List<Bebida> bebidas = new ArrayList<>();
		bebidas.add(new Bebida(true, .473f, "Heineken", "Cerveja Heineken Latão", 5.99f, 172635));
		bebidas.add(new Bebida(false, .750f, "Porto", "Vinho Tinto Seco", 39.99f, 256897));
		bebidas.add(new Bebida(true, 2.500f, "Antarctica", "Guaraná Antarctica Garrafa", 10.00f, 3));
		bebidas.forEach(b -> System.out.println(b.imprimirResumo()));
	}

}
