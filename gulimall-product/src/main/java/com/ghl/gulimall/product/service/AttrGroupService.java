package com.ghl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ghl.common.utils.PageUtils;
import com.ghl.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author ghl
 * @email 1294719673@qq.com
 * @date 2020-06-05 13:36:07
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

