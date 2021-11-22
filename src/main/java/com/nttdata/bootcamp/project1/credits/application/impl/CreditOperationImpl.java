package com.nttdata.bootcamp.project1.credits.application.impl;

import java.util.List;

import com.nttdata.bootcamp.project1.credits.application.CreditOperations;
import com.nttdata.bootcamp.project1.credits.application.model.CreditRepository;
import com.nttdata.bootcamp.project1.credits.domain.Credit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CreditOperationImpl implements CreditOperations{
    @Autowired
    CreditRepository repository;

    @Override
    public Flux<Credit> queryAll() {
        // TODO Auto-generated method stub
        return repository.getAll();
    }

    @Override
    public Mono<Credit> findCreditId(int id) {
        // TODO Auto-generated method stub
        return repository.getCreditId(id);
    }

    @Override
    public Mono<Credit> create(Credit credit) {
        // TODO Auto-generated method stub
        return repository.save(credit);
    }

    @Override
    public Mono<Credit> update(int id, Mono<Credit> credit) {
        // TODO Auto-generated method stub
        return repository.update(credit, id);
    }

    @Override
    public Mono<Void> delete(int id) {
        // TODO Auto-generated method stub
       return repository.delete(id);
    }

    @Override
    public void publicCredit(Credit credit) {
        // TODO Auto-generated method stub
        
    }
    
}
