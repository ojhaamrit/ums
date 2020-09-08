package org.amrit.usermanagement.base;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class BaseController<T extends BaseEntity> {

	private BaseService<T> service;

	public BaseController(BaseService<T> service) {
		super();
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<T> getAll() {
		return service.getAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/id")
	T getById(@PathVariable Long id) {
		return service.getById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	T add(@RequestBody T t) {
		return service.add(t);
	}

	@RequestMapping(method = RequestMethod.PUT)
	T update(T t) {
		return service.update(t);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	void delete(Long id) {
		service.delete(id);
	}

}
