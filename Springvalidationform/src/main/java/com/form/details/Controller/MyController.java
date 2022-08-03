package com.form.details.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.form.details.entity.Login;




@Controller
public class MyController {

	
	@GetMapping("/form")
	public String openfrom(Model model)
	{
		model.addAttribute("login", new Login());
		return "form";
	}
	
	//handler for process form
	@PostMapping("/process")
	public String processform(@Valid @ModelAttribute("login") Login login, BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println(result);
			return "form";
		}
		return "success";
	}
}
