package tutorial.exception.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ks on 15. 8. 16.
 */
@Controller
public class BasicExceptionsController {

    @RequestMapping("/occurError")
    public String occurError() {
        throw new Error("Error!");
    }

    @RequestMapping("/occurException")
    public String occurException() throws Exception {
        throw new Exception("Exception!");
    }

    @RequestMapping("/occurRuntimeException")
    public String occurRuntimeException() {
        throw new RuntimeException("RuntimeException!");
    }
}
