package com.dao;

import com.entity.MianshijieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MianshijieguoVO;
import com.entity.view.MianshijieguoView;


/**
 * 面试结果
 * 
 * @author 
 * @email 
 * @date 2025-04-17 21:45:52
 */
public interface MianshijieguoDao extends BaseMapper<MianshijieguoEntity> {
	
	List<MianshijieguoVO> selectListVO(@Param("ew") Wrapper<MianshijieguoEntity> wrapper);
	
	MianshijieguoVO selectVO(@Param("ew") Wrapper<MianshijieguoEntity> wrapper);
	
	List<MianshijieguoView> selectListView(@Param("ew") Wrapper<MianshijieguoEntity> wrapper);

	List<MianshijieguoView> selectListView(Pagination page,@Param("ew") Wrapper<MianshijieguoEntity> wrapper);

	
	MianshijieguoView selectView(@Param("ew") Wrapper<MianshijieguoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MianshijieguoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MianshijieguoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MianshijieguoEntity> wrapper);



}
