package qa;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
    @Autowired
    static Test test;

    public static void main(String[] args) {
        test.display();
    }

}
