package springboot.mybatis.crud.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**", "/fonts/**", "/css/**", "/js/**").addResourceLocations(
                "classpath:/META-INF/resources/webjars/", "classpath:/static/fonts/", "classpath:/static/css/",
                "classpath:/static/js/");
    }
}
