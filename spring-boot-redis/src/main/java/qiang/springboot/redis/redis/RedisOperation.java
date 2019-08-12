package qiang.springboot.redis.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author Qiang.wei
 * @date 2019/8/12 14:56
 * @Description
 */

@Component
public class RedisOperation {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /***
     * 操作普通字符串
     */
    public void StringSet(String key, String value) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value);
    }

    /***
     * 操作列表
     */
    public void ListSet(String key, List<String> values) {
        ListOperations<String, String> listOperations = redisTemplate.opsForList();
        values.forEach(value -> listOperations.leftPush(key, value));
    }

    /***
     * 操作集合
     */
    public void SetSet(String key, Set<String> values) {
        SetOperations<String, String> setOperations = redisTemplate.opsForSet();
        values.forEach(value -> setOperations.add(key, value));
    }

    /***
     * 获取字符串
     */
    public String StringGet(String key) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        return valueOperations.get(key);
    }

    /***
     * 列表弹出元素
     */
    public String ListLeftPop(String key) {
        ListOperations<String, String> listOperations = redisTemplate.opsForList();
        return listOperations.leftPop(key, 2, TimeUnit.SECONDS);
    }

    /***
     * 集合弹出元素
     */
    public String SetPop(String key) {
        SetOperations<String, String> setOperations = redisTemplate.opsForSet();
        return setOperations.pop(key);
    }

}
