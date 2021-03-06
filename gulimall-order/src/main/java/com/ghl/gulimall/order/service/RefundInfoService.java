package com.ghl.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ghl.common.utils.PageUtils;
import com.ghl.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author ghl
 * @email 1294719673@qq.com
 * @date 2020-06-05 15:27:24
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

