package kxg.wechat.business.provider;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;


@EnableScheduling
@EnableSwagger2
@SpringBootApplication
public class DubboProviderBootstrap extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProviderBootstrap.class)
                .run(args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DubboProviderBootstrap.class);
    }
}