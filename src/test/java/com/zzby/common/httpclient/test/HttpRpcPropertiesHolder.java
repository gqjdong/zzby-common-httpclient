package com.zzby.common.httpclient.test;

import com.zzby.common.httpclient.HttpClientPropertiesHolder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Properties;


public class HttpRpcPropertiesHolder {

    private static final Log logger = LogFactory.getLog(HttpRpcPropertiesHolder.class);
    
    private static final String PROPERTIES_NAME = "httprpc.properties";
    private static final Properties properties;
    public static final String PREFIX_AREA = "area.";

    static {
        properties = PropertiesUtil.getInstanceByFileName(PROPERTIES_NAME);
    }

    public static int getSocketBufferSize(String prefix) {
        int size = HttpClientPropertiesHolder.getSocketBufferSize();
        try {
            size = Integer.parseInt(properties.getProperty(prefix + "socket.buffer.size")) * 1024;
        } catch (Exception e) {
            logger.error(e);
        }
        return size;
    }

    public static int getConnectionTimeout(String prefix) {
        int time = HttpClientPropertiesHolder.getConnectionTimeout();
        try {
            time = Integer.parseInt(properties.getProperty(prefix + "connection.timeout"));
        } catch (Exception e) {
            logger.error(e);
        }
        return time;
    }

    public static int getSoTimeout(String prefix) {
        int time = HttpClientPropertiesHolder.getSoTimeout();
        try {
            time = Integer.parseInt(properties.getProperty(prefix + "so.timeout"));
        } catch (Exception e) {
            logger.error(e);
        }
        return time;
    }

    public static long getConnectionManagerTimeout(String prefix) {
        long time = HttpClientPropertiesHolder.getConnectionManagerTimeout();
        try {
            time = Long.parseLong(properties.getProperty(prefix + "connection.manager.timeout"));
        } catch (Exception e) {
            logger.error(e);
        }
        return time;
    }

    public static boolean isEnableConnectionRepeat(String prefix) {
        boolean enable = HttpClientPropertiesHolder.isEnableConnectionRepeat();
        try {
            enable = Boolean.parseBoolean(properties.getProperty(prefix + "connection.repeat.enable"));
        } catch (Exception e) {
            logger.error(e);
        }
        return enable;
    }

    public static int getConnectionRepeatCount(String prefix) {
        int count = HttpClientPropertiesHolder.getConnectionRepeatCount();
        try {
            count = Integer.parseInt(properties.getProperty(prefix + "connection.repeat.count"));
        } catch (Exception e) {
            logger.error(e);
        }
        return count;
    }

    public static int getMultiThreadConnectionPoolMaxHost(String prefix) {
        int maxHost = HttpClientPropertiesHolder.getMultiThreadConnectionPoolMaxHost();
        try {
            maxHost = Integer.parseInt(properties.getProperty(prefix + "connection.pool.multithread.max.host"));
        } catch (Exception e) {
            logger.error(e);
        }
        return maxHost;
    }

    public static int getMultiThreadConnectionPoolMaxTotal(String prefix) {
        int maxTotal = HttpClientPropertiesHolder.getMultiThreadConnectionPoolMaxTotal();
        try {
            maxTotal = Integer.parseInt(properties.getProperty(prefix + "connection.pool.multithread.max.total"));
        } catch (Exception e) {
            logger.error(e);
        }
        return maxTotal;
    }

}
