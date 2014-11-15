package com.pakjivega.pigjava;

import java.io.File;
import java.io.IOException;
import org.apache.pig.pigunit.PigTest;
import org.apache.pig.tools.parameters.ParseException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PigGroupTest {
	private static PigTest test;
    private static final String TEST_PATH = "src/test/resources/";
    @BeforeClass
    public static void setUp() throws IOException, ParseException {
        test = new PigTest("src/main/resources/groupbyCountry.pig");
        test.override("employees", "employees = LOAD '" + TEST_PATH +
        	"input/employeestest.txt' USING PigStorage(':') AS (id:int,name:chararray,dob:chararray,dept:chararray,salary:int,country:chararray);");
    }
    @Test
	public void testPigGroup() throws IOException, ParseException{
    	test.assertOutput("EGO", new File(TEST_PATH + "results/employeestestgroupcountry.txt"));
		Assert.assertTrue(true);
	}
}