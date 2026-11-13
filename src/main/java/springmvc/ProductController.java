package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @RequestMapping("/products")
    @ResponseBody
    public String getProducts() {
        return "Welcome to Product Management!";
    }
}