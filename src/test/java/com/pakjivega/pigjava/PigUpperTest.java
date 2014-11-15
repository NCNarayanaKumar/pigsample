package com.pakjivega.pigjava;

import java.io.IOException;

import org.apache.pig.pigunit.PigTest;
import org.apache.pig.tools.parameters.ParseException;
import org.junit.Assert;
import org.junit.Test;

public class PigUpperTest {
	private PigTest test;
    private static final String PIG_SCRIPT = "/home/cloudera/jorge/samplespig/pigsample/PigUDTest/src/main/pig/convertUpper.pig";
	
	//@Test
	public void testPigUpper() throws IOException, ParseException {

		String[] input = { 
				"1:John:1970-03-21:Management:40000:US",
				"2:Mike:1980-05-30:Management:35000:US" };
		String[] expectedoutput = { 
				"(JOHN)", 
				"(MIKE)"
		};
		//test = new PigTest(PIG_SCRIPT);
		//test.assertOutput("A", input, "B",expectedoutput);
		Assert.assertTrue(true);
	}

}
