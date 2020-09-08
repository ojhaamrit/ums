package org.amrit.usermanagement.controller;

import org.amrit.usermanagement.base.BaseController;
import org.amrit.usermanagement.model.User;
import org.amrit.usermanagement.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController extends BaseController<User> {

	public UserController(UserService service) {
		super(service);
	}
	
}
