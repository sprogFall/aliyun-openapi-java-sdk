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

package com.aliyuncs.cloudauth.model.v20180916;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20180916.GetStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStatusResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Float similarityScore;

		private Float authorityComparisonScore;

		private Float trustedScore;

		private Integer statusCode;

		private String auditConclusions;

		public Float getSimilarityScore() {
			return this.similarityScore;
		}

		public void setSimilarityScore(Float similarityScore) {
			this.similarityScore = similarityScore;
		}

		public Float getAuthorityComparisonScore() {
			return this.authorityComparisonScore;
		}

		public void setAuthorityComparisonScore(Float authorityComparisonScore) {
			this.authorityComparisonScore = authorityComparisonScore;
		}

		public Float getTrustedScore() {
			return this.trustedScore;
		}

		public void setTrustedScore(Float trustedScore) {
			this.trustedScore = trustedScore;
		}

		public Integer getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(Integer statusCode) {
			this.statusCode = statusCode;
		}

		public String getAuditConclusions() {
			return this.auditConclusions;
		}

		public void setAuditConclusions(String auditConclusions) {
			this.auditConclusions = auditConclusions;
		}
	}

	@Override
	public GetStatusResponse getInstance(UnmarshallerContext context) {
		return	GetStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
