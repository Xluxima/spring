package prj.spring_mvc.main;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*****************
 *
 * @author Alex
 *
 ****************/

public class SpringWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// map dispatcherServleto to...
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{RootConfig.class};
	}

	// attach configuration class
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{WebConfig.class};
	}
}
