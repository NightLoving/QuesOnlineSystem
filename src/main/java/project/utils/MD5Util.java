package project.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author yang
 * @date 2020-5-1
 * @description MD5工具类
 */
public class MD5Util {

    /**
     * 将用户输入的密码进行MD5加密处理
     * @param origin 原密码
     * @param charset 字符集
     * @return 加密后的密码
     */
    public static String MD5Encode(String origin, String charset){
        String resultString = null;
        try {
            resultString = new String(origin);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if(charset == null || "".equals(charset)){
                resultString = byteArrayToHexString(messageDigest.digest(resultString.getBytes()));
            }else {
                resultString = byteArrayToHexString(messageDigest.digest(resultString.getBytes(charset)));
            }
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return  resultString;
    }

    private static final String hexDigits[] = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    private static String byteToHexString(byte b){
        int n = b;
        if(n < 0){
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    private static String byteArrayToHexString(byte[] bytes){
        StringBuffer resultSB = new StringBuffer();
        for (int i = 0; i < bytes.length; i++){
            resultSB.append(byteToHexString(bytes[i]));
        }
        return resultSB.toString();
    }
}
