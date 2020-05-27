import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class choosemobile {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("class loaded");
	mobile mob = context.getBean("mob",mobile.class);
	mob.phonename();
	mob.simname();
	mob.gamename();
}
}
