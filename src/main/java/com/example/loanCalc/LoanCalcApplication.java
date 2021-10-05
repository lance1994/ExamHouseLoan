package com.example.loanCalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*; 
import org.springframework.ui.Model;
import com.example.loanCalc.HouseLoan.*;

@SpringBootApplication
@Controller
public class LoanCalcApplication {
	
	@GetMapping("/")
	public String hello(Model model){
		model.addAttribute("houseLoan", new HouseLoan());
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(LoanCalcApplication.class, args);
	}

}
