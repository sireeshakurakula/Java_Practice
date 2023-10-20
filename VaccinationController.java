package com.project.vaccination.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.vaccination.repository.VaccinationRepo;

import ch.qos.logback.core.model.Model;


@Controller
@RequestMapping("/users")
public class VaccinationController {
    
  @GetMapping("/index")
public String indexpage() {
    return "index";

}
 @GetMapping("/@{/users/add}")
public String Userpage() {
    return "@{/users/add}";
}


@Autowired
private VaccinationRepo vaccinationRepo;
@GetMapping("/add")
public String showAddUserForm(Model model){
  return "addUser";
}

@PostMapping("/add")
public String addUser(@ModelAttribute User user) {
  vaccinationRepo.save(user);
  return "redirect:/users/all";
  
  
}


}



