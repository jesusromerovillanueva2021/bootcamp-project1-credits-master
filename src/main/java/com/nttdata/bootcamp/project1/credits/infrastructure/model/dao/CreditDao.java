package com.nttdata.bootcamp.project1.credits.infrastructure.model.dao;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("credit")
public class CreditDao {
    @Id
    private int id;
    private Date expirationDate;
    private String cardType;
    private boolean indicator;
}
