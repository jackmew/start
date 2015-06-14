package com.zestiria.start;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author zespri E-mail:wonderfuljack123@gmail.com
 * @version 2015年6月7日 上午2:39:46
 * 
 */

@Configuration
public class SpringContext extends WebMvcConfigurerAdapter {

	// static resources
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/dist/**").addResourceLocations("/WEB-INF/dist/");
	}
}
