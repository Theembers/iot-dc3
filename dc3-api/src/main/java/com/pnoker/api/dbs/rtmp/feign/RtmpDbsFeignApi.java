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

package com.pnoker.api.dbs.rtmp.feign;

import com.github.pagehelper.PageInfo;
import com.pnoker.api.dbs.rtmp.hystrix.RtmpDbsFeignApiHystrix;
import com.pnoker.common.model.domain.rtmp.Rtmp;
import com.pnoker.common.model.dto.Response;
import com.pnoker.common.model.dto.rtmp.RtmpDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *
 * @author : pnoker
 * @email : pnokers@icloud.com
 */
@FeignClient(name = "DC3-DBS", fallbackFactory = RtmpDbsFeignApiHystrix.class)
@RequestMapping(value = "/api/v3/dbs/rtmp")
public interface RtmpDbsFeignApi {

    /**
     * 新增 新增 Rtmp 任务记录
     *
     * @param rtmp
     * @return true/false
     */
    @PostMapping("/")
    Response<Long> add(Rtmp rtmp);

    /**
     * 删除 根据 ID 删除 Rtmp
     *
     * @param id rtmpId
     * @return true/false
     */
    @DeleteMapping("/id/{id}")
    Response<Boolean> delete(@PathVariable Long id);

    /**
     * 修改 修改 Rtmp 任务记录
     *
     * @param rtmp
     * @return true/false
     */
    @PutMapping("/")
    Response<Boolean> update(Rtmp rtmp);

    /**
     * 查询 根据ID查询 Rtmp
     *
     * @param id
     * @return rtmp
     */
    @GetMapping("/id/{id}")
    Response<Rtmp> selectById(@PathVariable Long id);

    /**
     * 分页查询 按照查询 Rtmp
     *
     * @param rtmpDto
     * @return rtmpList
     */
    @GetMapping("/")
    Response<PageInfo<Rtmp>> list(RtmpDto rtmpDto);
}
