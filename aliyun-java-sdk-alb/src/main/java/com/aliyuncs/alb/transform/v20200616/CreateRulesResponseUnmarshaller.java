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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.CreateRulesResponse;
import com.aliyuncs.alb.model.v20200616.CreateRulesResponse.RuleId;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRulesResponseUnmarshaller {

	public static CreateRulesResponse unmarshall(CreateRulesResponse createRulesResponse, UnmarshallerContext _ctx) {
		
		createRulesResponse.setRequestId(_ctx.stringValue("CreateRulesResponse.RequestId"));
		createRulesResponse.setJobId(_ctx.stringValue("CreateRulesResponse.JobId"));

		List<RuleId> ruleIds = new ArrayList<RuleId>();
		for (int i = 0; i < _ctx.lengthValue("CreateRulesResponse.RuleIds.Length"); i++) {
			RuleId ruleId = new RuleId();
			ruleId.setRuleId(_ctx.stringValue("CreateRulesResponse.RuleIds["+ i +"].RuleId"));
			ruleId.setPriority(_ctx.integerValue("CreateRulesResponse.RuleIds["+ i +"].Priority"));

			ruleIds.add(ruleId);
		}
		createRulesResponse.setRuleIds(ruleIds);
	 
	 	return createRulesResponse;
	}
}