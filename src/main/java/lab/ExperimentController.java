package lab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExperimentController {
    @RequestMapping(value = "/experiment", method = RequestMethod.GET)
    public String getResults(Model model) {
        model.addAttribute("cheese_result", "134");
        return "results";
    }
}
