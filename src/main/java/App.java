import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanSecond = (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCatFirst = (Cat) applicationContext.getBean("cat");
        Cat beanCatSecond = (Cat) applicationContext.getBean("cat");

        System.out.println(beanSecond.getMessage());
        System.out.println(beanCatFirst.getName());
        System.out.println(beanCatSecond.getName());

        System.err.println(bean == beanSecond);
        System.err.println(beanCatFirst == beanCatSecond);
    }
}