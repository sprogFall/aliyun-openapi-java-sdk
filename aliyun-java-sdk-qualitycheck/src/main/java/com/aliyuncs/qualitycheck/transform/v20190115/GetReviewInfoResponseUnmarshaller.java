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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.Dialogue;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.HitRuleReviewInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.HitRuleReviewInfo.ConditionHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.HitRuleReviewInfo.ConditionHitInfo.KeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.HitRuleReviewInfo.ConditionHitInfo.Phrase;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.HitRuleReviewInfo.ReviewInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.ScorePo;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.ScorePo.ScoreParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetReviewInfoResponseUnmarshaller {

	public static GetReviewInfoResponse unmarshall(GetReviewInfoResponse getReviewInfoResponse, UnmarshallerContext _ctx) {
		
		getReviewInfoResponse.setRequestId(_ctx.stringValue("GetReviewInfoResponse.RequestId"));
		getReviewInfoResponse.setCode(_ctx.stringValue("GetReviewInfoResponse.Code"));
		getReviewInfoResponse.setMessage(_ctx.stringValue("GetReviewInfoResponse.Message"));
		getReviewInfoResponse.setSuccess(_ctx.booleanValue("GetReviewInfoResponse.Success"));

		Data data = new Data();
		data.setAudioURL(_ctx.stringValue("GetReviewInfoResponse.Data.AudioURL"));
		data.setHitNumber(_ctx.integerValue("GetReviewInfoResponse.Data.HitNumber"));
		data.setNextVid(_ctx.stringValue("GetReviewInfoResponse.Data.NextVid"));
		data.setPreVid(_ctx.stringValue("GetReviewInfoResponse.Data.PreVid"));
		data.setIsAudio(_ctx.booleanValue("GetReviewInfoResponse.Data.IsAudio"));
		data.setAsrWordsCount(_ctx.integerValue("GetReviewInfoResponse.Data.AsrWordsCount"));
		data.setAudio(_ctx.booleanValue("GetReviewInfoResponse.Data.Audio"));
		data.setTotalScore(_ctx.integerValue("GetReviewInfoResponse.Data.TotalScore"));
		data.setBusinessType(_ctx.integerValue("GetReviewInfoResponse.Data.BusinessType"));
		data.setFileMergeName(_ctx.stringValue("GetReviewInfoResponse.Data.FileMergeName"));
		data.setIsDeleted(_ctx.booleanValue("GetReviewInfoResponse.Data.IsDeleted"));
		data.setDeleted(_ctx.booleanValue("GetReviewInfoResponse.Data.Deleted"));
		data.setVid(_ctx.stringValue("GetReviewInfoResponse.Data.Vid"));
		data.setReviewNumber(_ctx.integerValue("GetReviewInfoResponse.Data.ReviewNumber"));

		List<String> manualScoreMappingList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetReviewInfoResponse.Data.ManualScoreMappingList.Length"); i++) {
			manualScoreMappingList.add(_ctx.stringValue("GetReviewInfoResponse.Data.ManualScoreMappingList["+ i +"]"));
		}
		data.setManualScoreMappingList(manualScoreMappingList);

		List<Dialogue> dialogues = new ArrayList<Dialogue>();
		for (int i = 0; i < _ctx.lengthValue("GetReviewInfoResponse.Data.Dialogues.Length"); i++) {
			Dialogue dialogue = new Dialogue();
			dialogue.setWords(_ctx.stringValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].Words"));
			dialogue.setIdentity(_ctx.stringValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].Identity"));
			dialogue.setBegin(_ctx.longValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].Begin"));
			dialogue.setBeginTime(_ctx.stringValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].BeginTime"));
			dialogue.setEmotionValue(_ctx.integerValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].EmotionValue"));
			dialogue.setEnd(_ctx.longValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].End"));
			dialogue.setSpeechRate(_ctx.integerValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].SpeechRate"));
			dialogue.setRole(_ctx.stringValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].Role"));
			dialogue.setSilenceDuration(_ctx.integerValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].SilenceDuration"));
			dialogue.setHourMinSec(_ctx.stringValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].HourMinSec"));

			dialogues.add(dialogue);
		}
		data.setDialogues(dialogues);

		List<ScorePo> handScoreInfoList = new ArrayList<ScorePo>();
		for (int i = 0; i < _ctx.lengthValue("GetReviewInfoResponse.Data.HandScoreInfoList.Length"); i++) {
			ScorePo scorePo = new ScorePo();
			scorePo.setScoreId(_ctx.longValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreId"));
			scorePo.setScoreName(_ctx.stringValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreName"));

			List<ScoreParam> scoreInfos = new ArrayList<ScoreParam>();
			for (int j = 0; j < _ctx.lengthValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos.Length"); j++) {
				ScoreParam scoreParam = new ScoreParam();
				scoreParam.setScoreSubName(_ctx.stringValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubName"));
				scoreParam.setScoreNum(_ctx.integerValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreNum"));
				scoreParam.setHit(_ctx.integerValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].Hit"));
				scoreParam.setScoreSubId(_ctx.longValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubId"));
				scoreParam.setScoreType(_ctx.integerValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreType"));

				scoreInfos.add(scoreParam);
			}
			scorePo.setScoreInfos(scoreInfos);

			handScoreInfoList.add(scorePo);
		}
		data.setHandScoreInfoList(handScoreInfoList);

		List<HitRuleReviewInfo> hitRuleReviewInfoList = new ArrayList<HitRuleReviewInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList.Length"); i++) {
			HitRuleReviewInfo hitRuleReviewInfo = new HitRuleReviewInfo();
			hitRuleReviewInfo.setRuleScoreType(_ctx.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].RuleScoreType"));
			hitRuleReviewInfo.setRuleType(_ctx.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].RuleType"));
			hitRuleReviewInfo.setAutoReview(_ctx.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].AutoReview"));
			hitRuleReviewInfo.setScoreSubId(_ctx.longValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreSubId"));
			hitRuleReviewInfo.setTotalNumber(_ctx.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].TotalNumber"));
			hitRuleReviewInfo.setScoreId(_ctx.longValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreId"));
			hitRuleReviewInfo.setRid(_ctx.longValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].Rid"));
			hitRuleReviewInfo.setRuleName(_ctx.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].RuleName"));

			ReviewInfo reviewInfo = new ReviewInfo();
			reviewInfo.setRid(_ctx.longValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.Rid"));
			reviewInfo.setHitId(_ctx.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.HitId"));
			hitRuleReviewInfo.setReviewInfo(reviewInfo);

			List<ConditionHitInfo> conditionHitInfoList = new ArrayList<ConditionHitInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList.Length"); j++) {
				ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

				List<String> cid = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid.Length"); k++) {
					cid.add(_ctx.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid["+ k +"]"));
				}
				conditionHitInfo.setCid(cid);

				Phrase phrase = new Phrase();
				phrase.setWords(_ctx.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Words"));
				phrase.setBegin(_ctx.longValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Begin"));
				phrase.setIdentity(_ctx.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Identity"));
				phrase.setPid(_ctx.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Pid"));
				phrase.setEmotionValue(_ctx.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.EmotionValue"));
				phrase.setEnd(_ctx.longValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.End"));
				phrase.setRole(_ctx.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Role"));
				conditionHitInfo.setPhrase(phrase);

				List<KeyWord> keyWords = new ArrayList<KeyWord>();
				for (int k = 0; k < _ctx.lengthValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords.Length"); k++) {
					KeyWord keyWord = new KeyWord();
					keyWord.setTo(_ctx.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].To"));
					keyWord.setFrom(_ctx.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].From"));
					keyWord.setVal(_ctx.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Val"));
					keyWord.setTid(_ctx.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Tid"));
					keyWord.setPid(_ctx.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Pid"));

					keyWords.add(keyWord);
				}
				conditionHitInfo.setKeyWords(keyWords);

				conditionHitInfoList.add(conditionHitInfo);
			}
			hitRuleReviewInfo.setConditionHitInfoList(conditionHitInfoList);

			hitRuleReviewInfoList.add(hitRuleReviewInfo);
		}
		data.setHitRuleReviewInfoList(hitRuleReviewInfoList);
		getReviewInfoResponse.setData(data);
	 
	 	return getReviewInfoResponse;
	}
}