package com.aiven.postgres.Tranko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.security.KeyStore;

@SpringBootApplication
public class TrankoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrankoApplication.class, args);
	}

//	KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
//	FileInputStream fileInputStream = new FileInputStream("path/to/keystore");
//keyStore.load(fileInputStream, "keystore_password".toCharArray());
}
