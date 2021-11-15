/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMediaRequest extends RpcAcsRequest<CreateMediaResponse> {
	   

	private String business;

	private String clientToken;

	private String media;

	private String userId;

	private String originSiteUserId;

	private String environment;

	private String appName;

	private String tenantId;

	private String userSite;
	public CreateMediaRequest() {
		super("UniMkt", "2018-12-12", "CreateMedia");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBusiness() {
		return this.business;
	}

	public void setBusiness(String business) {
		this.business = business;
		if(business != null){
			putQueryParameter("Business", business);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getMedia() {
		return this.media;
	}

	public void setMedia(String media) {
		this.media = media;
		if(media != null){
			putBodyParameter("Media", media);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getOriginSiteUserId() {
		return this.originSiteUserId;
	}

	public void setOriginSiteUserId(String originSiteUserId) {
		this.originSiteUserId = originSiteUserId;
		if(originSiteUserId != null){
			putQueryParameter("OriginSiteUserId", originSiteUserId);
		}
	}

	public String getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
		if(environment != null){
			putQueryParameter("Environment", environment);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getUserSite() {
		return this.userSite;
	}

	public void setUserSite(String userSite) {
		this.userSite = userSite;
		if(userSite != null){
			putQueryParameter("UserSite", userSite);
		}
	}

	@Override
	public Class<CreateMediaResponse> getResponseClass() {
		return CreateMediaResponse.class;
	}

}
