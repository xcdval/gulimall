package com.xcdval.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xcdval.common.utils.PageUtils;
import com.xcdval.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author xcdval
 * @email veenxx@outlook.com
 * @date 2024-01-29 21:37:20
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

