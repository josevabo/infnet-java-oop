package com.josevabo.javaoop;

import com.josevabo.javaoop.model.Solicitante;

public class SolicitanteTeste {

	public static void main(String[] args) {

		Solicitante solicitante1 = new Solicitante("Maria", "123456748900", "valido@gmail.com");
		Solicitante solicitante2 = new Solicitante("Joao", "123456748900", "valido@yahoo.com");

		System.out.println(solicitante1);
		System.out.println(solicitante2);
		//exceção abaixo - EmailInvalidoException
//		Solicitante solicitante3 = new Solicitante("Jose", "123456748900", "invalido.gmail.com");
	}
}
