package Quest3Test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Quest3Test {

	

		@Test
		public void evaluatesExpression() {
			Room r = new Room();
			
			
			String pr = r.bed("7");
			
			assertEquals("7",pr);
			
		}
	}
	

