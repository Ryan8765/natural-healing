package com.reviews.healing.natural.util;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.springframework.stereotype.Component;

/*
 * This class is used to generate a random token. 
 */

@Component
public class TokenGeneratorUtil {
	
	private SecureRandom random = new SecureRandom();

	public String createRandomToken() {
		return new BigInteger(130, random).toString(32);
	}
	
}
