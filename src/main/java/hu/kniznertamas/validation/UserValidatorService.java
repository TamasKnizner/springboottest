package hu.kniznertamas.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import hu.kniznertamas.dal.entity.UserEntity;

@Component
public class UserValidatorService implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return UserEntity.class.equals(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {

    }

}
