package com.future;

import com.future.dip.StringProcessor;
import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 11:48
 */
class StringProcessorTest extends DesignPatternApplicationTests {

    @Autowired
    private StringProcessor stringProcessor;

    @Test
    void testStringProcessor() {
        Assert.checkNonNull(stringProcessor.readAndWrite());
    }

}
