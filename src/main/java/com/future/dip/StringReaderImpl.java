package com.future.dip;

import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 11:33
 */
@Service
public class StringReaderImpl implements StringReader {

    @Override
    public String read(String path) {
        return path;
    }

}
