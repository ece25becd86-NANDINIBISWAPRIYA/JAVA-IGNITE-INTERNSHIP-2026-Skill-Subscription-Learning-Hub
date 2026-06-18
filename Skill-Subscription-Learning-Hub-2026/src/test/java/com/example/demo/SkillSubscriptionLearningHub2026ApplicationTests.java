package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SkillSubscriptionLearningHub2026ApplicationTests {

	@Test
	void contextLoads() {
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SkillSubscriptionLearningHub2026Application {
@SpringBootApplication(scanBasePackages = {"com.skills.hub","com.example.demo"})//  added 

@EnableJpaRepositories(basePackages = "com.skills.hub.repository")

	public static void main(String[] args) {
		SpringApplication.run(SkillSubscriptionLearningHub2026Application.class, args);
	}
@EntityScan("com.skills.hub.model")// added
public class SkillSubscriptionLearningHub2026Application {

}
    public static void main(String[] args) {
        SpringApplication.run(
                SkillSubscriptionLearningHub2026Application.class,args);
    }
}
