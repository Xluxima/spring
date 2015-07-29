package prj.spring_mvc.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*****************
 *
 * @author Alex
 *
 ****************/

@Configuration
@ComponentScan(basePackages = {"prj.spring_mvc"}, excludeFilters = {
	@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
})
public class RootConfig {

}
