package com.pakjivega.pigjava.udf;

import java.io.IOException;

import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;

import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Upper.
 */
public class UpperTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UpperTest(  )
    {
        
    }

    /**
     * @return the suite of tests being tested
     */
//    public static Test suite()
//    {
//        return new TestSuite( UpperTest.class );
//    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testUpper()
    {
    	try {
    		Tuple tuple = TupleFactory.getInstance().newTuple();
        	tuple.append("John");
        	Assert.assertEquals("JOHN", new Upper().exec(tuple) );
        	
        	Tuple tuple2 = TupleFactory.getInstance().newTuple();
        	tuple2.append("");
        	Assert.assertEquals("", new Upper().exec(tuple2) );
        	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
