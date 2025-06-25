package com.example.Loan_mangement_module.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Document(collection = "personal_loans")//FILE inside loan management
@Data //lampock for getter and setter
@AllArgsConstructor// for  sending fields as parameter in a constructor(3/7.10)
@NoArgsConstructor// if no arguments where passes it should work

public class PersonalLoan
{
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
    private BigDecimal homeCost; //for HOME loan purpose
    private BigDecimal interestRate;
    private int tenure; // in months
    private BigDecimal emi;
    private String status; // APPROVED, REJECTED

}
