package com.smb.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author wangyihang
 * @date 2021/10/12
 */
@Component
public class RedisUtils {
    @Autowired
    private RedisTemplate<Object, Object> template;


    public void put(Object key,Object value){
        ValueOperations<Object, Object> ops = template.opsForValue();
        ops.set(key,value);
    }

    public  Object get(Object key){
        ValueOperations<Object, Object> ops = template.opsForValue();
        return ops.get(key);
    }

    public void put(Object key, Object value, long timeout, TimeUnit unit){
        ValueOperations<Object, Object> ops = template.opsForValue();
        ops.set(key,value,timeout,unit);
    }

    public void put(Object key,Object value,long seconds){
        ValueOperations<Object, Object> ops = template.opsForValue();
        this.put(key, value, seconds, TimeUnit.SECONDS);
    }

    /**
     * 删除对应的value
     *
     * @param key
     */
    public void remove(final Object key) {
        if (exists(key)) {
            template.delete(key);
        }
    }


    /**
     * 返回redis中key过期时间 key已过期返回-1
     */
    public Long getExpire(Object key){
        return template.getExpire(key);
    }

    /**
     * 根据当前key和传入时间显示过期时间 key已过期返回-1
     * @param key
     * @param unit
     * @return
     */
    public long getExpire(Object key,TimeUnit unit){
        return template.getExpire(key,unit);
    }

    /**
     * 返回随机key
     * @return
     */
    public Object RANDOMKEY(){
        return template.randomKey();
    }

    /**
     * 判断缓存中是否有对应的key;value
     *
     * @param key
     * @return
     */
    public boolean exists(final Object key) {
        return template.hasKey(key);
    }
}
