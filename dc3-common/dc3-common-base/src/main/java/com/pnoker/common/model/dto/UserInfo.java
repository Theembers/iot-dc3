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

package com.pnoker.common.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>commit('SET_ROLES', data)
 *  * commit('SET_NAME', data)
 *  * commit('SET_AVATAR', data)
 *  * commit('SET_INTRODUCTION', data)
 *  * commit('SET_PERMISSIONS', data)
 *
 * @author : pnoker
 * @email : pnokers@icloud.com
 */
@Data
public class UserInfo implements Serializable {
    /**
     * 用户基本信息
     */
    private SysUser sysUser;
    /**
     * 权限标识集合
     */
    private String[] permissions;

    /**
     * 角色集合
     */
    private Integer[] roles;
}
