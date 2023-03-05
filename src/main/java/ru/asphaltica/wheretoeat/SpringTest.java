package ru.asphaltica.wheretoeat;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.asphaltica.wheretoeat.repository.DataJpaRestaurantRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class SpringTest {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml")) {

            DataJpaRestaurantRepository repository = appCtx.getBean(DataJpaRestaurantRepository.class);

            System.out.println(repository.delete(1,1));

        }
    }

}
