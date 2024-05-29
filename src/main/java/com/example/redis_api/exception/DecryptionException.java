package com.example.redis_api.exception;

public class DecryptionException extends RuntimeException{
    public DecryptionException(String message) {
        super(message);
    }
}
}
