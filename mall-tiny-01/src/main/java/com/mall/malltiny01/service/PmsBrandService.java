package com.mall.malltiny01.service;

import com.mall.malltiny01.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author 陈龙
 * @date 2021-01-01  16:23
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);


}
