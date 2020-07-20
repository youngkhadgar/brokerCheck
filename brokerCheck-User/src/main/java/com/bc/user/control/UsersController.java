package com.bc.user.control;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bc.user.model.CreateUserRequestModel;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@GetMapping("/status/check")
	public String status() {
		return "working";
				
	}
	
	@PostMapping
	public String createUser(@Valid @RequestBody CreateUserRequestModel userDetails) {
		return "create user";
	}

}
