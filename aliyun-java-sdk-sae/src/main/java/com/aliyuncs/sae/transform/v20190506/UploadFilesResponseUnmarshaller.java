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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.UploadFilesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadFilesResponseUnmarshaller {

	public static UploadFilesResponse unmarshall(UploadFilesResponse uploadFilesResponse, UnmarshallerContext _ctx) {
		
		uploadFilesResponse.setRequestId(_ctx.stringValue("UploadFilesResponse.RequestId"));
		uploadFilesResponse.setMessage(_ctx.stringValue("UploadFilesResponse.Message"));
		uploadFilesResponse.setTraceId(_ctx.stringValue("UploadFilesResponse.TraceId"));
		uploadFilesResponse.setData(_ctx.stringValue("UploadFilesResponse.Data"));
		uploadFilesResponse.setErrorCode(_ctx.stringValue("UploadFilesResponse.ErrorCode"));
		uploadFilesResponse.setCode(_ctx.stringValue("UploadFilesResponse.Code"));
		uploadFilesResponse.setSuccess(_ctx.booleanValue("UploadFilesResponse.Success"));
	 
	 	return uploadFilesResponse;
	}
}