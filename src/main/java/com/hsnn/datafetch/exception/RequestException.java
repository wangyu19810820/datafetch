package com.hsnn.datafetch.exception;

/**
 * Created by admin on 2017/5/31.
 */
public class RequestException extends RuntimeException {

    public RequestException() {
        super();
    }

    public RequestException(String desc) {
        super(desc);
    }
}
