package org.starichkov.java.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Vadim Starichkov
 * @since 22.01.2018 15:37
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {
    public static void main(String[] arguments) {
        SpringApplication.run(ConfigServer.class, arguments);
    }
}
