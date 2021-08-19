package com.future.dip;

import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 11:37
 */
@Service
public class StringWriterImpl implements StringWriter {

    @Override
    public void write(String value) {
        System.out.println("write me " + value);
    }

}
