package com.epam.task.four.service.security.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Stats")
public class Stats {
    @Id
    private String id;
    private String info;

}
