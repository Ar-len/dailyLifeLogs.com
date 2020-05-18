package com.demo.jasypt;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;

public class Jasypt {
    @Test
    public void jasyptTest() {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
//        encryptor.setPassword("123456");
//        System.out.println(encryptor.encrypt("root"));
//        System.out.println(encryptor.decrypt("EVmNosiJXq3HX5T26u0V/A=="));
    }
}
