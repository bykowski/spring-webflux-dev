package pl.bykowski.springwebfluxdev;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootTest
class SpringWebfluxDevApplicationTests {

    @Test
    void contextLoads() {

        Flux.just("Jan", "Karol", "Basia")
                .filter(element -> element.contains("B"))
                .map(String::toUpperCase)
                .subscribe(System.out::println);
        Mono.just("Jan");
    }

}
