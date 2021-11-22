package com.nttdata.bootcamp.project1.credits.infrastructure.repository;

import com.nttdata.bootcamp.project1.credits.domain.Credit;
import com.nttdata.bootcamp.project1.credits.infrastructure.model.dao.CreditDao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

@Repository
public interface ICreditCrudRepository extends ReactiveCrudRepository<CreditDao, Integer>{
     
}
