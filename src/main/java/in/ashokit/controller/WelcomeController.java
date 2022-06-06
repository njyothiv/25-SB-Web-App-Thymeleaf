package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcomeMsg(@RequestParam("name") String name, Model model) {
		String msgTxt = name + ", Welcome to Ashok IT with Thymeleaf working..!!";
		model.addAttribute("msg", msgTxt);
		return "index";
	}
}