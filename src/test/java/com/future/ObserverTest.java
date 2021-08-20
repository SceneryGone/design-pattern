package com.future;

import com.future.spring.observer.Message;
import com.future.spring.observer.Observer;
import com.future.spring.observer.Publisher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-20 10:16
 */
class ObserverTest extends DesignPatternApplicationTests {

    @Autowired
    private Publisher publisher;

    @Test
    void testPublisher() {
        Message message = Message.builder()
                .id(1)
                .message("消息")
                .build();
        publisher.notifyUpdate(message);
    }
}
