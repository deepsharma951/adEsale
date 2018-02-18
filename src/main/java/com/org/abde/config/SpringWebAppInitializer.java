package com.org.abde.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {


    @Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]{ApplicationContextConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
	
	/*public void onStartup(ServletContext ctx) throws ServletException {
	AnnotationConfigWebApplicationContext  context=new AnnotationConfigWebApplicationContext();
	context.register(ApplicationContextConfig.class);
	context.setServletContext(ctx);
	System.out.println("set");
	
	ServletRegistration.Dynamic servlet=ctx.addServlet("dispatcher", new DispatcherServlet(context));
	servlet.addMapping("/");
	servlet.setLoadOnStartup(1);
	
	ctx.addListener(new ContextLoaderListener(context));
}*/
	
	

}
