package com.nttdata.bootcamp.project1.credits.infrastructure.repository;

import java.util.List;

import com.nttdata.bootcamp.project1.credits.application.model.CreditRepository;
import com.nttdata.bootcamp.project1.credits.domain.Credit;
import com.nttdata.bootcamp.project1.credits.infrastructure.model.dao.CreditDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class CreditCrudRepository implements CreditRepository {
    @Autowired
    ICreditCrudRepository repository;

    @Override
    public Mono<Credit> getCreditId(int id) {
        // TODO Auto-generated method stub
        return repository.findById(id)
                .map(this::mapCreditDaoToCredit);
    }

    @Override
    public Flux<Credit> getAll() {
        // TODO Auto-generated method stub
        return repository.findAll()
                .map(this::mapCreditDaoToCredit);
    }
    

    private CreditDao mapCreditToCreditDao(Credit credit){
        CreditDao creditDao=new CreditDao();
        creditDao.setId(credit.getId());
        creditDao.setExpirationDate(credit.getExpirationDate());
        creditDao.setCardType(credit.getCardType());
        creditDao.setIndicator(credit.isIndicator());
        return creditDao;
    }

    private Credit mapCreditDaoToCredit(CreditDao creditDao){
        Credit credit=new Credit();
        credit.setId(creditDao.getId());
        credit.setExpirationDate(creditDao.getExpirationDate());
        credit.setCardType(creditDao.getCardType());
        credit.setIndicator(creditDao.isIndicator());
        return credit;
    }
    @Override
    public Mono<Credit> save(Credit credit) {
        // TODO Auto-generated method stub
        return repository.save(mapCreditToCreditDao(credit))
                .map(this::mapCreditDaoToCredit);
    }

    @Override
    public Mono<Credit> update(Mono<Credit> credit, int id) {
        // TODO Auto-generated method stub
        return repository.findById(id)
                .flatMap(c->credit.map(this::mapCreditToCreditDao)
                .doOnNext(i->i.setId(id)))
                .flatMap(repository::save)
                .map(this::mapCreditDaoToCredit);

        /*return repository.update(mapCreditToCreditDao(credit))
                .map(this::mapCreditDaoToCredit);*/
    }

    @Override
    public Mono<Void> delete(int id) {
        // TODO Auto-generated method stub        
        //Credit credit=new Credit();
        //repository.delete();
        return repository.deleteById(id);
    }

    
    @Override
    public Credit getCredit(int id) {
        // TODO Auto-generated method stub
        
        return null;
    }

    

  
    
}
