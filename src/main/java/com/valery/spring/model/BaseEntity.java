package com.valery.spring.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public class BaseEntity<P extends Serializable> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private P id;
}
