package foo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
	App ej= new App();

	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testIsVerdadOk(){
    	
    	boolean actual= ej.isVerdad(); 
    	assertEquals(true, actual);
    }
    
    public void testDevolverDobleError(){
    	
    	int actual = ej.devolverDoble(50); 
    	assertEquals(100, actual);
    }
}
