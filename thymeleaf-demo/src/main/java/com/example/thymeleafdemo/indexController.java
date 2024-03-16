package com.example.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class indexController {
	
/*	@Autowired
	private BookingRepository bookrepo;*/
	

	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@PostMapping("/booking")
	public String userBooking(@ModelAttribute UserBook ub, Model model) {
		System.out.println(ub.toString());
		System.out.println(ub.getName());
		System.out.println(ub.getNum());
		System.out.println(ub.getDate());
		System.out.println(ub.getTime());
		model.addAttribute("name", ub.getName());
		model.addAttribute("num", ub.getNum());
		model.addAttribute("date", ub.getDate());
		model.addAttribute("time", ub.getTime());
		
		/*UserBook ub_inserted = bookrepo.save(ub);
		model.addAttribute("message", ub_inserted.getName() + "inserted.");*/
		
		return "welcome";
	}


}


