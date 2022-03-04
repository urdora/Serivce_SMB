package com.smb.utils;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import static org.springframework.http.RequestEntity.put;

/**
 * @author wangyihang
 * @date 2021/11/8
 */
@Component
public class MemoryUtils {

    private static final Map<String, String> CACHE_MAP = new ConcurrentHashMap<>();

    /**
     * 缓存生效时间12小时
     */
    public static final long CACHE_HOLD_TIME_12H = 12 * 60 * 60 * 1000L;

    /**
     * 缓存生效时间24小时
     */
    public static final long CACHE_HOLD_TIME_24H = 24 * 60 * 60 * 1000L;

    /**
     * 获取map中的value(不包含null)
     *
     * @param key 键
     * @return 值
     */
    public String getString(String key) {
        return Optional.ofNullable(CACHE_MAP.get(key)).orElse("");
    }

    /**
     * 获取map中的value(包含null)
     *
     * @param key 键
     * @return 值
     */
    public String getStringHasNull(String key) {
        return CACHE_MAP.get(key);
    }

    /**
     * 获取maps中的values(不包含null)
     *
     * @param keys 键列表
     * @return 值列表
     */
    public List<String> getList(List<String> keys) {
        List<String> result = new ArrayList<>();
        if (keys.size() != 0) {
            for (String key : keys) {
                String val = Optional.ofNullable(CACHE_MAP.get(key)).orElse("");
                if (!StringUtils.isBlank(val)) {
                    result.add(val);
                }
            }
        }
        return result;
    }

    /**
     * 存值
     *
     * @param key 键
     * @param value 值
     */
    public void setString(String key, String value) {
        CACHE_MAP.put(key, value);
    }

    /**
     * 删值
     *
     * @param key 键
     */
    public void removeKey(String key) {
        CACHE_MAP.remove(key);
    }
}
