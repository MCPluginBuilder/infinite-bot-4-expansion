package com.illtamer.infinite.bot.expansion.manager.defence.util;

import java.security.SecureRandom;
import java.util.Random;

public class AuthUtil {

    public static int codeLength = -1;
    private static final String SYMBOLS = "0123456789";
    private static final Random RANDOM = new SecureRandom();

    public static String getCode(int joins) {
        char[] nonceChars = new char[joins > 80 ? (joins > 400 ? 6 : 5) : 4];

        codeLength = nonceChars.length;

        for (int index = 0; index < nonceChars.length; ++index) {
            nonceChars[index] = SYMBOLS.charAt(RANDOM.nextInt(SYMBOLS.length()));
        }

        return new String(nonceChars);
    }

}
