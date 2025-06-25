package com.example.Loan_mangement_module.repository;

import com.example.Loan_mangement_module.model.PersonalLoan;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

    public interface PersonalRepository extends MongoRepository<PersonalLoan, String> {
        List<PersonalLoan> findByCustomerId(String customerId);
}
