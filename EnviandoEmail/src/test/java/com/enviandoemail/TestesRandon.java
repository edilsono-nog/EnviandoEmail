package com.enviandoemail;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestesRandon {

	public String randomString(int length, String characterSet) {
	    return IntStream.range(0, length).map(i -> new SecureRandom().nextInt(characterSet.length())).mapToObj(randomInt -> characterSet.substring(randomInt, randomInt + 1)).collect(Collectors.joining());
	}

	@Test
	public void buildFiveRandomStrings() {
	    for (int q = 0; q < 1; q++) {
	        System.out.println(randomString(6, "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789")); // The character set can basically be anything
	    }
	}
}
