package com.example.redis_api.controller;

import com.example.redisapi.exception.DecryptionException;
import com.example.redisapi.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    private final RedisService redisService;

    @Autowired
    public RedisController(RedisService redisService) {
        this.redisService = redisService;
    }

    @PostMapping("/api/data")
    public String storeEncryptedData(@RequestBody String encryptedPayload) {
        try {
            redisService.storeEncryptedData(encryptedPayload);
            return "Data stored successfully";
        } catch (DecryptionException e) {
            return "Failed to decrypt payload: " + e.getMessage();
        }
    }
}
