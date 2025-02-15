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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ForbidLiveCustomStreamRequest extends RpcAcsRequest<ForbidLiveCustomStreamResponse> {
	   

	private String styp;

	private String appName;

	private String streamName;

	private String needwm;

	private String resumeTime;

	private String liveStreamType;

	private String domainName;

	private Long ownerId;

	private String sphd;

	private String oneshot;

	private String appid;

	private String ratio;
	public ForbidLiveCustomStreamRequest() {
		super("live", "2016-11-01", "ForbidLiveCustomStream", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStyp() {
		return this.styp;
	}

	public void setStyp(String styp) {
		this.styp = styp;
		if(styp != null){
			putQueryParameter("Styp", styp);
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

	public String getStreamName() {
		return this.streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
		if(streamName != null){
			putQueryParameter("StreamName", streamName);
		}
	}

	public String getNeedwm() {
		return this.needwm;
	}

	public void setNeedwm(String needwm) {
		this.needwm = needwm;
		if(needwm != null){
			putQueryParameter("Needwm", needwm);
		}
	}

	public String getResumeTime() {
		return this.resumeTime;
	}

	public void setResumeTime(String resumeTime) {
		this.resumeTime = resumeTime;
		if(resumeTime != null){
			putQueryParameter("ResumeTime", resumeTime);
		}
	}

	public String getLiveStreamType() {
		return this.liveStreamType;
	}

	public void setLiveStreamType(String liveStreamType) {
		this.liveStreamType = liveStreamType;
		if(liveStreamType != null){
			putQueryParameter("LiveStreamType", liveStreamType);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSphd() {
		return this.sphd;
	}

	public void setSphd(String sphd) {
		this.sphd = sphd;
		if(sphd != null){
			putQueryParameter("Sphd", sphd);
		}
	}

	public String getOneshot() {
		return this.oneshot;
	}

	public void setOneshot(String oneshot) {
		this.oneshot = oneshot;
		if(oneshot != null){
			putQueryParameter("Oneshot", oneshot);
		}
	}

	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
		if(appid != null){
			putQueryParameter("Appid", appid);
		}
	}

	public String getRatio() {
		return this.ratio;
	}

	public void setRatio(String ratio) {
		this.ratio = ratio;
		if(ratio != null){
			putQueryParameter("Ratio", ratio);
		}
	}

	@Override
	public Class<ForbidLiveCustomStreamResponse> getResponseClass() {
		return ForbidLiveCustomStreamResponse.class;
	}

}
