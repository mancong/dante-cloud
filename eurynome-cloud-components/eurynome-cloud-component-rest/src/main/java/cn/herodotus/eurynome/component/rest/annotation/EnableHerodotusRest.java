package cn.herodotus.eurynome.component.rest.annotation;

import cn.herodotus.eurynome.component.rest.configuration.HerodotusRestConfiguration;
import cn.herodotus.eurynome.component.rest.properties.ApplicationProperties;
import cn.herodotus.eurynome.component.rest.properties.SwaggerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <p> Description : Rest Component 相关配置Enable注解 </p>
 *
 * @author : gengwei.zheng
 * @date : 2020/3/2 11:01
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HerodotusRestConfiguration.class)
@EnableDiscoveryClient
@EnableConfigurationProperties({
        ApplicationProperties.class,
        SwaggerProperties.class
})
public @interface EnableHerodotusRest {
}
