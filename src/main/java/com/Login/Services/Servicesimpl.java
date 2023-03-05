package com.Login.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Login.Entity.Login;
import com.Login.Repository.LoginRepository;

@Service
public class Servicesimpl implements Services {
		
	    @Autowired
		private LoginRepository Repo;

		@Override
		public Login login(String username, String password) {
	        return Repo.findByUsernameAndPassword(username, password);
	    }

		
}



















