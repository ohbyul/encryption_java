package com.tistory.offbyone.main;

import com.tistory.offbyone.crypto.CryptoUtil;

public class CryptoTest {

	public static void main(String[] args) throws Exception {
		String plainText = "Hello, World!";
		String key = "secret key";
		//시크릿 키로 암호화 복호화
		
		System.out.println("MD5 : " + plainText + " - " + CryptoUtil.md5(plainText));
		System.out.println("SHA-256 : " + plainText + " - " + CryptoUtil.sha256(plainText));
		
		String encrypted = CryptoUtil.encryptAES256("Hello, World!", key);
		System.out.println("AES-256 : enc - " + encrypted);
		System.out.println("AES-256 : dec - " + CryptoUtil.decryptAES256(encrypted, key));
	}

}
