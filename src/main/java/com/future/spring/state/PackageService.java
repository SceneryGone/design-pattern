package com.future.spring.state;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:56
 */
@Service
public class PackageService {

    private final Map<PackageEnum, PackageState> packageStateMap = Maps.newHashMap();

    @Autowired
    private List<PackageState> packageStates;

    @PostConstruct
    private void register() {
        packageStates.forEach(packageState -> {
            System.out.println("register packageStates:" + packageState);
            packageStateMap.put(packageState.getPackageEnum(), packageState);
        });
    }

    public void deliverInfo(Byte packageStatus) {
        PackageEnum.of(packageStatus).ifPresent(packageEnum -> {
            final PackageState packageState = packageStateMap.get(packageEnum);
            final PackageContext packageContext = new PackageContext(packageState, "1001");
            packageContext.update();
            packageContext.update();
            packageContext.update();
            packageContext.update();
            packageContext.update();
            packageContext.update();
        });
    }

}
