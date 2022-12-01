package org.example.wholesale_trade.repository;

import org.example.wholesale_trade.domein.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);


}

