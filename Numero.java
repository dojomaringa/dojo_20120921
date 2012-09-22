package dojo;

import java.util.HashMap;
import java.util.Map;

public class Numero {
	private int numero;

	public Numero(int n) {
		this.numero = n;
	}

	private static String[] centenas = {"", "cem", "duzentos" };
	
	private static String[] nomesDeZeroADezenove = { "zero", "um", "dois",
			"tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
			"onze", "doze", "treze", "quatorze", "quinze", "dezesseis",
			"dezessete", "dezoito", "dezenove" };

	private static Map<Integer, String> nomesDeVinteANoventa;
	static {
		nomesDeVinteANoventa = new HashMap<Integer, String>();
		nomesDeVinteANoventa.put(2, "vinte");
	}

	private int dezena() {
		return (numero / 10);
	}

	private int unidade() {
		return numero % 10;
	}
	
	private int centena() {
		return numero / 100;
	}

	public String toString() {
		if (numero < 20) {
			return imprimeMenorQueVinte();
		} else if (numero < 100) {
			return imprimeDezena();
		} else {
			return imprimeCentena();
		}
	}

	private String imprimeDezena() {
		int u = unidade();
		int d = dezena();

		if (u == 0)
			return nomesDeVinteANoventa.get(d);

		return nomesDeVinteANoventa.get(d) + " e " + nomesDeZeroADezenove[u];
	}

	private String imprimeMenorQueVinte() {
		return nomesDeZeroADezenove[numero];
	}

	private String imprimeCentena() {
		
		String dezena = imprimeDezena();
		
		if (dezena != null) {
			return centenas[centena()] + " e " + imprimeDezena();
		}
		return centenas[centena()];
	}

}
