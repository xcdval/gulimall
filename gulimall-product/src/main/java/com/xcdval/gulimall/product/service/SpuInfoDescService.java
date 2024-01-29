package com.xcdval.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xcdval.common.utils.PageUtils;
import com.xcdval.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author xcdval
 * @email veenxx@outlook.com
 * @date 2024-01-29 21:37:20
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

