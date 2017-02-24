package com.zzby.common.httpclient.test;

import com.zzby.common.httpclient.HttpClientManager;
import com.zzby.common.httpclient.HttpClientParam;
import com.zzby.common.httpclient.client.IHttpClient;

public enum HttpClientRpc {
	// 地区
    AREA(HttpRpcPropertiesHolder.PREFIX_AREA);

	private String prefix;
	
	private IHttpClient httpClient;
	
	private IHttpClient httpsClient;
	
	private HttpClientRpc(String prefix) {
		this.prefix = prefix;
	}
	
	public synchronized IHttpClient getInstance(boolean isSafe) {
		if (isSafe) {
			if (httpsClient == null) {
				httpsClient = HttpClientManager.createClient(true);
				initClientFromParam(httpsClient,prefix);
			}
		} else {
			if (httpClient == null) {
				httpClient = HttpClientManager.createClient(false);
				initClientFromParam(httpClient,prefix);
			}
		}
		return isSafe ? httpsClient : httpClient;
	}
	
	/**
	 * 根据前缀不同，为不同的client初始化不同的配置
	 * @param client
	 * @param prefix
	 */
	private void initClientFromParam(IHttpClient client,String prefix){
		HttpClientParam param = new HttpClientParam();
		param.setSocketBufferSize(HttpRpcPropertiesHolder.getSocketBufferSize(prefix));
		param.setConnectionTimeout(HttpRpcPropertiesHolder.getConnectionTimeout(prefix));
		param.setSoTimeout(HttpRpcPropertiesHolder.getSoTimeout(prefix));
		param.setConnectionManagerTimeout(HttpRpcPropertiesHolder.getConnectionManagerTimeout(prefix));
		param.setRequestSentRetryEnabled(HttpRpcPropertiesHolder.isEnableConnectionRepeat(prefix));
		param.setRetryCount(HttpRpcPropertiesHolder.getConnectionRepeatCount(prefix));
		client.setHttpClientParam(param);
	}

	public IHttpClient getHttpClient() {
		return httpClient;
	}

	public IHttpClient getHttpsClient() {
		return httpsClient;
	}

	public String getPrefix() {
		return prefix;
	}

}
