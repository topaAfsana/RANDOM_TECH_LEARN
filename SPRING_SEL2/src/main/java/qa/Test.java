package qa;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("testbean")
public class Test {


    @Autowired
    private Best best;



//    #
    @Value("AFSANA TOPA")
    private String name;

//CONSTRUCTOR INJECTION
//    public Test(String name) {
//        this.name = name;
//    }


    //SETTER INJECTION
//@Value("MR METOO")
//    public void setName(String name) {
//        this.name = name;
//    }

    public void display(){
        System.out.println(name);
    best.state();}





    //    #
//    String color="RED";
//    public void display(){
//System.out.println(color);    }
//    # SETTER GETTER
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
