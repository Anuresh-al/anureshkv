package web.application.phaseone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	@Autowired
	ShopperRepository repository;
	
	@RequestMapping("details")
	public String getdetails(Shopper shoper) {
		repository.save(shoper);
		return "index";
	}
}
