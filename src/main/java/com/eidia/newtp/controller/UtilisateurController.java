package com.eidia.newtp.controller;
import com.eidia.newtp.Entities.Utilisateur;
import com.eidia.newtp.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UtilisateurController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping({"/users","index"})
    //@RequestMapping(value="/index")
    public String index(Model model, @RequestParam(name="key",defaultValue="wafae")String key) {
        List<Utilisateur> users = userRepository.search("%"+key+"%");
        model.addAttribute("listUsers",users);
        return "users";
    }
}
