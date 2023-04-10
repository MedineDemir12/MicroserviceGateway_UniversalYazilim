package com.universal_yazilim.bid.ysm.gateway_app.model.servis;

import com.universal_yazilim.bid.ysm.gateway_app.model.entity.User;
import com.universal_yazilim.bid.ysm.gateway_app.model.repository.UserRepository;
import com.universal_yazilim.bid.ysm.gateway_app.utility.ExceptionMessageType;
import com.universal_yazilim.bid.ysm.gateway_app.utility.Util;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService extends AbstractUserService
{


    @Override
    public Optional<User> findAllByUserName(String userName) {
        return userRepository.findAllByUserName(userName);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User entity) {
        try
        {
            entity.setCreated(new Date());
            entity.setPassword(passwordEncoder.encode(entity.getPassword()));
            return userRepository.save(entity);
        }
        catch (IllegalArgumentException e)
        {
            Util.showGeneralExceptionInfo(e);
            return null;
        }
        catch (OptimisticLockingFailureException e)
        {
            Util.showGeneralExceptionInfo(e);
            return null;
        }
    }

    @Override
    public void deleteByID(Integer id) {
        try
        {
            userRepository.deleteById(id);
        }
        catch (IllegalArgumentException e)
        {
            Util.showGeneralExceptionInfo(e);
        }
    }
}
