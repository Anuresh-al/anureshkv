package web.application.phaseone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UpdateController {
	@RequestMapping("/updates.html")
public String update() {
	return "updates.html";
}
}
