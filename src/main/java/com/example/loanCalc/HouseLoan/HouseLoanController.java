package com.example.loanCalc.HouseLoan;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.minidev.json.JSONObject;

@Controller
public class HouseLoanController {

    private final HouseLoanService hlSvc;

    public HouseLoanController(HouseLoanService hlSvc){
        this.hlSvc = hlSvc;
    }

    @GetMapping("/houseloan")
    public String index(Model model) {
        model.addAttribute("houseLoan", new HouseLoan());
        return "index";
    }
    
    @PostMapping("/result")
    public String getPayterm(@ModelAttribute HouseLoan houseLoan, Model model) {
        List<JSONObject> ljson = hlSvc.computePayment(houseLoan);
        
        model.addAttribute("houseLoan", ljson);
        return "result";
    }

}
