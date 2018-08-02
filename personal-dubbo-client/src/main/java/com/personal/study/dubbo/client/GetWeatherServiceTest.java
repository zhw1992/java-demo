package personal.study.dubbo.client;

import com.personal.study.dubbo.api.GetWeatherService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ASUS on 2018/7/31.
 */
public class GetWeatherServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        context.start();

        final GetWeatherService getWeatherService = context.getBean("getWeatherService", GetWeatherService.class);
        final String result = getWeatherService.getWeatherByCityCode("SZX");
        System.out.println(result);
    }
}
