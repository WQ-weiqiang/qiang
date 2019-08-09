package qiang.actuator.custom;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthAggregator;
import org.springframework.stereotype.Component;
import qiang.actuator.consts.Consts;

import java.util.Map;

/**
 * @author Qiang.wei
 * @date 2019/7/31 17:10
 * @Description
 */
@Component
public class CustomHealthAggregator implements HealthAggregator {


    @Override
    public Health aggregate(Map<String, Health> healths) {
        for (Health h : healths.values()) {
            if (h.getStatus().getCode().equals(Consts.FAIL)) {
                return Health.status(Consts.FAIL).withDetail("error code", "关键服务不可用导致服务宕机").build();

            }
        }
        return
                Health.up().build();

    }
}
