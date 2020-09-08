package org.amrit.usermanagement.base;

import java.util.List;

public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {
	
	BaseRepository<T> repository;
	
	public BaseServiceImpl(BaseRepository<T> repository) {
		this.repository = repository;
	}

	@Override
	public List<T> getAll() {
		return repository.findAll();
	}

	@Override
	public T getById(Long id) {
		return repository.getOne(id);
	}

	@Override
	public T add(T t) {
		return repository.save(t);
	}

	@Override
	public T update(T t) {
		return repository.save(t);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
