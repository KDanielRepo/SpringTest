package com.example.SpringModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepo extends CrudRepository<EntityRepoImpl,Integer> {

}
