package com.caas.springbootJPA;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by caoxin on 2018/3/28.
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
