package com.sy.service.ggy;

import com.sy.model.ggy.Au_function;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Au_functionService {
    //根据登录用户roleId获取用户权限functionId在和菜单parentId同时获取Au_function
    String findByIdAndparentId(Long roleId) throws Exception;
}
