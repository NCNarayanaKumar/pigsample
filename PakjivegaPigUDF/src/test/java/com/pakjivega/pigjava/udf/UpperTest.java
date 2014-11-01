package com.pakjivega.pigjava.udf;

import java.io.IOException;

import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Upper.
 */
public class UpperTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UpperTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( UpperTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testUpper()
    {
    	try {
    		Tuple tuple = TupleFactory.getInstance().newTuple();
        	tuple.append("John");
        	assertEquals("JOHN", new Upper().exec(tuple) );
        	
        	Tuple tuple2 = TupleFactory.getInstance().newTuple();
        	tuple2.append("");
        	assertEquals("", new Upper().exec(tuple2) );
        	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        assertTrue( true );
    }
}
