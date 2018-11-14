package com.example.wht.common.utils;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/11/14-15:39
 * @description
 */
public class AES {
    public AES(){

    }
    public static String encrptPwd(String var0) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Random var3 = new Random();
        byte[] var4 = new byte[16];

        for(int var5 = 0; var5 < var4.length; ++var5) {
            var4[var5] = (byte)var3.nextInt(256);
        }

        byte[] var9 = var0.getBytes();
        SecretKeySpec var1 = new SecretKeySpec(var4, "AES");
        Cipher var2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        IvParameterSpec var6 = new IvParameterSpec(var4);
        var2.init(1, var1, var6);
        byte[] var7 = var2.doFinal(var9);
        byte[] var8 = new byte[var7.length + var4.length];
        System.arraycopy(var4, 0, var8, 0, var4.length);
        System.arraycopy(var7, 0, var8, var4.length, var7.length);
        return new String(Base64.encode(var8));
    }

    public static String decrptPwd(String var0) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        byte[] var3 = Base64.decode(var0);
        byte[] var4 = new byte[16];
        byte[] var5 = new byte[var3.length - var4.length];
        System.arraycopy(var3, 0, var4, 0, var4.length);
        System.arraycopy(var3, var4.length, var5, 0, var3.length - var4.length);
        SecretKeySpec var1 = new SecretKeySpec(var4, "AES");
        IvParameterSpec var6 = new IvParameterSpec(var4);
        Cipher var2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        var2.init(2, var1, var6);
        return new String(var2.doFinal(var5));
    }

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        String seceret = "wht123456";
        String encodeString = encrptPwd(seceret);
        System.out.println( (System.currentTimeMillis() + 60*60*1000));
        String enSeceret = "PmrSdJJTcmbL9MR72vplPnMyfsaVsqUncHNA7LyEhTg=";
        String decodeString = decrptPwd(enSeceret);
        System.out.println(encodeString+"   "+decodeString);
    }
}
