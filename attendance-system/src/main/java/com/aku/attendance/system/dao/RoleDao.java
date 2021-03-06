package com.aku.attendance.system.dao;

import com.aku.attendance.common.model.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description:角色持久化处理 Created on 2019/3/19 0019 20:30
 *
 * @author <a href="mailto: Tablo_Jhin1996@outlook.com">Tablo</a>
 * @version 1.0
 */
@Mapper
public interface RoleDao extends BaseMapper<Role> {}
