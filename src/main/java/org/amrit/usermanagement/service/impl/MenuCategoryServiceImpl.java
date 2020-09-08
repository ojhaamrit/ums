package org.amrit.usermanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.amrit.usermanagement.model.MenuCategory;
import org.amrit.usermanagement.repository.MenuCategoryRepository;
import org.amrit.usermanagement.service.MenuCategoryService;
import org.springframework.stereotype.Service;

@Service
public class MenuCategoryServiceImpl implements MenuCategoryService {

	private MenuCategoryRepository MenuCategoryRepository;

	public MenuCategoryServiceImpl(MenuCategoryRepository MenuCategoryRepository) {
		this.MenuCategoryRepository = MenuCategoryRepository;
	}

	@Override
	public List<MenuCategory> getAll() {
		return MenuCategoryRepository.findAll();
	}

	@Override
	public Optional<MenuCategory> getById(Integer id) {
		return MenuCategoryRepository.findById(id);
	}

	@Override
	public MenuCategory add(MenuCategory menuCategory) {
		return MenuCategoryRepository.save(menuCategory);
	}

	@Override
	public MenuCategory update(MenuCategory menuCategory) {
		return MenuCategoryRepository.save(menuCategory);
	}

	@Override
	public void delete(Integer id) {
		MenuCategoryRepository.deleteById(id);
	}

}
