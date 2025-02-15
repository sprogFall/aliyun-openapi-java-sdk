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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddFaceRequest extends RpcAcsRequest<AddFaceResponse> {
	   

	private String entityId;

	private Float qualityScoreThreshold;

	private Float similarityScoreThresholdBetweenEntity;

	private String extraData;

	private Float similarityScoreThresholdInEntity;

	private String dbName;

	private String imageUrl;
	public AddFaceRequest() {
		super("facebody", "2019-12-30", "AddFace");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEntityId() {
		return this.entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
		if(entityId != null){
			putBodyParameter("EntityId", entityId);
		}
	}

	public Float getQualityScoreThreshold() {
		return this.qualityScoreThreshold;
	}

	public void setQualityScoreThreshold(Float qualityScoreThreshold) {
		this.qualityScoreThreshold = qualityScoreThreshold;
		if(qualityScoreThreshold != null){
			putBodyParameter("QualityScoreThreshold", qualityScoreThreshold.toString());
		}
	}

	public Float getSimilarityScoreThresholdBetweenEntity() {
		return this.similarityScoreThresholdBetweenEntity;
	}

	public void setSimilarityScoreThresholdBetweenEntity(Float similarityScoreThresholdBetweenEntity) {
		this.similarityScoreThresholdBetweenEntity = similarityScoreThresholdBetweenEntity;
		if(similarityScoreThresholdBetweenEntity != null){
			putBodyParameter("SimilarityScoreThresholdBetweenEntity", similarityScoreThresholdBetweenEntity.toString());
		}
	}

	public String getExtraData() {
		return this.extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
		if(extraData != null){
			putBodyParameter("ExtraData", extraData);
		}
	}

	public Float getSimilarityScoreThresholdInEntity() {
		return this.similarityScoreThresholdInEntity;
	}

	public void setSimilarityScoreThresholdInEntity(Float similarityScoreThresholdInEntity) {
		this.similarityScoreThresholdInEntity = similarityScoreThresholdInEntity;
		if(similarityScoreThresholdInEntity != null){
			putBodyParameter("SimilarityScoreThresholdInEntity", similarityScoreThresholdInEntity.toString());
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putBodyParameter("DbName", dbName);
		}
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putBodyParameter("ImageUrl", imageUrl);
		}
	}

	@Override
	public Class<AddFaceResponse> getResponseClass() {
		return AddFaceResponse.class;
	}

}
