package com.cc.o2o.util;

import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestUtil {

    public static Integer getInt(HttpServletRequest request,String key){
        try {
            return Integer.valueOf(request.getParameter(key));
        }catch (Exception e){
            return -1;
        }
    }

    public static Long getLong(HttpServletRequest request, String key){
        try {
            return Long.valueOf(request.getParameter(key));
        }catch (Exception e){
            return -1L;
        }
    }

    public static Double getDouble(HttpServletRequest request, String key){
        try {
            return Double.valueOf(request.getParameter(key));
        }catch (Exception e){
            return -1d;
        }
    }

    public static Boolean getBoolean(HttpServletRequest request,String key){
        try {
            return Boolean.valueOf(request.getParameter(key));
        }catch (Exception e){
            return false;
        }
    }

    public static String getString(HttpServletRequest request,String key){
        try {
            String result = request.getParameter(key);
            if (request != null){
                result = result.trim();
            }
            if ("".equals(result)){
                result = null;
            }
            return null;
        }catch (Exception e){
            return null;
        }
    }

}
