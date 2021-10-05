package com.example.loanCalc.HouseLoan;

import org.springframework.stereotype.Service;

import net.minidev.json.JSONObject;

import java.util.*;

@Service
public class HouseLoanService {
    
    public HouseLoanService(){

    }

    // logic for payment terms computation
    public List<JSONObject> computePayment(HouseLoan houseLoan){
        List<JSONObject> payterm = new ArrayList<JSONObject>();
        Float loan;
        Float mthPay;
        Integer period;
        Float rate;
        Float due;

        loan = houseLoan.getLoanAmt();
        period = houseLoan.getTerm()*12;
        mthPay = loan/period;
        rate = houseLoan.getIntrRate();

        for(int i = 1; i<=period; i++){
            JSONObject pay = new JSONObject();
            due = mthPay + (loan*rate);
            loan = loan - mthPay;
            pay.put("period", i);
            pay.put("mthPay", mthPay);
            pay.put("intr", (loan*rate));
            pay.put("payment", due);
            pay.put("loanAmt", loan);

            payterm.add(pay);
        }

        return payterm;
    }
}
