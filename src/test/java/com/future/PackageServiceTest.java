package com.future;

import com.future.spring.state.PackageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 18:10
 */
public class PackageServiceTest extends DesignPatternApplicationTests {

    @Autowired
    private PackageService packageService;

    @Test
    void testPackageService() {
        packageService.deliverInfo();
    }

}
