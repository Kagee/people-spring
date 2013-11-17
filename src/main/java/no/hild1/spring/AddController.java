package no.hild1.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AddController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String displayAddForm(
			Person person,
			@RequestParam(value = "posted", defaultValue = "false") String posted) {
		return "add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addData(@Valid Person person, BindingResult result,
			RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return "add";
		}
		/*
		 * On successful post, redirect to GET and pass a temporary message this
		 * means that we will not double-post by refreshing.
		 */
		redirectAttributes.addFlashAttribute("posted", "true");
		return "redirect:/add";
	}
}
