package com.cc.o2o.util;

public class PathUtil {

    //根据操作系统不同，获取不同的分隔符
    private static String seperator = System.getProperty("file.separator");

    private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();

    public static String getImgBasePath(){
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")){
            basePath = "F:/projectdev/image/";
        }else {
            basePath = "/home/cc/image/";
        }
        basePath = basePath.replace("/",seperator);
        return basePath;
    }


    public static String getShopImagePath(Long shopId){
        String imagePath = "upload/item/shop/" + shopId + "/";
        return imagePath.replace("/",seperator);
    }


    public static String getBasePath(){
        return basePath;
    }
}
