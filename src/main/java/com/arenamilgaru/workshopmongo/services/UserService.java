package com.arenamilgaru.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arenamilgaru.workshopmongo.domain.User;
import com.arenamilgaru.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
