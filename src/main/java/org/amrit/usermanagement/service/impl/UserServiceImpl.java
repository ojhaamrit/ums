package org.amrit.usermanagement.service.impl;

import org.amrit.usermanagement.base.BaseRepository;
import org.amrit.usermanagement.base.BaseServiceImpl;
import org.amrit.usermanagement.model.User;
import org.amrit.usermanagement.repository.UserRepository;
import org.amrit.usermanagement.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
	
	public UserServiceImpl(UserRepository repository) {
		super(repository);
	}

}
