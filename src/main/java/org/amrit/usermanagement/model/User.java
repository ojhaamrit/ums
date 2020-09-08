package org.amrit.usermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.amrit.usermanagement.base.BaseEntity;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

	@Column
	private String name;
	
	@Column
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
