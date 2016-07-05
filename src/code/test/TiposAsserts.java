package code.test;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;


public class TiposAsserts {

	@Test
	public void testAssertArrayEquals() {
		assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
		assertArrayEquals(new Double[]{1.1,2.2,3.3},new Double[]{1.1,2.2,3.3});
	}
	
	@Test
    public void testAssertEquals(){
         
        String expectedName = "Ana";
        assertEquals(expectedName, "Ana");
        
        int expectedNumber = 4;
        assertEquals(expectedNumber, 4);
       		
    }
	
	@Test
    public void testAssertFalse(){
         
        Boolean expectedFalse = false;
        Boolean expectedFalseComparison = 3 < 1;
        
        assertFalse(expectedFalse);
        assertFalse(expectedFalseComparison);                       		
    }
	
	@Test
    public void testAssertNoEquals(){
		int expected = 2;
		int actual = 4;
		int delta = 0;  
		        
        assertNotEquals(expected, actual,delta);
        
        Double expected2 = 2.6;
		Double actual2 = 2.4;
		Double delta2 = 0.1;  
		
        assertNotEquals("not Equals",expected2, actual2,delta2);                       		
    }
	
	@Test
    public void testAssertNoNull(){		        		
		Double notNull = 2.4;
				                 	
        assertNotNull(notNull);                       		
    }
	
	@Test
    public void testAssertNotSame(){		        		
		String str1 = new String ("abc");     
	    String str2 = null;
				                 	
        assertNotSame(str1, str2);                       		
    }
	
	@Test
    public void testAssertNull(){		        		
		Double nullVal = null;
				                 	
        assertNull(nullVal);                       		
    }
	
	@Test
    public void testAssertSame(){		        		
		String str1 = new String ("abc");
		String str2 = str1;
				                 	
        assertSame(str1, str1);
        assertSame(str1, str2);
    }
	
	@Test
    public void testAssertThat(){		        		
		int number = 3;
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		assertThat("Cero no es uno", 0, is(not(1)));
		assertThat(number, is(3));
		assertThat(number, is(not(4)));
		assertThat(list, hasItem("3"));
    }
	
	@Test
	public void testAssertTrue(){
	     
	    Boolean expectedTrue = true;
	    Boolean expectedTrueComparison = (true && expectedTrue);
	        
	    assertTrue(expectedTrue);
	    assertTrue(expectedTrueComparison);                       	
	}
			
}