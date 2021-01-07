package com.sano.coding.samplemongoDb.config;

import com.sano.coding.samplemongoDb.document.Users;
import com.sano.coding.samplemongoDb.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDbConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args -> {
            userRepository.save(new Users(1, "Sanoaf", "Developer", 30000L));
            userRepository.save(new Users(2, "Kamil", "Chemist", 40000L));
        };
    }
}
