package com.example.SpringModel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
public class SubEntity extends TestEntity {
    private String subName;
    public SubEntity(String name,String subName){
        setName(name);
        this.subName = subName;
    }
}
