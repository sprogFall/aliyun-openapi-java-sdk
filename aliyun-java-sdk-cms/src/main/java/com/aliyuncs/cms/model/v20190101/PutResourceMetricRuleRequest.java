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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutResourceMetricRuleRequest extends RpcAcsRequest<PutResourceMetricRuleResponse> {
	   

	private String webhook;

	private String escalationsWarnComparisonOperator;

	private String ruleName;

	private String effectiveInterval;

	private String noDataPolicy;

	private String noEffectiveInterval;

	private String emailSubject;

	private String metricName;

	private Integer escalationsWarnTimes;

	private String period;

	private String escalationsWarnThreshold;

	private String contactGroups;

	private String escalationsCriticalStatistics;

	private List<Labels> labelss;

	private String interval;

	private String ruleId;

	private String escalationsCriticalThreshold;

	private String escalationsInfoStatistics;

	private String escalationsInfoComparisonOperator;

	private Integer silenceTime;

	private String resources;

	private Integer escalationsInfoTimes;

	private Integer escalationsCriticalTimes;

	private String escalationsWarnStatistics;

	private String escalationsInfoThreshold;

	private String namespace;

	private String escalationsCriticalComparisonOperator;
	public PutResourceMetricRuleRequest() {
		super("Cms", "2019-01-01", "PutResourceMetricRule", "Cms");
		setMethod(MethodType.POST);
	}

	public String getWebhook() {
		return this.webhook;
	}

	public void setWebhook(String webhook) {
		this.webhook = webhook;
		if(webhook != null){
			putQueryParameter("Webhook", webhook);
		}
	}

	public String getEscalationsWarnComparisonOperator() {
		return this.escalationsWarnComparisonOperator;
	}

	public void setEscalationsWarnComparisonOperator(String escalationsWarnComparisonOperator) {
		this.escalationsWarnComparisonOperator = escalationsWarnComparisonOperator;
		if(escalationsWarnComparisonOperator != null){
			putQueryParameter("Escalations.Warn.ComparisonOperator", escalationsWarnComparisonOperator);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public String getEffectiveInterval() {
		return this.effectiveInterval;
	}

	public void setEffectiveInterval(String effectiveInterval) {
		this.effectiveInterval = effectiveInterval;
		if(effectiveInterval != null){
			putQueryParameter("EffectiveInterval", effectiveInterval);
		}
	}

	public String getNoDataPolicy() {
		return this.noDataPolicy;
	}

	public void setNoDataPolicy(String noDataPolicy) {
		this.noDataPolicy = noDataPolicy;
		if(noDataPolicy != null){
			putQueryParameter("NoDataPolicy", noDataPolicy);
		}
	}

	public String getNoEffectiveInterval() {
		return this.noEffectiveInterval;
	}

	public void setNoEffectiveInterval(String noEffectiveInterval) {
		this.noEffectiveInterval = noEffectiveInterval;
		if(noEffectiveInterval != null){
			putQueryParameter("NoEffectiveInterval", noEffectiveInterval);
		}
	}

	public String getEmailSubject() {
		return this.emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
		if(emailSubject != null){
			putQueryParameter("EmailSubject", emailSubject);
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putQueryParameter("MetricName", metricName);
		}
	}

	public Integer getEscalationsWarnTimes() {
		return this.escalationsWarnTimes;
	}

	public void setEscalationsWarnTimes(Integer escalationsWarnTimes) {
		this.escalationsWarnTimes = escalationsWarnTimes;
		if(escalationsWarnTimes != null){
			putQueryParameter("Escalations.Warn.Times", escalationsWarnTimes.toString());
		}
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public String getEscalationsWarnThreshold() {
		return this.escalationsWarnThreshold;
	}

	public void setEscalationsWarnThreshold(String escalationsWarnThreshold) {
		this.escalationsWarnThreshold = escalationsWarnThreshold;
		if(escalationsWarnThreshold != null){
			putQueryParameter("Escalations.Warn.Threshold", escalationsWarnThreshold);
		}
	}

	public String getContactGroups() {
		return this.contactGroups;
	}

	public void setContactGroups(String contactGroups) {
		this.contactGroups = contactGroups;
		if(contactGroups != null){
			putQueryParameter("ContactGroups", contactGroups);
		}
	}

	public String getEscalationsCriticalStatistics() {
		return this.escalationsCriticalStatistics;
	}

	public void setEscalationsCriticalStatistics(String escalationsCriticalStatistics) {
		this.escalationsCriticalStatistics = escalationsCriticalStatistics;
		if(escalationsCriticalStatistics != null){
			putQueryParameter("Escalations.Critical.Statistics", escalationsCriticalStatistics);
		}
	}

	public List<Labels> getLabelss() {
		return this.labelss;
	}

	public void setLabelss(List<Labels> labelss) {
		this.labelss = labelss;	
		if (labelss != null) {
			for (int depth1 = 0; depth1 < labelss.size(); depth1++) {
				putQueryParameter("Labels." + (depth1 + 1) + ".Value" , labelss.get(depth1).getValue());
				putQueryParameter("Labels." + (depth1 + 1) + ".Key" , labelss.get(depth1).getKey());
			}
		}	
	}

	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval);
		}
	}

	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId);
		}
	}

	public String getEscalationsCriticalThreshold() {
		return this.escalationsCriticalThreshold;
	}

	public void setEscalationsCriticalThreshold(String escalationsCriticalThreshold) {
		this.escalationsCriticalThreshold = escalationsCriticalThreshold;
		if(escalationsCriticalThreshold != null){
			putQueryParameter("Escalations.Critical.Threshold", escalationsCriticalThreshold);
		}
	}

	public String getEscalationsInfoStatistics() {
		return this.escalationsInfoStatistics;
	}

	public void setEscalationsInfoStatistics(String escalationsInfoStatistics) {
		this.escalationsInfoStatistics = escalationsInfoStatistics;
		if(escalationsInfoStatistics != null){
			putQueryParameter("Escalations.Info.Statistics", escalationsInfoStatistics);
		}
	}

	public String getEscalationsInfoComparisonOperator() {
		return this.escalationsInfoComparisonOperator;
	}

	public void setEscalationsInfoComparisonOperator(String escalationsInfoComparisonOperator) {
		this.escalationsInfoComparisonOperator = escalationsInfoComparisonOperator;
		if(escalationsInfoComparisonOperator != null){
			putQueryParameter("Escalations.Info.ComparisonOperator", escalationsInfoComparisonOperator);
		}
	}

	public Integer getSilenceTime() {
		return this.silenceTime;
	}

	public void setSilenceTime(Integer silenceTime) {
		this.silenceTime = silenceTime;
		if(silenceTime != null){
			putQueryParameter("SilenceTime", silenceTime.toString());
		}
	}

	public String getResources() {
		return this.resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
		if(resources != null){
			putQueryParameter("Resources", resources);
		}
	}

	public Integer getEscalationsInfoTimes() {
		return this.escalationsInfoTimes;
	}

	public void setEscalationsInfoTimes(Integer escalationsInfoTimes) {
		this.escalationsInfoTimes = escalationsInfoTimes;
		if(escalationsInfoTimes != null){
			putQueryParameter("Escalations.Info.Times", escalationsInfoTimes.toString());
		}
	}

	public Integer getEscalationsCriticalTimes() {
		return this.escalationsCriticalTimes;
	}

	public void setEscalationsCriticalTimes(Integer escalationsCriticalTimes) {
		this.escalationsCriticalTimes = escalationsCriticalTimes;
		if(escalationsCriticalTimes != null){
			putQueryParameter("Escalations.Critical.Times", escalationsCriticalTimes.toString());
		}
	}

	public String getEscalationsWarnStatistics() {
		return this.escalationsWarnStatistics;
	}

	public void setEscalationsWarnStatistics(String escalationsWarnStatistics) {
		this.escalationsWarnStatistics = escalationsWarnStatistics;
		if(escalationsWarnStatistics != null){
			putQueryParameter("Escalations.Warn.Statistics", escalationsWarnStatistics);
		}
	}

	public String getEscalationsInfoThreshold() {
		return this.escalationsInfoThreshold;
	}

	public void setEscalationsInfoThreshold(String escalationsInfoThreshold) {
		this.escalationsInfoThreshold = escalationsInfoThreshold;
		if(escalationsInfoThreshold != null){
			putQueryParameter("Escalations.Info.Threshold", escalationsInfoThreshold);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getEscalationsCriticalComparisonOperator() {
		return this.escalationsCriticalComparisonOperator;
	}

	public void setEscalationsCriticalComparisonOperator(String escalationsCriticalComparisonOperator) {
		this.escalationsCriticalComparisonOperator = escalationsCriticalComparisonOperator;
		if(escalationsCriticalComparisonOperator != null){
			putQueryParameter("Escalations.Critical.ComparisonOperator", escalationsCriticalComparisonOperator);
		}
	}

	public static class Labels {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<PutResourceMetricRuleResponse> getResponseClass() {
		return PutResourceMetricRuleResponse.class;
	}

}
