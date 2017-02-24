package com.zzby.common.httpclient.client;

public interface IHttpsHandler {
	
	/**
	 * 发送https请求前处理
	 */
	void beforeSendHttps();
	
	/**
	 * 发送https请求后处理
	 */
	void afterSendHttps();
}
