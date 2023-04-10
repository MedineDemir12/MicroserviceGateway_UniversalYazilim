package com.universal_yazilim.bid.ysm.gateway_app.model.repository;

import com.universal_yazilim.bid.ysm.gateway_app.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>
{
   // Optional<List<User>> findAllByUserName (String userName);
    Optional<User> findAllByUserName (String userName);
}
