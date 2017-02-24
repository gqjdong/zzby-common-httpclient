package com.zzby.common.httpclient.test;

import com.zzby.common.httpclient.client.IHttpClient;
import com.zzby.common.httpclient.modle.ResModle;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-2-23
 * Time: 下午8:29
 * To change this template use File | Settings | File Templates.
 */
public class HttpClientTest {

    public static void main(String[] args) throws Exception{
        IHttpClient client = HttpClientRpc.AREA.getInstance(false);
        ResModle resModle = client.sendGet("http://www.baidu.com");
        System.out.println(resModle.getStatusCode());
        System.out.println(resModle.getStatusText());
        System.out.println(resModle.getBody());
    }

}
