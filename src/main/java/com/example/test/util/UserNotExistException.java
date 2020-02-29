package com.example.test.util;

public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在！");
    }
}
