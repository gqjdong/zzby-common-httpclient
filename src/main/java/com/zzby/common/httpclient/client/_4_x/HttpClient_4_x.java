package com.zzby.common.httpclient.client._4_x;

import com.zzby.common.httpclient.HttpClientParam;
import com.zzby.common.httpclient.client.IHttpClient;
import com.zzby.common.httpclient.modle.ReqModle;
import com.zzby.common.httpclient.modle.ResModle;

import java.util.Map;

public class HttpClient_4_x implements IHttpClient {
	
	@SuppressWarnings("unused")
	private HttpClientParam param;
	
	public HttpClient_4_x(boolean useNewClient){
		if(!useNewClient){
			initClient();
		}
	}
	
	/**
	 * 初始化httpClient
	 */
	private void initClient(){
		
	}
	
	@Override
	public void setHttpClientParam(HttpClientParam param) {
		this.param = param;
	}

	@Override
	public ResModle sendRequest(ReqModle request,
			boolean followRedirect, boolean useCookie) {
		
		return null;
	}

	@Override
	public ResModle sendGet(ReqModle request, boolean followRedirect,
			boolean useCookie) {
		
		return null;
	}

	@Override
	public ResModle sendGet(ReqModle request, boolean useCookie) {
		
		return null;
	}

	@Override
	public ResModle sendGet(ReqModle request) {
		
		return null;
	}

	@Override
	public ResModle sendGet(String url, boolean followRedirect,
			boolean useCookie) {
		
		return null;
	}

	@Override
	public ResModle sendGet(String url, boolean useCookie) {
		
		return null;
	}

	@Override
	public ResModle sendGet(String url) {
		
		return null;
	}

	@Override
	public ResModle sendPost(ReqModle request, boolean useCookie) {
		
		return null;
	}

	@Override
	public ResModle sendPost(ReqModle request) {
		
		return null;
	}

	@Override
	public ResModle sendPost(String url, Map<String, String> param,
			boolean useCookie) {
		
		return null;
	}

	@Override
	public ResModle sendPost(String url, Map<String, String> param) {
		
		return null;
	}

	@Override
	public ResModle sendPost(String url, boolean useCookie) {
		
		return null;
	}

	@Override
	public ResModle sendPost(String url) {
		
		return null;
	}
	
}
