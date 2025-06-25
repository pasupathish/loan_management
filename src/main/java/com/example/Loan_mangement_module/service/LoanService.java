package com.example.Loan_mangement_module.service;

import com.example.Loan_mangement_module.model.GoldLoan;
import com.example.Loan_mangement_module.repository.GoldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;

@Service// business logic  and provide service
public class LoanService {
    @Autowired// automatically set dependency injection
    private GoldRepository goldRepository;

    public GoldLoan applyLoan(GoldLoan goldLoan) {
       GoldLoan goldLoan1= new GoldLoan();
       goldLoan1.setCustomerId(goldLoan.getCustomerId());
       goldLoan1.setCustomerName(goldLoan.getCustomerName());
       goldLoan1.setCustomerPAN(goldLoan.getCustomerPAN());
        goldLoan1.setCustomerADHAAR(goldLoan.getCustomerADHAAR());
        goldLoan1.setCustomerAddress(goldLoan.getCustomerAddress());
        goldLoan1.setType(goldLoan.getType());
        goldLoan1.setAmount(goldLoan.getAmount());
        goldLoan1.setGoldGrams(goldLoan.getGoldGrams());
        goldLoan1.setInterestRate(goldLoan.getInterestRate());
        goldLoan1.setEmi(goldLoan.getEmi());
 return goldRepository.save(goldLoan);
    }
    public List<GoldLoan> getAllLoans() {
        return goldRepository.findAll();
    }
    public Optional<GoldLoan> getLoanById(String id) {
        return goldRepository.findById(id);
    }
    public GoldLoan updateLoanStatus(String id, String status) {
        GoldLoan goldLoan = goldRepository.findById(id).orElseThrow();
        goldLoan.setStatus(status);
        return goldRepository.save(goldLoan);
    }
    public GoldLoan getLoansByCustomerId(String customerId) {
        return goldRepository.findByCustomerId(customerId);
    }
}
