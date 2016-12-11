package hu.kniznertamas.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.kniznertamas.dal.entity.UserEntity;
import hu.kniznertamas.dal.repository.UserRepository;

@Service
public class UserDao {

    @Autowired
    private UserRepository userRepository;

    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.saveAndFlush(userEntity);
    }

}
