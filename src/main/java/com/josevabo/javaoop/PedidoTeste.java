package com.josevabo.javaoop;

import com.josevabo.javaoop.model.*;

public class PedidoTeste {

	public static void main(String[] args) {

		Solicitante solicitante = new Solicitante("joao", "12345678900", "joao@gmail.com");
		Pedido pedido1 = new Pedido("Pedido 1", solicitante);
		Pedido pedido2 = new Pedido("Pedido 2", solicitante);
		Pedido pedido3 = new Pedido("Pedido 3", solicitante);

		Comida comida1 = new Comida(.500f, false, "feijao, arroz, batata frita, figado, cebola", "Executivo de Fígado Acebolado", 19.99f, 127849);
		Comida comida2 = new Comida(.350f, false, "frango, batata, alho", "Caldo de galinha", 12f, 984890);
		Comida comida3 = new Comida(1.1f, false, "picanha, linguiça toscana, aipim", "Churrasco misto", 89.99f, 748392);
		Comida comida4 = new Comida(.550f, true, "shimeji, macarrao, alecrim", "Macarrão vegano com shimeji", 38.99f, 567483);
		comida1.incluirTag("tradicional");
		comida2.incluirTag("sopas");


		Bebida bebida1 = new Bebida(true, .473f, "Heineken", "Cerveja Heineken Latão", 5.99f, 172635);
		Bebida bebida2 = new Bebida(false, .750f, "Porto", "Vinho Tinto Seco", 39.99f, 256897);
		Bebida bebida3 = new Bebida(true, 2.500f, "Antarctica", "Guaraná Antarctica Garrafa", 10.00f, 3);

		pedido1.adicionarProduto(comida1);
		pedido1.adicionarProduto(bebida1);
		pedido1.adicionarProduto(comida3);
		pedido2.adicionarProduto(comida2);
		pedido2.adicionarProduto(bebida2);
		pedido3.adicionarProduto(bebida3);
		pedido3.adicionarProduto(comida4);


		System.out.println(pedido1.toString());
		System.out.println(pedido1.toString());
		System.out.println(pedido1.toString());
	}
}