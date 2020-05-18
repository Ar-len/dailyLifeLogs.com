package jasypt;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;

public class Jasypt {
    @Test
    public void jasyptTest() {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
//        System.out.println(encryptor.encrypt("root"));
        System.out.println(encryptor.decrypt("5ihgpFLP88e466+wuFB6Fw=="));
    }
}
