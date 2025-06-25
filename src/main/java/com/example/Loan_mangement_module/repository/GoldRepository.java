package com.example.Loan_mangement_module.repository;

import com.example.Loan_mangement_module.model.GoldLoan;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface GoldRepository extends MongoRepository<GoldLoan, String> {
    GoldLoan findByCustomerId(String customerId);
}
