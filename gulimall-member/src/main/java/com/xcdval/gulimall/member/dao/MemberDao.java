package com.xcdval.gulimall.member.dao;

import com.xcdval.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xcdval
 * @email veenxx@outlook.com
 * @date 2024-01-30 09:17:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
