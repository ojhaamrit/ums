package org.amrit.usermanagement.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.amrit.usermanagement.base.BaseRepository;
import org.amrit.usermanagement.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User>{

}
