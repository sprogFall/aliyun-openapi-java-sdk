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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeCloudAssistantStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudAssistantStatusResponse extends AcsResponse {

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private Long totalCount;

	private List<InstanceCloudAssistantStatus> instanceCloudAssistantStatusSet;

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<InstanceCloudAssistantStatus> getInstanceCloudAssistantStatusSet() {
		return this.instanceCloudAssistantStatusSet;
	}

	public void setInstanceCloudAssistantStatusSet(List<InstanceCloudAssistantStatus> instanceCloudAssistantStatusSet) {
		this.instanceCloudAssistantStatusSet = instanceCloudAssistantStatusSet;
	}

	public static class InstanceCloudAssistantStatus {

		private String cloudAssistantStatus;

		private String lastInvokedTime;

		private String cloudAssistantVersion;

		private Long activeTaskCount;

		private Long invocationCount;

		private String instanceId;

		private String lastHeartbeatTime;

		private String oSType;

		private Boolean supportSessionManager;

		public String getCloudAssistantStatus() {
			return this.cloudAssistantStatus;
		}

		public void setCloudAssistantStatus(String cloudAssistantStatus) {
			this.cloudAssistantStatus = cloudAssistantStatus;
		}

		public String getLastInvokedTime() {
			return this.lastInvokedTime;
		}

		public void setLastInvokedTime(String lastInvokedTime) {
			this.lastInvokedTime = lastInvokedTime;
		}

		public String getCloudAssistantVersion() {
			return this.cloudAssistantVersion;
		}

		public void setCloudAssistantVersion(String cloudAssistantVersion) {
			this.cloudAssistantVersion = cloudAssistantVersion;
		}

		public Long getActiveTaskCount() {
			return this.activeTaskCount;
		}

		public void setActiveTaskCount(Long activeTaskCount) {
			this.activeTaskCount = activeTaskCount;
		}

		public Long getInvocationCount() {
			return this.invocationCount;
		}

		public void setInvocationCount(Long invocationCount) {
			this.invocationCount = invocationCount;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getLastHeartbeatTime() {
			return this.lastHeartbeatTime;
		}

		public void setLastHeartbeatTime(String lastHeartbeatTime) {
			this.lastHeartbeatTime = lastHeartbeatTime;
		}

		public String getOSType() {
			return this.oSType;
		}

		public void setOSType(String oSType) {
			this.oSType = oSType;
		}

		public Boolean getSupportSessionManager() {
			return this.supportSessionManager;
		}

		public void setSupportSessionManager(Boolean supportSessionManager) {
			this.supportSessionManager = supportSessionManager;
		}
	}

	@Override
	public DescribeCloudAssistantStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudAssistantStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
