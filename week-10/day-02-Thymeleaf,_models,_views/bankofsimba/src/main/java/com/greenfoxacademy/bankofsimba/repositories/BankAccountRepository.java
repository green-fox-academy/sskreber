package com.greenfoxacademy.bankofsimba.repositories;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends CrudRepository<BankAccount, Long> {
    public BankAccount findOneById(long Id);
}
