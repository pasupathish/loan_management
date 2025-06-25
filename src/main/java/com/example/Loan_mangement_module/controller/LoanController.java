package com.example.Loan_mangement_module.controller;

import com.example.Loan_mangement_module.model.GoldLoan;
import com.example.Loan_mangement_module.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//
@RequestMapping("/api/loans/gold")//for mappings
public class LoanController {

    @Autowired//call method without object
    private LoanService loanService;

    @PostMapping("/apply")// store values
    public GoldLoan applyLoan(@RequestBody GoldLoan goldLoan) {
        return loanService.applyLoan(goldLoan);
    }

    @GetMapping("/all")// take value from the db  types  get a
    public List<GoldLoan> getAllLoan() {
        return loanService.getAllLoans();
    }

    // fetch loans by customerId
    @GetMapping("/{customerId}")//
    public GoldLoan getLoansByCustomerId(@PathVariable String customerId) {
        GoldLoan goldLoans = loanService.getLoansByCustomerId(customerId);
        return goldLoans;
    }

}
