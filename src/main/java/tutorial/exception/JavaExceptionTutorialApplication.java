package tutorial.exception;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaExceptionTutorialApplication {

    public static void main(String[] args) throws Exception {
//        SpringApplication.run(JavaExceptionTutorialApplication.class, args);
//        throw new Exception("this is a Exception");
//        throw new RuntimeException("this is a RuntimeException");
        throw new Error("this is an Error");
    }
}
