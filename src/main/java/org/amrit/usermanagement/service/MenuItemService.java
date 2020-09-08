package org.amrit.usermanagement.service;

import java.util.List;
import java.util.Optional;

import org.amrit.usermanagement.model.MenuItem;

public interface MenuItemService {

	List<MenuItem> getAll();
	
	Optional<MenuItem> getById(Integer id);
	
	MenuItem add(MenuItem menuItem);
	
	MenuItem update(MenuItem menuItem);
	
	void delete(Integer id);
	
}
