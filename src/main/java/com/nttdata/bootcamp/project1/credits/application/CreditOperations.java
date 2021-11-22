package com.nttdata.bootcamp.project1.credits.application;

import java.util.List;

import com.nttdata.bootcamp.project1.credits.domain.Credit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditOperations {
    public Flux<Credit> queryAll();
    public Mono<Credit> findCreditId(int id);
    public Mono<Credit> create(Credit credit);
    public Mono<Credit> update(int id,Mono<Credit> credit);
    public Mono <Void> delete(int id);
    public void publicCredit(Credit credit);
}
