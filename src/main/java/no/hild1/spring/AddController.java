package no.hild1.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {

    @RequestMapping(value = "/add", method=RequestMethod.GET)
    public String addGet(Model model) {
		model.addAttribute("req", "GET");
        return "add";
    }

	@RequestMapping(value = "/add", method=RequestMethod.POST)
    public String addPost(Model model) {
		model.addAttribute("req", "POST");
        return "add";
    }

}
