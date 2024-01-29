package com.xcdval.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xcdval.common.utils.PageUtils;
import com.xcdval.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author xcdval
 * @email veenxx@outlook.com
 * @date 2024-01-29 21:02:55
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

