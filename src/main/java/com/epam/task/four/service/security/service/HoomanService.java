package com.epam.task.four.service.security.service;


import com.epam.task.four.service.security.entity.Hooman;
import java.util.List;

public interface HoomanService {
    List<Hooman> getAllHoomen();
    Hooman getHoomanById(String id);
    Hooman addHooman(Hooman hooman);
}
