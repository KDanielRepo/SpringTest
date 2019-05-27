package com.example.SpringModel;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EntityRepo extends CrudRepository<SubEntity,Long> {

    List<SubEntity> find(String subName);
}
