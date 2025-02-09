/*
 * Copyright 2019 Pnoker. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pnoker.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.pnoker.common.security.component.Auth2ExceptionSerializer;
import org.springframework.http.HttpStatus;
/**
 * <p>
 *
 * @author : pnoker
 * @email : pnokers@icloud.com
 */
@JsonSerialize(using = Auth2ExceptionSerializer.class)
public class UnauthorizedException extends PigAuth2Exception {

	public UnauthorizedException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "unauthorized";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.UNAUTHORIZED.value();
	}

}
