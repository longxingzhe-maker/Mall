package com.mall.malltiny01.service.impl;

import com.github.pagehelper.PageHelper;
import com.mall.malltiny01.mbg.mapper.PmsBrandMapper;
import com.mall.malltiny01.mbg.model.PmsBrand;
import com.mall.malltiny01.mbg.model.PmsBrandExample;
import com.mall.malltiny01.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 陈龙
 * @date 2021-01-01  15:25
 */
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
