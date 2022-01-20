package com.test.testadexo.controler;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public interface GeneratorControler {


    @GetMapping("/")
    String getModel(Model model);
}
