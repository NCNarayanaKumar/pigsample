package com.pakjivega.pigjava.udf;

import java.io.IOException;

import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;

import org.junit.Assert;
import org.junit.Test;


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
        	
        	Tuple tuple3 = TupleFactory.getInstance().newTuple();
        	tuple3.append("MIKE");
        	Assert.assertEquals("MIKE", new Upper().exec(tuple3) );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
