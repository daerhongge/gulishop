package com.ghl.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ghl.common.utils.PageUtils;
import com.ghl.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author ghl
 * @email 1294719673@qq.com
 * @date 2020-06-05 15:38:09
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

