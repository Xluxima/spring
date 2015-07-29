package prj.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/*****************
 *
 * @author Alex
 *
 ****************/

@Controller
@RequestMapping({"/", "/homepage"})
public class HomeController {

	@RequestMapping(method = GET)
	public String home() {
		return "home";
	}
	
}
