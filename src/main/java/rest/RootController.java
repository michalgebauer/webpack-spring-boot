package rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mi3o on 15. 7. 2017.
 */
@Controller
public class RootController {
    @RequestMapping("/")
    public String greeting(Model model) {
        model.addAttribute("name", "webpack");
        return "index";
    }
}
