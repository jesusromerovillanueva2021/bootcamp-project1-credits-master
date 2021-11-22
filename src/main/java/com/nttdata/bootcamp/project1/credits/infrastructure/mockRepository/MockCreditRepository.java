package com.nttdata.bootcamp.project1.credits.infrastructure.mockRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nttdata.bootcamp.project1.credits.application.model.CreditRepository;
import com.nttdata.bootcamp.project1.credits.domain.Credit;

import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class MockCreditRepository implements CreditRepository{

    @Override
    public Mono<Credit> getCreditId(int id) {
        // TODO Auto-generated method stub
        Date expDate=new Date();

        Credit credit=new Credit();
        credit.setId(123456);
        credit.setCardType("Personal");
        credit.setExpirationDate(expDate);
        credit.setIndicator(true);
        return Mono.just(credit);
    }

    @Override
    public Flux<Credit> getAll() {
        // TODO Auto-generated method stub
        List<Credit> credits=new ArrayList<>();
        return Flux.fromIterable(credits);
    }

    @Override
    public Mono<Credit> save(Credit credit) {
        // TODO Auto-generated method stub
        return Mono.just(credit);
    }

 

    @Override
    public Credit getCredit(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<Void> delete(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<Credit> update(Mono<Credit> credit, int id) {
        // TODO Auto-generated method stub
        return null;
    }
    
    
}
