package pl.piomin.services.secure;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SecureClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SecureClientApplication.class).run(args);
    }

}
