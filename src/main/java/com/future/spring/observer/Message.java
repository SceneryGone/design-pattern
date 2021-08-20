package com.future.spring.observer;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-20 09:58
 */
@Builder
@ToString
@Data
public class Message {

    private Integer id;

    private String message;


}
