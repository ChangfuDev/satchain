package com.satchain.commons.utils;

/**
 * @author 董少飞
 * // TODO: 2019/5/19 dsf
 * @date 2019/5/19
 */
public class FileUtil {

    public static void copy(String source, String target) {


    }

    public static String getFileName(String filePath) {

        String[] split = filePath.split("/");
        if(split.length > 0) {

            return split[split.length-1];
        }
        return filePath;
    }
}
