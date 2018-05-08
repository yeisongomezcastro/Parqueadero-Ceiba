package parqueadero.ceiba.parqueadero.ceiba;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.com.parqueadero.Parqueadero;

public class ParqueaderoTest {

	@Test
	public void test() {
		
		assertEquals("test ejecutado correctamente", Parqueadero.testear());
	}

}
