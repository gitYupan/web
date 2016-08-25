package com.yihou.common.utils;

import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 对象序列化/反序列化工具类
 */
public class ObjectSerialize {

    private static final Logger logger = LoggerFactory.getLogger(ObjectSerialize.class);

    /**
     * 将对象序列化为字符串
     *
     * @param value 需要序列化的对象
     * @return 序列化字符串
     */
    public static String serizlizeObjectToString(Object value) {
        ObjectOutputStream oos;
        if (value == null) {
            return null;
        } else {
            try {
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                oos = new ObjectOutputStream(bos);
                oos.writeObject(value);
                oos.close();

                byte[] objectBytes = bos.toByteArray();
                return Hex.encodeHexString(objectBytes);
            } catch (Exception e) {
                logger.error("serizlize object to string error", e);
                return null;
            }
        }
    }

    /**
     * 将字符串序列化为对象
     *
     * @param hexStr 需要序列化的字符串
     * @return 反序列化对象
     */
    public static Object serizlizeStringToObject(String hexStr) {
        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(new ByteArrayInputStream(Hex.decodeHex(hexStr.toCharArray())));
            return ois.readObject();
        } catch (Exception e) {
            logger.error("serizlize string to object error", e);
            return null;
        }
    }

}
