package dojo;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class Bogus {
	
	@Test
	public void umADezenove() {
		String[] nomes = {
				"zero",
				"um",
				"dois",
				"tres",
				"quatro",
				"cinco",
				"seis",
				"sete",
				"oito",
				"nove",
				"dez",
				"onze",
				"doze",
				"treze",
				"quatorze",
				"quinze",
				"dezesseis",
				"dezessete",
				"dezoito",
				"dezenove"
		};
		
		for (int i = 0; i < nomes.length; i++) {
			assertEquals(nomes[i], new Numero(i).toString());
		}
	}
	
	@Test
	public void testaDezEmDezApartirDoVinte() {
		assertEquals("vinte", new Numero(20).toString());
	}	
	
	@Test
	public void naCasaDosVinte() {
		assertEquals("vinte e um", new Numero(21).toString());
		assertEquals("vinte e dois", new Numero(22).toString());
	}
	
	@Test
	public void naCasaDosCem() {
		assertEquals("cem", new Numero(100).toString());
		assertEquals("duzentos e vinte", new Numero(220).toString());
	}	

}
