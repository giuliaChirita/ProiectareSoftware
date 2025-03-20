import ro.ulbs.paradigme.lab3.util.PasswordMaker;

import java.security.SecureRandom;

public void main() {

    PasswordMaker pm1 = PasswordMaker.getInstance();
    PasswordMaker pm2 = PasswordMaker.getInstance();

    System.out.println( pm1.getPassword());
    System.out.println( PasswordMaker.getAccessCount());

    System.out.println( (pm1 == pm2)); // Va afișa "true"
}

private ro.ulbs.paradigme.lab3.util.PasswordMaker PasswordMaker;

