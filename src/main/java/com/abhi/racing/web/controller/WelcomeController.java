package com.abhi.racing.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

  private List<String> getRaces() {
    List<String> races = new ArrayList<>();
    races.add("Abhi's Race 1");
    races.add("Space race 2");
    races.add("Fastest race EVR!");

    return races;
  }

  @GetMapping("/")
  public String greeting(ModelMap model) {

    List<String> myRaces = getRaces();
    model.addAttribute("races", myRaces);
    return "index";
  }

}
