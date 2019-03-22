package br.senaigo.TesteJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTemperaturaCelsius {
	
	@Before
	public void construct()
	{
		TemperaturaCelsius t = new TemperaturaCelsius(5.0);
	}
	
	@Test
	public void converteCelsiusParaFahrenheitTest(){				
		assertEquals(41.0, t. ,0.5);
	}

}
