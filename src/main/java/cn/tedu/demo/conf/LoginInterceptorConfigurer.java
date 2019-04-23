package cn.tedu.demo.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import cn.tedu.demo.Interceptor.LoginInterceptor;

@Configuration
public class LoginInterceptorConfigurer implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		HandlerInterceptor interceptor = new LoginInterceptor();
		
		List<String> patterns = new ArrayList<String>();
		patterns.add("/users/reg");
		patterns.add("/users/login");
		patterns.add("/index.html");
		patterns.add("/web/login.html");
		patterns.add("/web/reg.html");
		patterns.add("/css/**");
		patterns.add("/img/**");
		patterns.add("/jq/**");
		
		registry.addInterceptor(interceptor).addPathPatterns("/**")
				.excludePathPatterns(patterns);
	}
	
	
	
}
