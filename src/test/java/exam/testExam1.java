package exam;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testExam1 {

	@Parameters
	public static List<Integer> valores(){
		Integer[] valores = {1, 2, 3, 4};
		
		return Arrays.asList(valores);
	}
	
	@Test
	public void testexam() {
		/*boolean resultado, esperado;
		resultado = exam1.exam(3)
		esperado = true;
		assertEquals(esperado, resultado);*/
		List<Boolean> resultado = new ArrayList<Boolean>(Arrays.asList(new Boolean[10]));
		for(int i = 0; i <4; i++) {
			resultado.add(exam1.exam(valores().get(i)));
		}
		Object[] expected = {false, false, true, false};
		assertEquals(expected, resultado);
		
		
	}
}
