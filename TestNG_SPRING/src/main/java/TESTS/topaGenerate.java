package TESTS;


import org.springframework.stereotype.Component;

@Component
public class topaGenerate implements emailGenerator{
    @Override
    public String generate() {
        return "Topa sent email to Abraar";
    }
}
