package com.wx;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;

public class Main {

    @Test
    public void t1(){
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
//        加盐
        basicTextEncryptor.setPassword("wx@123");
        String password1 = basicTextEncryptor.encrypt("123456");
        String password2 = basicTextEncryptor.encrypt("123456");
        String decrypt1 = basicTextEncryptor.decrypt(password1);
        String decrypt2 = basicTextEncryptor.decrypt(password2);
        System.out.println(password1 + "---" + password2);
        System.out.println("decrypt\t" + decrypt1 + "---" + decrypt2);
    }

}
