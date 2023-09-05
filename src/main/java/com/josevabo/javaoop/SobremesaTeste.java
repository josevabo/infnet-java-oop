package com.josevabo.javaoop;

import java.util.ArrayList;
import java.util.List;

import com.josevabo.javaoop.model.Sobremesa;

public class SobremesaTeste {

	public static void main(String[] args) {

		List<Sobremesa> sobremesas = new ArrayList<Sobremesa>();
		sobremesas.add(new Sobremesa(200f, true, "Brownie", "Brownie de chocolate", 10.00f, 839405));
		sobremesas.add(new Sobremesa(400f, true, "Sorvete com duas bolas", "Sorvete de manga", 8.0f, 374859));
		sobremesas.add(new Sobremesa(150f, true, "Doce a base de leite", "Doce de leite", 4.00f, 748595));
		sobremesas.add(new Sobremesa(100f, true, "Amendoim torrado com casca", "Amendoim torrado", 3.50f, 384950));

        sobremesas.forEach(Sobremesa::imprimirResumo);
		sobremesas.forEach(s -> System.out.println(s.imprimirResumo()));

	}
}
