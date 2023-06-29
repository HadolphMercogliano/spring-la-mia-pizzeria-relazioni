package com.learing.springPizzeria.controller;

import com.learing.springPizzeria.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categories")
public class CategoryController {
  
  @Autowired
  private CategoryRepo categoryRepository;
  
  @GetMapping
  public String index() {
    return "/categories/index";
  }
}