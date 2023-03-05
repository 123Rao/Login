package com.Login.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Login.Entity.Login;
import com.Login.Services.Services;

@Controller
public class LoginController {
	
	@Autowired
	private Services serv;
	
	
    @RequestMapping("/new")
    public String login() {
        return "login_new";
    }

    @RequestMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        Login login = serv.login(username, password);
        if (login == null) {
            model.addAttribute("error", "Invalid username or password");
            return "login_new";
        }
        return "welcome_new";
    }


	 
	
	}

		
		
	


