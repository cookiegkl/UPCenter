package com.postbox.mapper;

import com.postbox.vo.BoxGroupVo;

import java.util.List;
import java.util.Map;

public interface BoxGroupMapperExt extends BoxGroupMapper {
    /**
     * 查询符合条件的箱子组数据总数
     * @param params
     * @return
     */
    int countAsList(Map<String, Object> params);
    
    /**
     * 根据条件查询箱子组数据
     * @param params
     * @return
     */
    List<BoxGroupVo> selectAsList(Map<String, Object> params);
}