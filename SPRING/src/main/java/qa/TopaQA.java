package qa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;


//@ComponentScan(basePackages = "java.qa.*")
//@EnableAutoConfiguration
//@ContextConfiguration(locations = {"classpath:qa-context.xml"})
//@ContextConfiguration("/qa-context.xml")
//@SpringBootApplication
public class TopaQA {
    @Autowired
    public static Test test;

    static String topa="123";



    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("qa-context");
        Test test=context.getBean("test1",Test.class);


        System.out.println(test);
        System.out.println(topa);
        test.setName("Afsana");
        System.out.println(test.getName());
    }
    public void test1(){

    }
}
