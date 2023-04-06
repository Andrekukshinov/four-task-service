package com.epam.task.four.service.security.controller;

import com.epam.task.four.service.security.entity.Hooman;
import com.epam.task.four.service.security.service.HoomanService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hoomans")
public class HoomanController {
    private final HoomanService hoomanService;

    public HoomanController(HoomanService hoomanService) {
        this.hoomanService = hoomanService;
    }

    @GetMapping
    public List<Hooman> getAllHoomans() {
        return hoomanService.getAllHoomen();
    }

    @GetMapping("/{id}")
    public Hooman getHoomanById(@PathVariable String id) {
        return hoomanService.getHoomanById(id);
    }

    @PostMapping
    public Hooman addHooman(@RequestBody Hooman hooman) {
        return hoomanService.addHooman(hooman);
    }
}