package com.example.redis_api.util;

import org.apache.commons.codec.digest.DigestUtils;

public class EncryptionUtil {


    public static String encryptPayload(String payload) {

        return DigestUtils.sha256Hex(payload);
    }

    public static String decryptPayload(String encryptedPayload) {
        // Placeholder decryption logic
        return encryptedPayload; // For demonstration purposes, return encryptedPayload as-is
    }
}
