package qa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

//@ContextConfiguration(locations ="qa-context.xml")
public class SpringRunnerClass {

    public static void main(String[] args) {
        //1)XML BASED RUNNER
        ApplicationContext context=new ClassPathXmlApplicationContext("qa-context.xml");


        //2)ANNOTATION BASED RUNNER
//        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigClass.class);


        Test test=context.getBean("testbean",Test.class);

        test.display();
    }
}
