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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListSkillGroupSummaryReportsSinceMidnightResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSkillGroupSummaryReportsSinceMidnightResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private PagedSkillGroupSummaryReport pagedSkillGroupSummaryReport;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

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

	public PagedSkillGroupSummaryReport getPagedSkillGroupSummaryReport() {
		return this.pagedSkillGroupSummaryReport;
	}

	public void setPagedSkillGroupSummaryReport(PagedSkillGroupSummaryReport pagedSkillGroupSummaryReport) {
		this.pagedSkillGroupSummaryReport = pagedSkillGroupSummaryReport;
	}

	public static class PagedSkillGroupSummaryReport {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<SkillGroupSummaryReport> list;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<SkillGroupSummaryReport> getList() {
			return this.list;
		}

		public void setList(List<SkillGroupSummaryReport> list) {
			this.list = list;
		}

		public static class SkillGroupSummaryReport {

			private String timestamp;

			private String instanceId;

			private String skillGroupName;

			private String skillGroupId;

			private Overall overall;

			private Inbound inbound;

			private Outbound outbound;

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getSkillGroupName() {
				return this.skillGroupName;
			}

			public void setSkillGroupName(String skillGroupName) {
				this.skillGroupName = skillGroupName;
			}

			public String getSkillGroupId() {
				return this.skillGroupId;
			}

			public void setSkillGroupId(String skillGroupId) {
				this.skillGroupId = skillGroupId;
			}

			public Overall getOverall() {
				return this.overall;
			}

			public void setOverall(Overall overall) {
				this.overall = overall;
			}

			public Inbound getInbound() {
				return this.inbound;
			}

			public void setInbound(Inbound inbound) {
				this.inbound = inbound;
			}

			public Outbound getOutbound() {
				return this.outbound;
			}

			public void setOutbound(Outbound outbound) {
				this.outbound = outbound;
			}

			public static class Overall {

				private Long totalLoggedInTime;

				private Long totalTalkTime;

				private Float occupancyRate;

				private Long totalWorkTime;

				private Long maxWorkTime;

				private Long averageWorkTime;

				private Long averageTalkTime;

				private Float satisfactionIndex;

				private Long satisfactionSurveysOffered;

				private Long satisfactionSurveysResponded;

				private Long maxReadyTime;

				private Long averageReadyTime;

				private Long totalBreakTime;

				private Long totalReadyTime;

				private Long maxTalkTime;

				private Long totalCalls;

				public Long getTotalLoggedInTime() {
					return this.totalLoggedInTime;
				}

				public void setTotalLoggedInTime(Long totalLoggedInTime) {
					this.totalLoggedInTime = totalLoggedInTime;
				}

				public Long getTotalTalkTime() {
					return this.totalTalkTime;
				}

				public void setTotalTalkTime(Long totalTalkTime) {
					this.totalTalkTime = totalTalkTime;
				}

				public Float getOccupancyRate() {
					return this.occupancyRate;
				}

				public void setOccupancyRate(Float occupancyRate) {
					this.occupancyRate = occupancyRate;
				}

				public Long getTotalWorkTime() {
					return this.totalWorkTime;
				}

				public void setTotalWorkTime(Long totalWorkTime) {
					this.totalWorkTime = totalWorkTime;
				}

				public Long getMaxWorkTime() {
					return this.maxWorkTime;
				}

				public void setMaxWorkTime(Long maxWorkTime) {
					this.maxWorkTime = maxWorkTime;
				}

				public Long getAverageWorkTime() {
					return this.averageWorkTime;
				}

				public void setAverageWorkTime(Long averageWorkTime) {
					this.averageWorkTime = averageWorkTime;
				}

				public Long getAverageTalkTime() {
					return this.averageTalkTime;
				}

				public void setAverageTalkTime(Long averageTalkTime) {
					this.averageTalkTime = averageTalkTime;
				}

				public Float getSatisfactionIndex() {
					return this.satisfactionIndex;
				}

				public void setSatisfactionIndex(Float satisfactionIndex) {
					this.satisfactionIndex = satisfactionIndex;
				}

				public Long getSatisfactionSurveysOffered() {
					return this.satisfactionSurveysOffered;
				}

				public void setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
					this.satisfactionSurveysOffered = satisfactionSurveysOffered;
				}

				public Long getSatisfactionSurveysResponded() {
					return this.satisfactionSurveysResponded;
				}

				public void setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
					this.satisfactionSurveysResponded = satisfactionSurveysResponded;
				}

				public Long getMaxReadyTime() {
					return this.maxReadyTime;
				}

				public void setMaxReadyTime(Long maxReadyTime) {
					this.maxReadyTime = maxReadyTime;
				}

				public Long getAverageReadyTime() {
					return this.averageReadyTime;
				}

				public void setAverageReadyTime(Long averageReadyTime) {
					this.averageReadyTime = averageReadyTime;
				}

				public Long getTotalBreakTime() {
					return this.totalBreakTime;
				}

				public void setTotalBreakTime(Long totalBreakTime) {
					this.totalBreakTime = totalBreakTime;
				}

				public Long getTotalReadyTime() {
					return this.totalReadyTime;
				}

				public void setTotalReadyTime(Long totalReadyTime) {
					this.totalReadyTime = totalReadyTime;
				}

				public Long getMaxTalkTime() {
					return this.maxTalkTime;
				}

				public void setMaxTalkTime(Long maxTalkTime) {
					this.maxTalkTime = maxTalkTime;
				}

				public Long getTotalCalls() {
					return this.totalCalls;
				}

				public void setTotalCalls(Long totalCalls) {
					this.totalCalls = totalCalls;
				}
			}

			public static class Inbound {

				private Long averageRingTime;

				private Long callsHandled;

				private Long totalWorkTime;

				private Long maxWorkTime;

				private Long queueMaxWaitTimeDuration;

				private Long averageWorkTime;

				private Float satisfactionIndex;

				private Long answeredByAgentOfQueueWaitTimeDuration;

				private Long totalRingTime;

				private Long inComingQueueOfQueueCount;

				private String maxTalkTime;

				private Long maxRingTime;

				private Long totalTalkTime;

				private Long callsOffered;

				private Long abandonedInQueueOfQueueCount;

				private Long overFlowInQueueOfQueueCount;

				private Long answeredByAgentOfQueueMaxWaitTimeDuration;

				private Float serviceLevel20;

				private Long averageTalkTime;

				private Long answeredByAgentOfQueueCount;

				private Long satisfactionSurveysOffered;

				private Float handleRate;

				private Long satisfactionSurveysResponded;

				private Long giveUpByAgentOfQueueCount;

				private Long queueWaitTimeDuration;

				public Long getAverageRingTime() {
					return this.averageRingTime;
				}

				public void setAverageRingTime(Long averageRingTime) {
					this.averageRingTime = averageRingTime;
				}

				public Long getCallsHandled() {
					return this.callsHandled;
				}

				public void setCallsHandled(Long callsHandled) {
					this.callsHandled = callsHandled;
				}

				public Long getTotalWorkTime() {
					return this.totalWorkTime;
				}

				public void setTotalWorkTime(Long totalWorkTime) {
					this.totalWorkTime = totalWorkTime;
				}

				public Long getMaxWorkTime() {
					return this.maxWorkTime;
				}

				public void setMaxWorkTime(Long maxWorkTime) {
					this.maxWorkTime = maxWorkTime;
				}

				public Long getQueueMaxWaitTimeDuration() {
					return this.queueMaxWaitTimeDuration;
				}

				public void setQueueMaxWaitTimeDuration(Long queueMaxWaitTimeDuration) {
					this.queueMaxWaitTimeDuration = queueMaxWaitTimeDuration;
				}

				public Long getAverageWorkTime() {
					return this.averageWorkTime;
				}

				public void setAverageWorkTime(Long averageWorkTime) {
					this.averageWorkTime = averageWorkTime;
				}

				public Float getSatisfactionIndex() {
					return this.satisfactionIndex;
				}

				public void setSatisfactionIndex(Float satisfactionIndex) {
					this.satisfactionIndex = satisfactionIndex;
				}

				public Long getAnsweredByAgentOfQueueWaitTimeDuration() {
					return this.answeredByAgentOfQueueWaitTimeDuration;
				}

				public void setAnsweredByAgentOfQueueWaitTimeDuration(Long answeredByAgentOfQueueWaitTimeDuration) {
					this.answeredByAgentOfQueueWaitTimeDuration = answeredByAgentOfQueueWaitTimeDuration;
				}

				public Long getTotalRingTime() {
					return this.totalRingTime;
				}

				public void setTotalRingTime(Long totalRingTime) {
					this.totalRingTime = totalRingTime;
				}

				public Long getInComingQueueOfQueueCount() {
					return this.inComingQueueOfQueueCount;
				}

				public void setInComingQueueOfQueueCount(Long inComingQueueOfQueueCount) {
					this.inComingQueueOfQueueCount = inComingQueueOfQueueCount;
				}

				public String getMaxTalkTime() {
					return this.maxTalkTime;
				}

				public void setMaxTalkTime(String maxTalkTime) {
					this.maxTalkTime = maxTalkTime;
				}

				public Long getMaxRingTime() {
					return this.maxRingTime;
				}

				public void setMaxRingTime(Long maxRingTime) {
					this.maxRingTime = maxRingTime;
				}

				public Long getTotalTalkTime() {
					return this.totalTalkTime;
				}

				public void setTotalTalkTime(Long totalTalkTime) {
					this.totalTalkTime = totalTalkTime;
				}

				public Long getCallsOffered() {
					return this.callsOffered;
				}

				public void setCallsOffered(Long callsOffered) {
					this.callsOffered = callsOffered;
				}

				public Long getAbandonedInQueueOfQueueCount() {
					return this.abandonedInQueueOfQueueCount;
				}

				public void setAbandonedInQueueOfQueueCount(Long abandonedInQueueOfQueueCount) {
					this.abandonedInQueueOfQueueCount = abandonedInQueueOfQueueCount;
				}

				public Long getOverFlowInQueueOfQueueCount() {
					return this.overFlowInQueueOfQueueCount;
				}

				public void setOverFlowInQueueOfQueueCount(Long overFlowInQueueOfQueueCount) {
					this.overFlowInQueueOfQueueCount = overFlowInQueueOfQueueCount;
				}

				public Long getAnsweredByAgentOfQueueMaxWaitTimeDuration() {
					return this.answeredByAgentOfQueueMaxWaitTimeDuration;
				}

				public void setAnsweredByAgentOfQueueMaxWaitTimeDuration(Long answeredByAgentOfQueueMaxWaitTimeDuration) {
					this.answeredByAgentOfQueueMaxWaitTimeDuration = answeredByAgentOfQueueMaxWaitTimeDuration;
				}

				public Float getServiceLevel20() {
					return this.serviceLevel20;
				}

				public void setServiceLevel20(Float serviceLevel20) {
					this.serviceLevel20 = serviceLevel20;
				}

				public Long getAverageTalkTime() {
					return this.averageTalkTime;
				}

				public void setAverageTalkTime(Long averageTalkTime) {
					this.averageTalkTime = averageTalkTime;
				}

				public Long getAnsweredByAgentOfQueueCount() {
					return this.answeredByAgentOfQueueCount;
				}

				public void setAnsweredByAgentOfQueueCount(Long answeredByAgentOfQueueCount) {
					this.answeredByAgentOfQueueCount = answeredByAgentOfQueueCount;
				}

				public Long getSatisfactionSurveysOffered() {
					return this.satisfactionSurveysOffered;
				}

				public void setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
					this.satisfactionSurveysOffered = satisfactionSurveysOffered;
				}

				public Float getHandleRate() {
					return this.handleRate;
				}

				public void setHandleRate(Float handleRate) {
					this.handleRate = handleRate;
				}

				public Long getSatisfactionSurveysResponded() {
					return this.satisfactionSurveysResponded;
				}

				public void setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
					this.satisfactionSurveysResponded = satisfactionSurveysResponded;
				}

				public Long getGiveUpByAgentOfQueueCount() {
					return this.giveUpByAgentOfQueueCount;
				}

				public void setGiveUpByAgentOfQueueCount(Long giveUpByAgentOfQueueCount) {
					this.giveUpByAgentOfQueueCount = giveUpByAgentOfQueueCount;
				}

				public Long getQueueWaitTimeDuration() {
					return this.queueWaitTimeDuration;
				}

				public void setQueueWaitTimeDuration(Long queueWaitTimeDuration) {
					this.queueWaitTimeDuration = queueWaitTimeDuration;
				}
			}

			public static class Outbound {

				private Long totalTalkTime;

				private Long maxDialingTime;

				private Long callsDialed;

				private Long callsAnswered;

				private Float answerRate;

				private Long totalWorkTime;

				private Long maxWorkTime;

				private Long totalDialingTime;

				private Long averageTalkTime;

				private Long averageWorkTime;

				private Float satisfactionIndex;

				private Long satisfactionSurveysOffered;

				private Long satisfactionSurveysResponded;

				private Long maxTalkTime;

				private Long averageDialingTime;

				public Long getTotalTalkTime() {
					return this.totalTalkTime;
				}

				public void setTotalTalkTime(Long totalTalkTime) {
					this.totalTalkTime = totalTalkTime;
				}

				public Long getMaxDialingTime() {
					return this.maxDialingTime;
				}

				public void setMaxDialingTime(Long maxDialingTime) {
					this.maxDialingTime = maxDialingTime;
				}

				public Long getCallsDialed() {
					return this.callsDialed;
				}

				public void setCallsDialed(Long callsDialed) {
					this.callsDialed = callsDialed;
				}

				public Long getCallsAnswered() {
					return this.callsAnswered;
				}

				public void setCallsAnswered(Long callsAnswered) {
					this.callsAnswered = callsAnswered;
				}

				public Float getAnswerRate() {
					return this.answerRate;
				}

				public void setAnswerRate(Float answerRate) {
					this.answerRate = answerRate;
				}

				public Long getTotalWorkTime() {
					return this.totalWorkTime;
				}

				public void setTotalWorkTime(Long totalWorkTime) {
					this.totalWorkTime = totalWorkTime;
				}

				public Long getMaxWorkTime() {
					return this.maxWorkTime;
				}

				public void setMaxWorkTime(Long maxWorkTime) {
					this.maxWorkTime = maxWorkTime;
				}

				public Long getTotalDialingTime() {
					return this.totalDialingTime;
				}

				public void setTotalDialingTime(Long totalDialingTime) {
					this.totalDialingTime = totalDialingTime;
				}

				public Long getAverageTalkTime() {
					return this.averageTalkTime;
				}

				public void setAverageTalkTime(Long averageTalkTime) {
					this.averageTalkTime = averageTalkTime;
				}

				public Long getAverageWorkTime() {
					return this.averageWorkTime;
				}

				public void setAverageWorkTime(Long averageWorkTime) {
					this.averageWorkTime = averageWorkTime;
				}

				public Float getSatisfactionIndex() {
					return this.satisfactionIndex;
				}

				public void setSatisfactionIndex(Float satisfactionIndex) {
					this.satisfactionIndex = satisfactionIndex;
				}

				public Long getSatisfactionSurveysOffered() {
					return this.satisfactionSurveysOffered;
				}

				public void setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
					this.satisfactionSurveysOffered = satisfactionSurveysOffered;
				}

				public Long getSatisfactionSurveysResponded() {
					return this.satisfactionSurveysResponded;
				}

				public void setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
					this.satisfactionSurveysResponded = satisfactionSurveysResponded;
				}

				public Long getMaxTalkTime() {
					return this.maxTalkTime;
				}

				public void setMaxTalkTime(Long maxTalkTime) {
					this.maxTalkTime = maxTalkTime;
				}

				public Long getAverageDialingTime() {
					return this.averageDialingTime;
				}

				public void setAverageDialingTime(Long averageDialingTime) {
					this.averageDialingTime = averageDialingTime;
				}
			}
		}
	}

	@Override
	public ListSkillGroupSummaryReportsSinceMidnightResponse getInstance(UnmarshallerContext context) {
		return	ListSkillGroupSummaryReportsSinceMidnightResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
