package com.wx.controlller;

import com.wx.entity.Person;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author wang xing
 */
@RestController
public class ValidatorController {


    @RequestMapping("/validator")
    public String demo(@Valid Person person, BindingResult result){
        System.out.println(person);
        StringBuilder stringBuilder = new StringBuilder();
        if (result.getErrorCount() > 0){
            for (FieldError fieldError : result.getFieldErrors()) {
                stringBuilder.append(fieldError.getField()+ "=" + fieldError.getDefaultMessage() + ",");
            }
            return stringBuilder.toString();
        }
        return "validator";
    }
}
