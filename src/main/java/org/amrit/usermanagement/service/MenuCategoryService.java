package org.amrit.usermanagement.service;

import java.util.List;
import java.util.Optional;

import org.amrit.usermanagement.model.MenuCategory;

public interface MenuCategoryService {

	List<MenuCategory> getAll();
	
	Optional<MenuCategory> getById(Integer id);
	
	MenuCategory add(MenuCategory menuCategory);
	
	MenuCategory update(MenuCategory menuCategory);
	
	void delete(Integer id);
}

