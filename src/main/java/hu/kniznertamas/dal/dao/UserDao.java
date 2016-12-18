package hu.kniznertamas.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.kniznertamas.dal.entity.UserEntity;
import hu.kniznertamas.dal.repository.UserRepository;

@Component
public class UserDao {

    @Autowired
    private UserRepository userRepository;

    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.saveAndFlush(userEntity);
    }

}
