package com.galvanize.menu;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController

public class MenuController {

    private final MenuRepository menuRepository;

    public MenuController(MenuRepository menuRepository){
        this.menuRepository = menuRepository;
    }

    @GetMapping("/all")
    public Iterable<Menu> getMenu(){return this.menuRepository.findAll();}


    @PostMapping("/add")
        public Menu additem(@RequestBody Menu newMenu){
            return this.menuRepository.save(newMenu);
        }



}
