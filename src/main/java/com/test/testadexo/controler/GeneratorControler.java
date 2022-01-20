package com.test.testadexo.controler;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.NoSuchAlgorithmException;

public interface GeneratorControler {


    @GetMapping("/")
    String getModel(Model model) throws NoSuchAlgorithmException;
}
