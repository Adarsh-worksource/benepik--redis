package com.example.redis_api.service;

import com.example.redisapi.exception.DecryptionException;
import com.example.redisapi.util.EncryptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;

@Service
public class RedisService {

    private final StringRedisTemplate redisTemplate;
    private static final long EXPIRATION_TIME = 5;

    @Autowired
    public RedisService(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void storeEncryptedData(String encryptedPayload) {
        try {
            String decryptedPayload;
            decryptedPayload = EncryptionUtil.decryptPayload(encryptedPayload);
            redisTemplate.opsForValue().set("encryptedData", decryptedPayload, EXPIRATION_TIME, TimeUnit.MINUTES);
        } catch (Exception e) {
            throw new DecryptionException("Failed to decrypt payload: " + e.getMessage());
        }
    }
}