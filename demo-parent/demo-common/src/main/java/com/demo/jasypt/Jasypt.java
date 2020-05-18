package com.demo.jasypt;

import org.jasypt.util.text.BasicTextEncryptor;

public class Jasypt {
	public static void main(String[] args) {
		BasicTextEncryptor encryptor = new BasicTextEncryptor();
//        System.out.println(encryptor.encrypt("root"));
		System.out.println(encryptor.decrypt("5ihgpFLP88e466+wuFB6Fw=="));
	}
}
