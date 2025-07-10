package com.anjali.finance_management.repository;

import com.anjali.finance_management.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
}
