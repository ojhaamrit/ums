package org.amrit.usermanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.amrit.usermanagement.model.MenuItem;
import org.amrit.usermanagement.repository.MenuItemRepository;
import org.amrit.usermanagement.service.MenuItemService;
import org.springframework.stereotype.Service;

@Service
public class MenuItemServiceImpl implements MenuItemService {

	private MenuItemRepository menuItemRepository;

	public MenuItemServiceImpl(MenuItemRepository menuItemRepository) {
		this.menuItemRepository = menuItemRepository;
	}

	@Override
	public List<MenuItem> getAll() {
		return menuItemRepository.findAll();
	}

	@Override
	public Optional<MenuItem> getById(Integer id) {
		return menuItemRepository.findById(id);
	}

	@Override
	public MenuItem add(MenuItem menuItem) {
		return menuItemRepository.save(menuItem);
	}

	@Override
	public MenuItem update(MenuItem menuItem) {
		return menuItemRepository.save(menuItem);
	}

	@Override
	public void delete(Integer id) {
		menuItemRepository.deleteById(id);
	}

}
