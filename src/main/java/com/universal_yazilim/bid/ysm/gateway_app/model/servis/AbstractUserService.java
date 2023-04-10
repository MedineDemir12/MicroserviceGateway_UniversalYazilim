package com.universal_yazilim.bid.ysm.gateway_app.model.servis;

import com.universal_yazilim.bid.ysm.gateway_app.model.entity.User;
import com.universal_yazilim.bid.ysm.gateway_app.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;


public abstract class AbstractUserService implements EntityService<User, Integer>
{
    @Autowired
    protected PasswordEncoder passwordEncoder;

    @Autowired
    protected UserRepository userRepository;

    public abstract Optional<User> findAllByUserName(String userName);
}
