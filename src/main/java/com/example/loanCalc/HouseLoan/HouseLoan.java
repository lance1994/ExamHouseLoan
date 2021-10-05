package com.example.loanCalc.HouseLoan;

import java.io.Serializable;

public class HouseLoan implements Serializable{
    private Float loanAmt;
    private Float intrRate;
    private Integer term;

    public HouseLoan(){

    }

    public HouseLoan(String loanAmt, Float intrRate, Integer term){
        loanAmt = loanAmt.replace(",", "");
        this.loanAmt = Float.parseFloat(loanAmt);
        this.intrRate = intrRate;
        this.term = term;
    }

    public void setLoanAmt(String loanAmt){
        System.out.println("SETTING CONT");
        loanAmt = loanAmt.replace(",", "");
        this.loanAmt = Float.parseFloat(loanAmt);
    }

    public Float getLoanAmt(){
        return loanAmt;
    }

    public void setIntrRate(Float intrRate){
        intrRate = (float)(intrRate*.01);
        this.intrRate = intrRate;
    }

    public Float getIntrRate(){
        return intrRate;
    }

    public void setTerm(Integer term){
        this.term = term;
    }

    public Integer getTerm(){
        return term;
    }

    public String toString(){
        return "HouseLoan{" + 
                ",loanAmt=" + loanAmt +
                ",intrRate" + intrRate +
                ",term" + term +
                "}";
    }
}
