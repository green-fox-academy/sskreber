package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BankAccountService {

    BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void createBankAccount(String name, double balance, String animalType) {
        BankAccount bankAccount = new BankAccount(name, balance, animalType);
        bankAccountRepository.save(bankAccount);
    }

    public BankAccount getUser(long Id) {
        return bankAccountRepository.findOneById(Id);
    }

    public static void main(String[] args, Model model) {
        List<BankAccount> accounts = new ArrayList<>();
        BankAccount bankAccount1 = new BankAccount("Simba", 2000, "lion");
        accounts.add(bankAccount1);
        model.addAttribute("accounts", accounts);
    }
}


//        @Override
//        public <S extends BankAccount> S save(S entity) {
//            return null;
//        }
//
//        @Override
//        public <S extends BankAccount> Iterable<S> saveAll(Iterable<S> entities) {
//            return null;
//        }
//
//        @Override
//        public Optional<BankAccount> findById(Long aLong) {
//            return Optional.empty();
//        }

//        @Override
//        public boolean existsById(Long aLong) {
//            return false;
//        }

//        @Override
//        public Iterable<BankAccount> findAll() {
//            return null;
//        }
//
//        @Override
//        public Iterable<BankAccount> findAllById(Iterable<Long> longs) {
//            return null;
//        }




