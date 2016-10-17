import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

import com.sample.config.JavaConfig;
import com.sample.service.ICustomerService;

public class DemoApplication {

	public static void main(String[] args) {
		System.setProperty(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "Ora");

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
//		 appContext.getEnvironment().setActiveProfiles("SS");
		appContext.register(JavaConfig.class);
		appContext.refresh();

		ICustomerService service = appContext.getBean("customerService", ICustomerService.class);
		System.out.println(service);

		ICustomerService service2 = appContext.getBean("customerService", ICustomerService.class);
		System.out.println(service2);

		service.displayInfo();

		((ConfigurableApplicationContext) appContext).close();
	}

}
