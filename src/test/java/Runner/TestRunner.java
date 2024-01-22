package Runner;


import org.testng.TestNG ;

import java.util.ArrayList;
import java.util.List;


public class TestRunner {
    public static void main(String[] args) {
        // Create an object for TestNG
        TestNG objTNG = new TestNG();

        // define a list
        List<String> suite = new ArrayList<String>();
        // add the testNG xml files

        suite.add("C:\\Java\\RetailFramework\\testng.xml");

        // set the suites to run
        objTNG.setTestSuites(suite);

        // call the run method
        objTNG.run();



    }

}
