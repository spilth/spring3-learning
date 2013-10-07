package org.spilth.testweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultController {

  @RequestMapping(value = "/")
  public String home(Model model) {
    model.addAttribute("message", "This is the message!");

    return "/home";
  }
}
