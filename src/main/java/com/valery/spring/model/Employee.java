package com.valery.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@Entity
@Table(schema = "employee_storage", name = "employee")
public class Employee extends BaseEntity<Long> {

    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
