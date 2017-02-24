package com.zzby.common.httpclient;

import com.zzby.common.httpclient.client.IHttpClient;
import com.zzby.common.httpclient.client.IHttpsHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * https动太代理的处理类
 * @author Administrator
 *
 */
public class HttpsSSLInvocationHandler implements InvocationHandler{

	private IHttpClient client;
	
	private IHttpsHandler handler;
	
	public HttpsSSLInvocationHandler(IHttpClient client,IHttpsHandler handler){
		this.client = client;
		this.handler = handler;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 发送https请求前处理
		handler.beforeSendHttps();
		Object result = method.invoke(client, args);
		// 发送https请求后处理
		handler.afterSendHttps();
		return result;
	}
	
}
