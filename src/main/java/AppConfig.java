import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/*
В классе AppConfig, по аналогии, создайте бин с именем “cat”.

Настройте этот бин так, чтобы он создавался новым при каждом запросе.
 */
@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("Kitty");
        return cat;
    }
}