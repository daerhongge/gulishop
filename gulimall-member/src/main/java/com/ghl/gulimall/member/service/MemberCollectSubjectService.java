package com.ghl.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ghl.common.utils.PageUtils;
import com.ghl.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author ghl
 * @email 1294719673@qq.com
 * @date 2020-06-05 15:32:55
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

