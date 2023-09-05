package com.josevabo.javaoop;

import com.josevabo.javaoop.model.Bebida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArquivoTeste {
    public static void main(String[] args) {
        File arquivoEntrada = new File("entrada.txt");
		String pathSaida = "saida.txt";

		try(
			Scanner dadosEntrada = new Scanner(arquivoEntrada);
			BufferedWriter arquivoSaida = new BufferedWriter(new FileWriter(pathSaida))
		) {
			System.out.println("Dados no arquivo de entrada:");
            List<Bebida> bebidas = new ArrayList<>();
			while(dadosEntrada.hasNextLine()) {
				String linha = dadosEntrada.nextLine();
				System.out.println(linha);
				String[] campos = linha.split(",");
                Bebida bebida = new Bebida(Boolean.valueOf(campos[0]), Float.valueOf(campos[1]), campos[2], campos[3], Float.valueOf(campos[4]), Integer.valueOf(campos[5]));
                bebidas.add(bebida);
			}

			System.out.println("\n\nARQUIVO DE SAIDA");
			System.out.println("\nLista de bebidas obtidas no arquivo de entrada entrada:");
			arquivoSaida.write("Lista de bebidas obtidas no arquivo de entrada entrada:\n");

			for(Bebida bebida : bebidas) {
				arquivoSaida.write(bebida.imprimirResumo() + "\n");
				System.out.println(bebida.imprimirResumo());
			}

			arquivoSaida.flush();

		} catch (IOException e) {
			System.out.println("Erro no processamento de arquivos");
			System.out.println(e.getMessage());
		}


    }
}
