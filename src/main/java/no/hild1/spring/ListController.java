package no.hild1.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListController {

    @RequestMapping("/list")
    public String greeting(Model model) {
        model.addAttribute("list", "A List Apart");
        return "list";
    }

}
