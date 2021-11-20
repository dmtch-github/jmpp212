import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld hw = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        System.out.println("Два объекта HelloWorld являются одним экземпляром " + (bean == hw));
        System.out.println(bean + " = " + hw);

        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean("catBean",Cat.class);

        System.out.println("Два объекта Cat являются одним экземпляром " + (cat1 == cat2));
        System.out.println(cat1 + " != " + cat2);


    }
}