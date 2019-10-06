package com.rafal.irregular_verbs.repository;

import com.rafal.irregular_verbs.model.Record;
import org.springframework.data.repository.CrudRepository;

public interface DictionaryCRUDRepository extends CrudRepository<Record, Long> {

}
