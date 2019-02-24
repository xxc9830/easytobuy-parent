package cn.etb.easytobuy.client;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class RedisClientFallbackFactory implements FallbackFactory<RedisClient> {

    @Override
    public RedisClient create(Throwable throwable) {
        return new RedisClient() {
            @Override
            public void set(String key, String value) {
                System.out.println("RedisClientFallbackFactory................");
            }

            @Override
            public String get(String key) {
                return "系统繁忙,请稍后重试";
            }
        };
    }
}
