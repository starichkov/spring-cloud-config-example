package org.starichkov.java.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vadim Starichkov
 * @since 22.01.2018 15:51
 */
@SpringBootApplication
@RestController
public class ConfigClient {
    @Value("${user.role}")
    private String role;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }

    @RequestMapping(
            value = "/whoami/{username}",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_PLAIN_VALUE)
    public String whoami(@PathVariable("username") String username) {
        return String.format("Hello! You're %s and your role a %s!", username, role);
    }
}
