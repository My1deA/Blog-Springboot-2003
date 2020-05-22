package com.example.demo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    //跨域
    @Override
    public void addCorsMappings(CorsRegistry registry) {
                //设置允许跨域的路径
        registry.addMapping("/**")
                //设置允许跨域的域名
                .allowedOrigins("http://localhost:8066")
                //是否允许证书 不再默认开启
                .allowCredentials(true)
                //允许通过的方法 Get Post Delete Put
                .allowedMethods("*")
                //跨域最长时间
                .maxAge(3600);
    }

    //静态资源映射
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").addResourceLocations("file:///F:/Picture/upload1/");
    }
}
