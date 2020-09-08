package org.amrit.usermanagement.controller;

import java.util.List;
import java.util.Optional;

import org.amrit.usermanagement.model.MenuItem;
import org.amrit.usermanagement.service.MenuItemService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/menu-item")
public class MenuItemController {

	private MenuItemService menuItemService;

	public MenuItemController(MenuItemService menuItemService) {
		this.menuItemService = menuItemService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<MenuItem> getAll() {
		return menuItemService.getAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Optional<MenuItem> getById(@PathVariable Integer id) {
		return menuItemService.getById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public MenuItem add(@RequestBody MenuItem menuItem) {
		return menuItemService.add(menuItem);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public MenuItem update(@RequestBody MenuItem menuItem) {
		return menuItemService.update(menuItem);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void delete(@PathVariable Integer id) {
		menuItemService.delete(id);
	}
	
}
