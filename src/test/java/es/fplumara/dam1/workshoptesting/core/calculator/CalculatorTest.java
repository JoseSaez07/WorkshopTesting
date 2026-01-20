package es.fplumara.dam1.workshoptesting.core.calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	
	private static Calculator calculator;
	

	public static void setUp() {

	        calculator = new Calculator();

	    }

	@Test
	public void divisionEnteraPorero(){
	IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {

	            calculator.divide(4,0);

	        });

	        assertEquals("División por cero no permitida",ex.getMessage());

	    }
	 

    }
