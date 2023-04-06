package com.epam.task.four.service.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Hoomen")
@NoArgsConstructor
@Getter
@Setter
public class Hooman {
    @Id
    private String id;
    private String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hooman hooman)) return false;
        return Objects.equals(getId(), hooman.getId()) && Objects.equals(getName(), hooman.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}