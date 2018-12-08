/**
 * 创建日期 2017-11-1
 */
package cloud.dalston;

import java.sql.Timestamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 功能说明：spring boot入口类
 * 
 * @author 邓锦烨 2017-11-1
 */
@SpringBootApplication  /** 设置此类为spring boot的启动入口 */
@EnableEurekaServer /** 开启eureka服务注册中心 */
public class CloudInitMainApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CloudInitMainApplication.class, args);
    }

}
