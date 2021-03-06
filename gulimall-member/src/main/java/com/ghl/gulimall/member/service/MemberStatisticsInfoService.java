package com.ghl.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ghl.common.utils.PageUtils;
import com.ghl.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author ghl
 * @email 1294719673@qq.com
 * @date 2020-06-05 15:32:55
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

