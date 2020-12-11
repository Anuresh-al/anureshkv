package web.application.phaseone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndustryController {
@RequestMapping("/industry.html")
public String industry() {
	return"industry";
}
}
