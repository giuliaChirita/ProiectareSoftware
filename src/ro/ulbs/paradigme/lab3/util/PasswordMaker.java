package ro.ulbs.paradigme.lab3.util;

import java.security.SecureRandom;

class StringRandomizer {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String getRandomString(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }
}

public class PasswordMaker {
    private static final int MAGIC_NUMBER = new SecureRandom().nextInt(6) + 5;
    private final String magicString;
    private final String name;

    private static PasswordMaker instance;

    private static int accessCount = 0;

    static {
        instance = new PasswordMaker("default");
    }
    private PasswordMaker(String name) {
        this.name = name;
        this.magicString = StringRandomizer.getRandomString(20);
    }

    public static PasswordMaker getInstance() {
        accessCount++; // Incrementare contor
        return instance;
    }

    public static int getAccessCount() {
        return accessCount;
    }

    public String getPassword() {
        SecureRandom random = new SecureRandom();

        String randomPart1 = StringRandomizer.getRandomString(MAGIC_NUMBER);

        StringBuilder randomPart2 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(magicString.length());
            randomPart2.append(magicString.charAt(index));
        }

        String lengthPart = String.valueOf(name.length());

        int randomNumber = random.nextInt(51);

        return randomPart1 + randomPart2.toString() + lengthPart + randomNumber;
    }


}
