package com.xcdval.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xcdval.common.utils.PageUtils;
import com.xcdval.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author xcdval
 * @email veenxx@outlook.com
 * @date 2024-01-29 21:37:20
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

