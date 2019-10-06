package com.rafal.irregular_verbs.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Record {
    @Id
    @GeneratedValue
    private long id;
    private String polishWord;
    private String firstForm;
    private String secondForm;
    private String thirdForm;

    public Record(long id, String polishWord, String firstForm, String secondForm, String thirdForm) {
        this.id = id;
        this.polishWord = polishWord;
        this.firstForm = firstForm;
        this.secondForm = secondForm;
        this.thirdForm = thirdForm;
    }
}
