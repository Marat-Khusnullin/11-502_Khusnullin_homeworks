package ru.listener;

import ru.config.NewConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class SpringContextListener implements ServletContextListener{


    public void contextInitialized(ServletContextEvent sce) {
        ApplicationContext context = new AnnotationConfigApplicationContext(NewConfig.class);
        sce.getServletContext().setAttribute("springContext", context);
    }


    public void contextDestroyed(ServletContextEvent sce) {

    }
}
