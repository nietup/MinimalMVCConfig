package lab;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//AbstractAnnotationConfigDispatcherServletInitializer creates both a DispatcherServlet and a ContextLoaderListener
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //DispatcherServlet is expected to load beans containing web components such as controllers, view resolvers, and handler mappings
        return new Class[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //ContextLoaderListener is expected to load the other beans in your application
        return new Class[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; //this servlet will be mapped to "/" - meaning that this is the default servlet and it will handle all incoming requests
    }
}
