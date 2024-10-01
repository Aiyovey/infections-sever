package com.jd.infectious.common;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;

public class RSA {
    public RSA() {
    }

    public static byte[] encryptByPublicKeyByLargeObjects(byte[] data, String key) {
        try {
            byte[] keyBytes = BASE64.decode(key);
            X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            Key privateKey = keyFactory.generatePublic(x509KeySpec);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, privateKey);
            int inputLen = data.length;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int offSet = 0;
            for (int i = 0; inputLen - offSet > 0; offSet = i * 117) {
                byte[] cache;
                if (inputLen - offSet > 117) {
                    cache = cipher.doFinal(data, offSet, 117);

                } else {

                    cache = cipher.doFinal(data, offSet, inputLen - offSet);

                }
                out.write(cache, 0, cache.length);
                ++i;

            }
            byte[] encryptedData = out.toByteArray();
            out.close();
            return encryptedData;

        } catch (Exception var12) {
            throw new RuntimeException(var12);

        }

    }

    public static byte[] decryptByPublicKeyByLargeObjects(byte[] data, String key) {

        try {

            byte[] keyBytes = BASE64.decode(key);
            X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            Key publicKey = keyFactory.generatePublic(x509KeySpec);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, publicKey);
            int inputLen = data.length;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int offSet = 0;
            for (int i = 0; inputLen - offSet > 0; offSet = i * 128) {
                byte[] cache;
                if (inputLen - offSet > 128) {
                    cache = cipher.doFinal(data, offSet, 128);

                } else {

                    cache = cipher.doFinal(data, offSet, inputLen - offSet);

                }
                out.write(cache, 0, cache.length);
                ++i;

            }
            byte[] decryptedData = out.toByteArray();
            out.close();
            return decryptedData;

        } catch (Exception var12) {
            throw new RuntimeException(var12);

        }

    }

}