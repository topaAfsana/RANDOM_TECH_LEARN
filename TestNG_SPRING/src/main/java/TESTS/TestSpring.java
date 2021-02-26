package TESTS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = { "classpath:spring-test-config.xml" })
public class TestSpring extends AbstractTestNGSpringContextTests {


    @Autowired
    emailGenerator emailGen;

    @Test
    void testSpring(){
        String email= emailGen.generate();
        System.out.println(email);
    }


}
