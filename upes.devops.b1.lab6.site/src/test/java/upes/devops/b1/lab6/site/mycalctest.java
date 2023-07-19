package upes.devops.b1.lab6.site;

import static org.junit.Assert.*;

import org.junit.Test;

public class mycalctest {

	@Test
	public void test() {
		mycalc ob = new mycalc();
		assertEquals(30, ob.sum(10, 20));
		
	}

}
