package com.designpattern.decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/29 17:23
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    public int read(InputStream in) throws IOException {
        int c = super.read();
        return (c == -1 ? c: Character.toLowerCase((char)c));
    }

    public int read(byte[] b, int offset, int len){
        return 0;

    }





}
