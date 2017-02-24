package com.zzby.common.httpclient.client._3_x;

import com.zzby.common.httpclient.HttpClientConstants;
import com.zzby.common.httpclient.client.IHttpsHandler;
import org.apache.commons.httpclient.protocol.Protocol;

public class HttpsHandler_3_x implements IHttpsHandler {

	@Override
	public void beforeSendHttps() {
		Protocol https = new Protocol(HttpClientConstants.PROTOCOL_HTTPS_NAME,
				new HttpsSSLProtocolSocketFactory(),
				HttpClientConstants.PROTOCOL_HTTPS_PORT);
		Protocol.registerProtocol(HttpClientConstants.PROTOCOL_HTTPS_NAME, https);
	}

	@Override
	public void afterSendHttps() {
		Protocol.unregisterProtocol(HttpClientConstants.PROTOCOL_HTTPS_NAME);
	}

}
