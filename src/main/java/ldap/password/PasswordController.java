package ldap.password;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PasswordController {

	@GetMapping("/password")
	public String greetingForm(Model model) {
		model.addAttribute("password", new Password());
		return "password";
	}

	@PostMapping("/password")
	public String greetingSubmit(@ModelAttribute Password password) {
		Process process = new Process(password);
		return "result";
	}

}
