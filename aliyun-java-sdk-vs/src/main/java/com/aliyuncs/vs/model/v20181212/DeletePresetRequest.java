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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeletePresetRequest extends RpcAcsRequest<DeletePresetResponse> {
	   

	private String subProtocol;

	private String id;

	private String presetId;

	private Long ownerId;
	public DeletePresetRequest() {
		super("vs", "2018-12-12", "DeletePreset");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubProtocol() {
		return this.subProtocol;
	}

	public void setSubProtocol(String subProtocol) {
		this.subProtocol = subProtocol;
		if(subProtocol != null){
			putQueryParameter("SubProtocol", subProtocol);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getPresetId() {
		return this.presetId;
	}

	public void setPresetId(String presetId) {
		this.presetId = presetId;
		if(presetId != null){
			putQueryParameter("PresetId", presetId);
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

	@Override
	public Class<DeletePresetResponse> getResponseClass() {
		return DeletePresetResponse.class;
	}

}
