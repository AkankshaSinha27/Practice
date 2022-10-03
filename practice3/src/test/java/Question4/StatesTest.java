package Question4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatesTest {


		@Test
		public void evaluatesExpression() {
			Bihar bi = new Bihar();
			
			String testcase1 = bi.Area();    
			String testcase11 = bi.Dance();      
			assertEquals("Bihar",testcase1);
			assertEquals("Normal",testcase11);
			
			
			TamilNadu ta = new TamilNadu();
			String testcase2 = ta.Area();
			String testcasedraw22  = ta.Dance();      
			assertEquals("TamilNadu",testcase2);
			assertEquals("Khuchuouri",testcasedraw22);
			
			
			Himachal hi = new Himachal();
			String testcase4 = hi.Area();
			String testcasedraw44  = hi.Dance();      
			assertEquals("Himachal",testcase4);
			assertEquals("bhangra",testcasedraw44);
		}

}
