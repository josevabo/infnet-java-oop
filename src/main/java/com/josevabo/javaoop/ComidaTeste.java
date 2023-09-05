package com.josevabo.javaoop;

import com.josevabo.javaoop.model.Comida;

import java.util.ArrayList;
import java.util.List;

public class ComidaTeste {

	public static void main(String[] args) {

		List<Comida> comidas = new ArrayList<Comida>();
		comidas.add(new Comida(.500f, false, "feijao, arroz, batata frita, figado, cebola", "Executivo de Fígado Acebolado", 19.99f, 127849));
		comidas.add(new Comida(.350f, false, "frango, batata, alho", "Caldo de galinha", 12f, 984890));
		comidas.add(new Comida(1.1f, false, "picanha, linguiça toscana, aipim", "Churrasco misto", 89.99f, 748392));
		comidas.add(new Comida(.550f, true, "shimeji, macarrao, alecrim", "Macarrão vegano com shimeji", 38.99f, 567483));
		comidas.get(0).incluirTag("tradicional");
		comidas.get(1).incluirTag("sopas");
		comidas.forEach(c -> System.out.println(c.imprimirResumo()));
	}
}
