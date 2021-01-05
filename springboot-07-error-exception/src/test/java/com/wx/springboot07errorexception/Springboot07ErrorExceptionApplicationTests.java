package com.wx.springboot07errorexception;

import com.wx.entity.Person;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@SpringBootTest
class Springboot07ErrorExceptionApplicationTests {

    public static void main(String[] args) {
//        普通方式
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Person person = new Person("","");
        Set<ConstraintViolation<Person>> validate = validator.validate(person);
        for (ConstraintViolation<Person> personConstraintViolation : validate) {
            System.out.println(personConstraintViolation.getMessage() + "===" + personConstraintViolation.getPropertyPath());
        }
        System.out.println("================快速失败=======================");
        Validator validatorFastFail = Validation.byDefaultProvider().configure()
                .addProperty("hibernate.validator.fail_fast","true").buildValidatorFactory().getValidator();
        Set<ConstraintViolation<Person>> validateFailFast = validatorFastFail.validate(person);
        for (ConstraintViolation<Person> violation : validateFailFast) {
            System.out.println(violation.getPropertyPath() + "===" + violation.getMessage());
        }
    }

}
