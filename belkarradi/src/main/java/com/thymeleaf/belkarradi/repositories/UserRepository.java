package com.thymeleaf.belkarradi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thymeleaf.belkarradi.beans.User;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {}

