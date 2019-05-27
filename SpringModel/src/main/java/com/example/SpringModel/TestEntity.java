package com.example.SpringModel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Setter
@Getter
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int testId;
    private String name;
}
