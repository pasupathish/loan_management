package com.example.Loan_mangement_module.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "loans")//for
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoldLoan {
    @Id
    private String id;                                        //field
    private String customerId;
    private String customerName;
    private String customerPAN;
    private int customerADHAAR;
    private String customerAddress;
    private String type; //GOLD, PERSONAL, HOME
    private BigDecimal amount;
    private BigDecimal goldGrams; //for GOLD loan purpose
    private BigDecimal interestRate;
    private int tenure; // in months
    private BigDecimal emi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPAN() {
        return customerPAN;
    }

    public void setCustomerPAN(String customerPAN) {
        this.customerPAN = customerPAN;
    }

    public int getCustomerADHAAR() {
        return customerADHAAR;
    }

    public void setCustomerADHAAR(int customerADHAAR) {
        this.customerADHAAR = customerADHAAR;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getGoldGrams() {
        return goldGrams;
    }

    public void setGoldGrams(BigDecimal goldGrams) {
        this.goldGrams = goldGrams;
    }



    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getEmi() {
        return emi;
    }

    public void setEmi(BigDecimal emi) {
        this.emi = emi;
    }
    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status; // APPROVED, REJECTED

}
