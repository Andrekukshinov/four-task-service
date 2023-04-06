package com.epam.task.four.service.security.service.impl;

import com.epam.task.four.service.security.entity.Hooman;
import com.epam.task.four.service.security.repository.HoomanRepository;
import com.epam.task.four.service.security.service.HoomanService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HoomanServiceImpl implements HoomanService {
    private final HoomanRepository hoomanRepository;

    public HoomanServiceImpl(HoomanRepository hoomanRepository) {
        this.hoomanRepository = hoomanRepository;
    }

    @Override
    public List<Hooman> getAllHoomen() {
        return hoomanRepository.findAll();
    }

    @Override
    public Hooman getHoomanById(String id) {
        return hoomanRepository.findById(id).orElse(null);
    }

    @Override
    public Hooman addHooman(Hooman hooman) {
        return hoomanRepository.save(hooman);
    }
}
