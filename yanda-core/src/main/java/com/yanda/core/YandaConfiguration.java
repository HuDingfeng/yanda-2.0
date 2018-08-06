package com.yanda.core;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.client.RestTemplate;

import com.yanda.core.web.filter.DOPXssFilter;


/**
 * @Title: DOPConfiguration.java 
 * @Description: 替代传统的web.xml，使用代码的形式做配置 
 * @author chenli
 * @date 2016年12月13日 上午10:41:28
 * @version V1.0.0   
 */
@Configuration
public class YandaConfiguration {
	
	/**
	 * Xss filter
	 */
	@Bean
	public FilterRegistrationBean XssFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new DOPXssFilter());
		registrationBean.addUrlPatterns("/*");
		registrationBean.setName("XssFilter");
		return registrationBean;
	}
	
	@Bean  
    public RestTemplate restTemplate(ClientHttpRequestFactory factory){  
        return new RestTemplate(factory);  
    }  
      
    @Bean  
    public ClientHttpRequestFactory simpleClientHttpRequestFactory(){  
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();  
        factory.setReadTimeout(5000);
        factory.setConnectTimeout(15000); 
        return factory;  
    }  
    
    /**
     * 定时任务线程池bean注册
     * @return
     */
    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
       return new ThreadPoolTaskScheduler();
    }

    @Bean  
    EmbeddedServletContainerCustomizer containerCustomizer() throws Exception {  
        return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {  
			    if (container instanceof TomcatEmbeddedServletContainerFactory) {  
			        TomcatEmbeddedServletContainerFactory tomcat = (TomcatEmbeddedServletContainerFactory) container;  
			        tomcat.addConnectorCustomizers(new TomcatConnectorCustomizer() {
						@Override
						public void customize(Connector connector) {  
						    connector.setMaxPostSize(100*1024*1024); // 100MB
						}
					});  
			    }  
			}
		}; 
    }
    
}
