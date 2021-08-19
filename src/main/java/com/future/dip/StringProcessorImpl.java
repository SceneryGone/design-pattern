package com.future.dip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 11:32
 */
@Service
public class StringProcessorImpl implements StringProcessor {

    @Autowired
    private StringReader stringReader;

    @Autowired
    private StringWriter stringWriter;

    @Override
    public Boolean readAndWrite() {
        final String value = stringReader.read("admin");
        stringWriter.write(value);
        return Boolean.TRUE;
    }

}
