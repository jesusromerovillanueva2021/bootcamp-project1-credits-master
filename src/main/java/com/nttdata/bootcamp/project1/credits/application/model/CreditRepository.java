package com.nttdata.bootcamp.project1.credits.application.model;

import java.util.List;

import com.nttdata.bootcamp.project1.credits.domain.Credit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditRepository {
    public Mono <Credit> getCreditId(int id);
    public Flux <Credit> getAll();
    public Mono <Credit> save(Credit credit);
    public Mono<Void> delete(int id);
    public Mono<Credit> update(Mono<Credit> credit, int id);
    public Credit getCredit(int id);

}
