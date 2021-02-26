package qa;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Best {
    @Value("BEST")
    String comp;
    public void state(){
        System.out.println(comp);
    }
}
