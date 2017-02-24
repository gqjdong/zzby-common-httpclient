package com.zzby.common.httpclient.client._3_x;

import com.zzby.common.httpclient.HttpClientParam;
import com.zzby.common.httpclient.HttpClientPropertiesHolder;
import org.apache.commons.httpclient.HttpConnectionManager;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;

public class MyConnectionManager {
	
	static HttpConnectionManager multiManager;
	
	private MyConnectionManager(){
		
	}
	
	public static void initMultiManager(HttpClientParam param){
		multiManager = new MultiThreadedHttpConnectionManager();
		HttpConnectionManagerParams params = new HttpConnectionManagerParams();
		params.setStaleCheckingEnabled(true);
		params.setDefaultMaxConnectionsPerHost(param.getMaxConnectionsPerHost());
		params.setMaxTotalConnections(param.getMaxTotalConnections());
		params.setTcpNoDelay(false);
		multiManager.setParams(params);
	}
	
	public static synchronized HttpConnectionManager getConnectionManager(HttpClientParam param){
		if(multiManager == null){
			initMultiManager(param);
		}
		return multiManager;
	}
	
}
