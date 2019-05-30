package com.example.SpringModel;

import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Test;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "new_cars")
public class EntityRepoImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String marka;
    private String model;
    private Date rok_pr;
    public EntityRepoImpl(){

    }
    public EntityRepoImpl(String Marka, String Model, Date Rok_pr){
        this.setMarka(Marka);
        this.setModel(Model);
        this.setRok_pr(Rok_pr);
    }
    public EntityRepoImpl(int Id, String Marka, String Model, Date Rok_pr ){
        this.setId(Id);
        this.setMarka(Marka);
        this.setModel(Model);
        this.setRok_pr(Rok_pr);
    }

    @Override
    public String toString(){
        return "Tabela{"+
                "Id="+id+
                ", Marka="+marka+'\''+
                ", Model="+model+'\''+
                ", Rok_pr="+rok_pr+'\''+
                '}';
    }
}
