package org.amrit.usermanagement.controller;

import java.util.List;
import java.util.Optional;

import org.amrit.usermanagement.model.MenuCategory;
import org.amrit.usermanagement.service.MenuCategoryService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/menu-category")
public class MenuCategoryController {

	private MenuCategoryService menuCategoryService;
	
	public MenuCategoryController(MenuCategoryService menuCategoryService) {
		this.menuCategoryService = menuCategoryService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<MenuCategory> getAll(){
	return menuCategoryService.getAll();
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value =  "/{id}")
	public Optional<MenuCategory> getById(@PathVariable Integer id){
		return menuCategoryService.getById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public MenuCategory add(@RequestBody MenuCategory menuCategory) {
		return menuCategoryService.add(menuCategory);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public MenuCategory update(@RequestBody MenuCategory menuCategory) {
		return menuCategoryService.update(menuCategory);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void delete(@PathVariable Integer id) {
		menuCategoryService.delete(id);
	}
	
}
